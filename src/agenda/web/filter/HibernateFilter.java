
package agenda.web.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.SessionFactory;

import agenda.util.HibernateUtil;

/**
 * @author Marcelo Ponciano dos Santos
 *
 */
public class HibernateFilter implements Filter {

	private SessionFactory	sf;

	// Inicia a conex�o
	public void init(FilterConfig config) throws ServletException {
		this.sf = HibernateUtil.getSessionFactory();
	}

	public void destroy() {
	}

	// Filtra as requisi��es, controla as transa��es
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws ServletException {

		try {

			this.sf.getCurrentSession().beginTransaction();

			chain.doFilter(servletRequest, servletResponse);

			this.sf.getCurrentSession().getTransaction().commit();
			this.sf.getCurrentSession().close();

		} catch (Throwable ex) {
			try {
				if (this.sf.getCurrentSession().getTransaction().isActive()) {
					this.sf.getCurrentSession().getTransaction().rollback();
				}
			} catch (Throwable t) {
				t.printStackTrace();
			}
			throw new ServletException(ex);
		}
	}

}
