package com.mafra.helpdesk.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mafra.helpdesk.domain.enums.Perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;

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

	public Cliente(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);		addPerfil(Perfil.CLIENTE);
	}
	
}
