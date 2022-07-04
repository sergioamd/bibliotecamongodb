package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class AluguelLivro {

	private String id;
	
	@DBRef
	private Livros livro;
		
	

	public Livros getLivro() {
		return livro;
	}


	public void setLivro(Livros livro) {
		this.livro = livro;
	}


	public AluguelLivro() {
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	


	
}
	
