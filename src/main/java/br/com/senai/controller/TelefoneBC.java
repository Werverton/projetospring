package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.senai.model.Telefone;
import br.com.senai.model.repository.ITelefoneDAO;

@Controller
public class TelefoneBC {
	
	@Autowired
	ITelefoneDAO dao;
	
	public Telefone salvarTelefone(Telefone telefone){
		return dao.save(telefone);
	}
	
	public void excluirTelefone(Telefone telefone){
		dao.delete(telefone);
	}
	
	public List<Telefone> listarTelefone(){
		return dao.findAll();
	}

}
