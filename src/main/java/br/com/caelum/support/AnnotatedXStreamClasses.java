package br.com.caelum.support;

import br.com.caelum.cadastro.modelo.Aluno;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class AnnotatedXStreamClasses {
	private Class<?>[] types = {Aluno.class};
	
	public Class<?>[] getTypes() {
		return types;
	}
}
