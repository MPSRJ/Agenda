package agenda.modelo.contato;

import java.util.List;

public interface ContatoDAO {

	
	public void salvar(Contato contato);

	public List<Contato> listar();
}
