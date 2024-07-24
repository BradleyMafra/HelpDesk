package com.mafra.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mafra.helpdesk.domain.Chamado;
import com.mafra.helpdesk.domain.Cliente;
import com.mafra.helpdesk.domain.Tecnico;
import com.mafra.helpdesk.domain.enums.Perfil;
import com.mafra.helpdesk.domain.enums.Prioridade;
import com.mafra.helpdesk.domain.enums.Status;
import com.mafra.helpdesk.repositorys.ChamadoRepository;
import com.mafra.helpdesk.repositorys.ClienteRepository;
import com.mafra.helpdesk.repositorys.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired 
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Bradley Mafra", "12387154940", "bradley.mafra0909@gmail.com","senha123");

		
		
		Cliente cli1 = new Cliente(null, "Xaiane Cristóvão", "13452465950", "xaycris123@gmail.com", "senha321");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
