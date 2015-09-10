package br.com.senai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "meiocomunicacao")
public class MeioComunicacao extends EntidadeBase<Long>{

	private static final long serialVersionUID = 1L;
	
	
	@Column(name= "descricao", length = 100, nullable= false)
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
