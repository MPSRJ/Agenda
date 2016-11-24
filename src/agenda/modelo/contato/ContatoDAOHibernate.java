package agenda.modelo.contato;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class ContatoDAOHibernate implements ContatoDAO{
	
	private Session session;
	


	public void setSession(Session session) {
		this.session = session;
	}



	@Override
	public void salvar(Contato contato) {
		session.saveOrUpdate(contato);
		
	}

	@Override
	public void excluir(Contato contato) {
		session.delete(contato);
		
	}

	@Override
	public Contato caregar(Integer codigo) {
		
		return  (Contato) session.load(Contato.class, codigo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contato> listar() {
		
		Criteria crit = session.createCriteria(Contato.class);
		
		crit.addOrder(Order.asc("nome"));
				
		return crit.list();
		
	}

}
