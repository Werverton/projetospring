package br.com.senai.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefone")
public class Telefone extends EntidadeBase<Long>{
	

	private static final long serialVersionUID = 1L;
	@Column(name= "ddd" , length = 3, nullable = false)
	private int ddd;
	@Column(name="numtelefone", length = 10, nullable = false)
	private int numtelefone;
	
	public int getDDD() {
		return ddd;
	}

	public void setDDD(int ddd) {
		this.ddd = ddd;
	}

	public int getNumtelefone() {
		return numtelefone;
	}

	public void setNumtelefone(int numtelefone) {
		this.numtelefone = numtelefone;
	}
	
	

}
