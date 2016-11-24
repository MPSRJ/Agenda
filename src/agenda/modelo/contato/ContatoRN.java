package agenda.modelo.contato;

import java.util.List;

import agenda.util.DAOFactory;

public class ContatoRN {

	private ContatoDAO contatoDAO;

	public ContatoRN() {

		this.contatoDAO = DAOFactory.criaContatoDAO();
	}

	public void salvar(Contato contato) {
		contatoDAO.salvar(contato);

	}

	public List<Contato> listar() {
		return contatoDAO.listar();
	}
}
