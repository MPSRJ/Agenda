package agenda.modelo.contato;

import java.util.List;

import org.hibernate.Criteria;
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



	@SuppressWarnings("unchecked")
	@Override
	public List<Contato> listar() {
		
		Criteria crit = session.createCriteria(Contato.class);
				
		return crit.list();
		
	}

}
