package br.com.senai.model;

public enum TipoPessoaEnum {
	PROFESSOR(1),
	ALUNO(2);
	
	private int valor;
	
	private  TipoPessoaEnum(int valor){
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}

	
}
