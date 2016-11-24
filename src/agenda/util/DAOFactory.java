package agenda.util;

import agenda.modelo.contato.ContatoDAO;
import agenda.modelo.contato.ContatoDAOHibernate;

public class DAOFactory {

	public static ContatoDAO criaContatoDAO() {
		
		ContatoDAOHibernate contatoDAO = new ContatoDAOHibernate();
		
		contatoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		
		return contatoDAO;
	}

	
	
}
