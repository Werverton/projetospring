package br.com.senai.model;

public enum SexoEnum {
	MASCULINO(1),
	FEMININO(2);

	private int valor;

	private SexoEnum(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}
	

}
