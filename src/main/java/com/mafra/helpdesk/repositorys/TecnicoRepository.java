package com.mafra.helpdesk.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mafra.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
