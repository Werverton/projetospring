package br.com.senai.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name= "endereco")
public class Endereco extends EntidadeBase<Long>{
	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="logradouro", length = 200, nullable = false)
	private String logradouro;
	@Column(name="bairro", length= 100, nullable= false)
	private String bairro;
	@Column(name="numero", length= 5, nullable=false)
	private int numero;
	
	@Enumerated(EnumType.STRING)
	@Column(name="cidade", length= 30, nullable= false)
	private Cidades cidade;
	@Column(name="UF")
	public final String UF = "PERNAMBUCO";
	

	
	public Cidades[] getCidades(){
		return Cidades.values();
	}
	

	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cidades getCidade() {
		return cidade;
	}
	public void setCidade(Cidades cidade) {
		this.cidade = cidade;
	}
	
	public String getUf() {
		return UF;
	}
	
	
	
}
