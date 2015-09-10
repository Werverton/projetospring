package br.com.senai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "publicacao")
public class Publicacao extends EntidadeBase<Long>{

	private static final long serialVersionUID = 1L;
	@Column(name= "titulopub" , length = 100, nullable = true)
	private String tituloPub;
	@Column(name= "descricao" , length = 500, nullable = true)
	private String descricao;
	
	//@OneToOne
	//private int IdAluno;
	
	//@OneToOne
	//private int IdProfessor;
	
	
	
	
	public String getTituloPub() {
		return tituloPub;
	}
	public void setTituloPub(String tituloPub) {
		this.tituloPub = tituloPub;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	public int getIdAluno() {
		return IdAluno;
	}
	public void setIdAluno(int idAluno) {
		IdAluno = idAluno;
	}
	public int getIdProfessor() {
		return IdProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		IdProfessor = idProfessor;
	}
	**/
	
}
