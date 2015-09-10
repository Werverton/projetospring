package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;




import br.com.senai.model.MeioComunicacao;
import br.com.senai.model.repository.IMeioComunicacaoDAO;

@Controller
public class MeioComunicacaoBC {
	
	@Autowired
	private IMeioComunicacaoDAO dao;
	
	public void salvarMeioComunicacao(MeioComunicacao meiocomunicacao){
		dao.save(meiocomunicacao);
	}
	
	public void excluirMeioComunicacao(MeioComunicacao meiocomunicacao){
		dao.delete(meiocomunicacao);
	}
	
	public List<MeioComunicacao> listarMeioComunicacao(){
		return dao.findAll();
	}
	
}
