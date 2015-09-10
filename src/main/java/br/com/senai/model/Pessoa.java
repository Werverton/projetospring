package br.com.senai.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name= "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa extends EntidadeBase<Long> {
	

	private static final long serialVersionUID = 1L;

	@Column(name = "nome", length = 100, nullable = true)
	private String nome;
	
	@Column(name = "cpf", length = 14, nullable = true)
	private String cpf;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="sexo", nullable= false)
	private SexoEnum sexo;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="tipopessoa",  nullable= false)
	private TipoPessoaEnum tipopessoa;
	
	@ManyToOne
	private Telefone telefone;
	
	@ManyToOne
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}

	public TipoPessoaEnum getTipopessoa() {
		return tipopessoa;
	}

	public void setTipopessoa(TipoPessoaEnum tipopessoa) {
		this.tipopessoa = tipopessoa;
	}
	


	
	
	

}
