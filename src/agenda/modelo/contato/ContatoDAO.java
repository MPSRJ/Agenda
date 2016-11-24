package agenda.modelo.contato;

import java.util.List;

public interface ContatoDAO {

	
	public void salvar(Contato contato);
	
	public void excluir(Contato contato);

	public Contato caregar(Integer codigo);
	
	public List<Contato> listar();
}
