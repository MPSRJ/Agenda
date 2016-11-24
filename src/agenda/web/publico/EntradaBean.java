package agenda.web.publico;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import agenda.modelo.contato.Contato;
import agenda.modelo.contato.ContatoRN;
import agenda.modelo.sexo.Sexo;

@ManagedBean(name = "entradaBean")
@ViewScoped
public class EntradaBean {

	@SuppressWarnings("unused")
	private List<Contato> listaContatos = new ArrayList<Contato>();
	
	private Sexo[] listaSexo;
	

	public List<Contato> getListaContatos() {

		ContatoRN contatoRN = new ContatoRN();

		return contatoRN.listar();
	}


	public Sexo[] getListaSexo() {
		listaSexo = Sexo.values();
		return listaSexo;
	}


	public void setListaSexo(Sexo[] listaSexo) {
		this.listaSexo = listaSexo;
	}


	


}
