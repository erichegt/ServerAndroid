package br.com.caelum.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.cadastro.modelo.Aluno;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class AlunoRepositoryImpl
    extends Repository<Aluno, Long>
    implements AlunoRepository {

	AlunoRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
