package br.com.senai.model;





import java.util.List;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "aluno")
public class Aluno extends Pessoa{


	private static final long serialVersionUID = 1L;
	
	@Column(name= "matricula", nullable = false)
	private int matricula;
	
	//@ManyToOne
	//private Professor professor;
	
	
	public Aluno(){
		super();
	}
	


	public int getMatricula() {
		Random nr = new Random();
		 
		matricula = nr.nextInt();
		
		return matricula;
		
		
	}


	


	
	
	
	

	
	
	

}
