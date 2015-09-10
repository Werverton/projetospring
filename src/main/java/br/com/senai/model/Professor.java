package br.com.senai.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor extends Pessoa{
	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name= "instensino", length = 30, nullable= false)
	private String InstEnsino;
	

	@Column(name = "dataadmissao", length = 14, nullable = true)
	private String dataAdmissao;
	
	@ManyToOne
	private Titulacao titulacao;
	
	public Professor(){
		super();
	}
	

	


	public Titulacao getTitulacao() {
		return titulacao;
	}





	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}





	public String getInstEnsino() {
		return InstEnsino;
	}

	public void setInstEnsino(String instEnsino) {
		InstEnsino = instEnsino;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	
	

}
