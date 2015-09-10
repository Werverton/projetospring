package br.com.senai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.Publicacao;

public interface IPublicacao extends JpaRepository<Publicacao, Long>{

}
