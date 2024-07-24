package com.mafra.helpdesk.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mafra.helpdesk.domain.Tecnico;
import com.mafra.helpdesk.repositorys.TecnicoRepository;
import com.mafra.helpdesk.services.exceptions.ObjectnotFoundException;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException ("Objeto nao encontrado! Id: " + id));
	}
	
}
