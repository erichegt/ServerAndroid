package br.com.caelum.controllers;

import java.util.List;

import br.com.caelum.cadastro.modelo.Aluno;
import br.com.caelum.repositories.AlunoRepository;
import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.view.Results;

@Resource
public class AlunoController {

	private final Result result;
	private final AlunoRepository repository;
	private final Validator validator;
	
	AlunoController(Result result, AlunoRepository repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
	}
	
	@Post("/backup")
	@Consumes("application/json")
	public void backup(List<Aluno> list) {
		System.out.println(list);
//		result.use(Results.nothing());
		result.use(Results.json()).from(list).serialize();
	}
	
	@Get("/listaTodosAlunos")
	public void sync() {
		result.use(Results.json()).from(repository.findAll()).serialize();
	}
	
	@Get("/alunos")
	public List<Aluno> index() {
		return repository.findAll();
	}
	
	@Post("/alunos")
	public void create(Aluno aluno) {
		validator.validate(aluno);
		validator.onErrorUsePageOf(this).newAluno();
		repository.create(aluno);
		result.redirectTo(this).index();
	}
	
	@Get("/alunos/new")
	public Aluno newAluno() {
		return new Aluno();
	}
	
	@Put("/alunos")
	public void update(Aluno aluno) {
		validator.validate(aluno);
		validator.onErrorUsePageOf(this).edit(aluno);
		repository.update(aluno);
		result.redirectTo(this).index();
	}
	
	@Get("/alunos/{aluno.id}/edit")
	public Aluno edit(Aluno aluno) {
		return repository.find(aluno.getId());
	}

	@Get("/alunos/{aluno.id}")
	public Aluno show(Aluno aluno) {
		return repository.find(aluno.getId());
	}

	@Delete("/alunos/{aluno.id}")
	public void destroy(Aluno aluno) {
		repository.destroy(repository.find(aluno.getId()));
		result.redirectTo(this).index();  
	}
}