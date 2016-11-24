package agenda.web.publico;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import agenda.modelo.contato.Contato;
import agenda.modelo.contato.ContatoRN;

@ManagedBean(name = "cadastroBean")
@RequestScoped
public class CadastroBean {

	private Contato contato = new Contato();

	public String salvar() {

		ContatoRN contatoRN = new ContatoRN();
		
	    contatoRN.salvar(contato);
		
		contato = new Contato();

		return "entrada?faces-redirect=true";
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
