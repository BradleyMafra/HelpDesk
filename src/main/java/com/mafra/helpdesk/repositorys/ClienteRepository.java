package com.mafra.helpdesk.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mafra.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
