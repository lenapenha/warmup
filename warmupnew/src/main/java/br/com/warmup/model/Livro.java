package br.com.warmup.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Livro implements Serializable{

	private static final long serialVersionUID = 7973878211728498396L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
	private String titulo;
	private String preco;
	private String descricao;
	
	private Livro() {
		super();
	}
	
	private Livro(Livro livro) {
		this.titulo = livro.getTitulo();
		this.preco = livro.getPreco();
	}



	public static Livro of(Livro livro) {
		return new Livro(livro);
	}



	public Long getId() {
		return id;
	}



	public String getTitulo() {
		return titulo;
	}



	public String getPreco() {
		return preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
