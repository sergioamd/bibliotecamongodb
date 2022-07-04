package com.example.demo.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Livros {

	@Id
	private String id;
	private String nome;
	private String autor;
	private boolean alugado;
	
	
	
	
	public boolean isAlugado() {
		return alugado;
	}


	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}


	private DetalhesLivro detalhes;
	
	@DBRef
	private Editora editora;
	
	public Livros(Object object, String string, String string2, boolean b) {
		
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}


	public DetalhesLivro getDetalhes() {
		return detalhes;
	}


	public void setDetalhes(DetalhesLivro detalhes) {
		this.detalhes = detalhes;
	}


	public Editora getEditora() {
		return editora;
	}


	public void setEditora(Editora editora) {
		this.editora = editora;
	}


	/*public boolean isAlugado() {
		// TODO Auto-generated method stub
		return false;
	}


	public void setAlugado(boolean b) {
		// TODO Auto-generated method stub
		
	}*/


	
	
}

