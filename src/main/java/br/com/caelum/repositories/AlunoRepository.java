package br.com.caelum.repositories;

import java.util.List;

import br.com.caelum.cadastro.modelo.Aluno;

public interface AlunoRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Aluno entity);
	
	Aluno update(Aluno entity);
	
	void destroy(Aluno entity);
	
	Aluno find(Long id);
	
	List<Aluno> findAll();

}
