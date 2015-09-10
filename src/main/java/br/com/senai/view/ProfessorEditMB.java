package br.com.senai.view;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.Endereco;
import br.com.senai.model.Professor;
import br.com.senai.model.SexoEnum;
import br.com.senai.model.Telefone;
import br.com.senai.model.TipoPessoaEnum;
import br.com.senai.model.Titulacao;
import br.com.senai.support.Fachada;

@Scope(value=WebApplicationContext.SCOPE_REQUEST)
@Named(value="professorEditMB")
public class ProfessorEditMB {
	
	@Autowired
	private Fachada fachada;
	
	private Professor professor;

	
	@PostConstruct
	private void init(){
	
		professor = new Professor();
		professor.setTelefone(new Telefone());
		professor.setEndereco(new Endereco());
		professor.setTitulacao(new Titulacao());
	}
	
	
	public List<SexoEnum> getSexo() {
		return Arrays.asList(SexoEnum.values());
	}
	
	public List<TipoPessoaEnum> getTipo() {
		return Arrays.asList(TipoPessoaEnum.values());
	}
	
	
	
	public void preAlterar(Professor professor){
		setProfessor(professor);
	}
	
	public String salvar(){
		professor.setTelefone(fachada.salvarTelefone(professor.getTelefone()));
		professor.setEndereco(fachada.salvarEndereco(professor.getEndereco()));
		professor.setTitulacao(fachada.salvarTitulacao(professor.getTitulacao()));
		fachada.salvarProfessor(professor);
		
		return "success";
	}


	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


	

}
