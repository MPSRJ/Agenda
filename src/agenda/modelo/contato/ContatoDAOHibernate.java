package agenda.modelo.contato;

import org.hibernate.Session;

public class ContatoDAOHibernate implements ContatoDAO{
	
	private Session session;
	


	public void setSession(Session session) {
		this.session = session;
	}



	@Override
	public void salvar(Contato contato) {
		session.saveOrUpdate(contato);
		
	}

}
