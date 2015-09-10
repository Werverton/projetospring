package br.com.senai.view;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.Aluno;
import br.com.senai.model.Endereco;
import br.com.senai.model.Professor;
import br.com.senai.model.SexoEnum;
import br.com.senai.model.Telefone;
import br.com.senai.model.TipoPessoaEnum;
import br.com.senai.support.Fachada;

@Scope(value= WebApplicationContext.SCOPE_REQUEST)
@Named(value = "alunoEditMB")
public class AlunoEditMB {
	
	@Autowired
	private Fachada fachada;
	
	private Aluno aluno;
	
	@PostConstruct
	private void init(){
		aluno = new Aluno();
		aluno.setTelefone(new  Telefone());
		aluno.setEndereco(new Endereco());
		//aluno.setProfessor(new Professor());
	}
	

	public List<SexoEnum> getSexo() {
		return Arrays.asList(SexoEnum.values());
	}
	
	public List<TipoPessoaEnum> getTipo() {
		return Arrays.asList(TipoPessoaEnum.values());
	}
	
	public String salvar(){
		aluno.setEndereco(fachada.salvarEndereco(aluno.getEndereco()));
		aluno.setTelefone(fachada.salvarTelefone(aluno.getTelefone()));
		
		
		fachada.salvarAluno(aluno);
		return "success";
	}
	
	public void preAlterar(Aluno aluno){
		setAluno(aluno);
	}


	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	

}
