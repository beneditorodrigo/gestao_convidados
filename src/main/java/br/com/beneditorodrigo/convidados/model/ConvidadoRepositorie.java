package br.com.beneditorodrigo.convidados.model;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ConvidadoRepositorie
	extends PagingAndSortingRepository<Convidado, Long>{

}
