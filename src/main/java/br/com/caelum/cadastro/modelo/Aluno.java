package br.com.caelum.cadastro.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.thoughtworks.xstream.annotations.XStreamAlias;


@Entity
@XStreamAlias("aluno")
public class Aluno {
	@Id @GeneratedValue
	private long id;
	private String nome;
	private Double nota;
	private String telefone;
	private String site;
	private String endereco;
	
	@Override
	public String toString() {
		return "Nome: "+nome+" Nota:"+nota;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	public Double getNota() {
		return nota;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setSite(String site) {
		this.site = site;
	}
	
	public String getSite() {
		return site;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
}
