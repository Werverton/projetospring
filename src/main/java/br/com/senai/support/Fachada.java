package br.com.senai.support;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.senai.controller.AlunoBC;

import br.com.senai.controller.EnderecoBC;
import br.com.senai.controller.MeioComunicacaoBC;
import br.com.senai.controller.ProfessorBC;
import br.com.senai.controller.PublicacaoBC;
import br.com.senai.controller.TelefoneBC;
import br.com.senai.controller.TitulacaoBC;
import br.com.senai.controller.UsuarioBC;
import br.com.senai.model.Aluno;

import br.com.senai.model.Endereco;
import br.com.senai.model.MeioComunicacao;
import br.com.senai.model.Professor;
import br.com.senai.model.Publicacao;
import br.com.senai.model.Telefone;
import br.com.senai.model.Titulacao;
import br.com.senai.model.Usuario;

@Component
public class Fachada {

	@Autowired
	private UsuarioBC usuarioBC;
	
	@Autowired
	private MeioComunicacaoBC meiocomunicacaoBC;
	
	@Autowired
	private TitulacaoBC titulacaoBC;
	
	@Autowired
	private TelefoneBC telefoneBC;
	
	@Autowired
	private EnderecoBC enderecoBC;
	
	@Autowired
	private ProfessorBC professorBC;
	
	@Autowired
	private AlunoBC alunoBC;
	
	@Autowired
	private PublicacaoBC publicacaoBC;
	
	//Usuario
	public void salvarUsuario(Usuario usuario) {
		usuarioBC.salvarUsuario(usuario);
	}

	public void excluirUsuario(Usuario usuario) {
		usuarioBC.excluirUsuario(usuario);
	}

	public List<Usuario> listarUsuario() {
		return usuarioBC.listarUsuario();
	}
	
	//meioComunicação
	public void salvarMeioComunicacao(MeioComunicacao meiocomunicacao){
		meiocomunicacaoBC.salvarMeioComunicacao(meiocomunicacao);
	}
	
	public void excluirMeioComunicacao(MeioComunicacao meiocomunicacao){
		meiocomunicacaoBC.excluirMeioComunicacao(meiocomunicacao);
	}
	 
	public List<MeioComunicacao> listarMeioComunicacao(){
		return meiocomunicacaoBC.listarMeioComunicacao();
	}
	
	//titulacao
	
	public Titulacao salvarTitulacao(Titulacao titulacao){
		return titulacaoBC.salvarTitulacao(titulacao);
	}
	
	public void excluirTitulaca(Titulacao titulacao){
		titulacaoBC.excluirTitulacao(titulacao);
	}
	
	public List<Titulacao> listarTitulacao(){
		return titulacaoBC.listarTitulacao();
	}
	
	//telefone
	public Telefone salvarTelefone(Telefone telefone) {
		return telefoneBC.salvarTelefone(telefone);
	}
	
	public void excluirTelefone(Telefone telefone){
		telefoneBC.excluirTelefone(telefone);
	}
	
	public List<Telefone> listarTelefone(){
		return telefoneBC.listarTelefone();
	}
	
	//Endereco
	public Endereco salvarEndereco(Endereco endereco){
		return enderecoBC.salvarEndereco(endereco);
	}
	
	public void excluirEndereco(Endereco endereco){
		enderecoBC.excluirEndereco(endereco);
	}
	public List<Endereco> listarEndereco(){
		return enderecoBC.listarEndereco();
	}
	
	//Professor
	public void salvarProfessor(Professor  professor){
		professorBC.salvarProfessor(professor);;
	}
	
	public void excluirProfessor(Professor professor){
		professorBC.excluirProfessor(professor);
	}
	public List<Professor> listarProfessor(){
		return professorBC.listarProfessor();
	}

	//Aluno
	public void salvarAluno(Aluno aluno){
		alunoBC.salvarAluno(aluno);
	}
	
	public List<Aluno> listarAluno(){
		return alunoBC.listarAluno();
	}
	
	public void excluirAluno(Aluno aluno){
		alunoBC.excluirAluno(aluno);
	}
	//publicacao
	public void salvarPublicacao(Publicacao publicacao){
		publicacaoBC.salvarPublicacao(publicacao);
	}
	
	public List<Publicacao> listarPublicacao(){
		return publicacaoBC.listarPublicacao();
	}
	
	public void excluirPublicacao(Publicacao publicacao){
		publicacaoBC.excluirPublicacao(publicacao);
	}
	
	

}
