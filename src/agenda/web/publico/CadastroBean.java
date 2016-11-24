package agenda.web.publico;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import agenda.modelo.contato.Contato;
import agenda.modelo.contato.ContatoRN;

@ManagedBean(name = "cadastroBean")
@RequestScoped
public class CadastroBean {

	static Logger logger = LoggerFactory.getLogger(CadastroBean.class);

	private Contato contato = new Contato();
	
	

	public String salvar() {

		try {
			
			ContatoRN contatoRN = new ContatoRN();

			contatoRN.salvar(contato);

			logger.info("Contato salvo com sucesso!");

		} catch (Exception e) {
			
			logger.error("Erro ao salvar o contato" , e.getMessage());
			
			e.printStackTrace();
		}

		contato = new Contato();

		return "/publico/entrada.jsf?faces-redirect=true";
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
