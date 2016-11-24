package agenda.web.publico;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import agenda.modelo.contato.Contato;

@ManagedBean(name="entradaBean")
@SessionScoped
public class EntradaBean {
	
	

	private Contato contato = new Contato();
	
	private List<Contato> listaContatos = new ArrayList<Contato>();
	

	public EntradaBean() {
		Contato contato1 = new Contato(), contato2 = new Contato();

		contato1.setNome("José Luis");
		contato1.setEndereco("Av Brasil, 123");
		
		contato2.setNome("Marcelo");
		contato2.setEndereco("Rua da Aurora, 485");
		
		listaContatos.add(contato1);
		listaContatos.add(contato2);
	}

	public String salvar(){
		
		System.out.println("Salvando no banco de dados.......");
		
		listaContatos.add(contato);
		
		contato = new Contato();
		
		return "entrada?faces-redirect=true";
	}
	

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	

	public List<Contato> getListaContatos() {
		return listaContatos;
	}

	public void setListaContatos(List<Contato> listaContatos) {
		this.listaContatos = listaContatos;
	}

	
	
	


		

}
