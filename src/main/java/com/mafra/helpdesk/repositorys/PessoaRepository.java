package com.mafra.helpdesk.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mafra.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
