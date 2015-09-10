package br.com.senai.view;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.MeioComunicacao;

import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "meioComunicacaoEditMB")
public class MeioComunicacaoEditMB {
	
	
		@Autowired
		private Fachada fachada;

		private MeioComunicacao meiocomunicacao;

		@PostConstruct
		private void init() {
			meiocomunicacao = new MeioComunicacao();
		}

		public void preAlterar(MeioComunicacao meiocomunicacao) {
			setMeioComunicacao(meiocomunicacao);
		}

		public String salvar() {
			fachada.salvarMeioComunicacao(meiocomunicacao);
			return "success";
		}

		public MeioComunicacao getMeioComunicacao() {
			return meiocomunicacao;
		}

		public void setMeioComunicacao(MeioComunicacao meiocomunicacao) {
			this.meiocomunicacao = meiocomunicacao;
		}

	
}
