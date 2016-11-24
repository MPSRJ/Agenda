package agenda;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="entradaBean")
@SessionScoped
public class EntradaBean {
	
	

	
	
	public EntradaBean() {
		Contato contato1 = new Contato(), contato2 = new Contato();

		contato1.setNome("José Luis");
		contato1.setEndereco("Av Brasil, 123");
		
		contato2.setNome("Marcelo");
		contato2.setEndereco("Rua da Aurora, 485");
		
		listaContatos.add(contato1);
		listaContatos.add(contato2);
	}

	private List<Contato> listaContatos = new ArrayList<Contato>();

	public List<Contato> getListaContatos() {
		return listaContatos;
	}

	public void setListaContatos(List<Contato> listaContatos) {
		this.listaContatos = listaContatos;
	}

	
	
	


		

}
