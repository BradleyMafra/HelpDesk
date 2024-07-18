package com.mafra.helpdesk.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mafra.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
