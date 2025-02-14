package com.mafra.helpdesk.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mafra.helpdesk.domain.enums.Perfil;

import com.mafra.helpdesk.dtos.ClienteDTO;
import com.mafra.helpdesk.dtos.TecnicoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Entity
public class Cliente extends Pessoa{

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	private List<Chamado> chamados = new ArrayList<>();

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}

	public Cliente() {
		super();
		addPerfil(Perfil.CLIENTE);
	}

	public Cliente(ClienteDTO obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.cpf = obj.getCpf();
		this.email = obj.getEmail();
		this.senha = obj.getSenha();
		this.perfis = obj.getPerfis().stream().map(x -> x.getCodigo()).collect(Collectors.toUnmodifiableSet());
		this.dataCriacao = obj.getDataCriacao();
	}

	public Cliente(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
		addPerfil(Perfil.CLIENTE);
	}
	
}
