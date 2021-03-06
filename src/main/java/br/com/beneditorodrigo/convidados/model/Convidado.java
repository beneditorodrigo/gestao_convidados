package br.com.beneditorodrigo.convidados.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Convidado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private int numeroConvidados;
	
	public Convidado() {
		
	}

	public Convidado(String nome, int numeroConvidados) {
		this.nome = nome;
		this.numeroConvidados = numeroConvidados;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConvidados() {
		return numeroConvidados;
	}

	public void setNumeroConvidados(int numeroConvidados) {
		this.numeroConvidados = numeroConvidados;
	}
}
