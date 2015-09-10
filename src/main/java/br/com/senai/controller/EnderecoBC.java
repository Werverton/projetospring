package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.senai.model.Endereco;
import br.com.senai.model.repository.IEnderecoDAO;

@Controller
public class EnderecoBC {
	@Autowired
	IEnderecoDAO dao;
	
	public Endereco salvarEndereco(Endereco endereco){
		return dao.save(endereco);
	}
	
	public void excluirEndereco(Endereco endereco){
		dao.delete(endereco);
	}
	
	public List<Endereco> listarEndereco(){
		return dao.findAll();
	}
	
	

}
