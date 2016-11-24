package agenda.web.publico;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import agenda.modelo.contato.Contato;
import agenda.modelo.contato.ContatoRN;

@ManagedBean(name = "entradaBean")
@RequestScoped
public class EntradaBean {

	@SuppressWarnings("unused")
	private List<Contato> listaContatos = new ArrayList<Contato>();

	public List<Contato> getListaContatos() {

		ContatoRN contatoRN = new ContatoRN();

		return contatoRN.listar();
	}

}
