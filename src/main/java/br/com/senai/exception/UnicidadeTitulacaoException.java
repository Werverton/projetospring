package br.com.senai.exception;

public class UnicidadeTitulacaoException extends Exception {

	@Override
	public String getMessage() {
		return "Ja existe uma Titulacao com este nome.";
	}

}
