package br.com.senai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.Telefone;

public interface ITelefoneDAO extends JpaRepository<Telefone, Long> {

}
