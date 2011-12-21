package br.com.caelum.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import br.com.caelum.cadastro.modelo.Aluno;

@XStreamAlias("alunos")
public class Alunos {
	
	@XStreamImplicit(itemFieldName="lista")//, keyFieldName="aluno")
	private List<Aluno> lista = new ArrayList<Aluno>();

	@Override
	public String toString() {
		return this.lista.toString();
	}
	
	public void addAlunos(List<Aluno> alunos) {
		this.lista.addAll(alunos);
	}
	
	public void setLista(List<Aluno> lista) {
		this.lista = lista;
	}
	
	public List<Aluno> getLista() {
		return lista;
	}
}