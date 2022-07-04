package com.example.demo.services;

import java.util.List;


import com.example.demo.model.Livros;

public interface LivrosService {

	public List<Livros> obterTodos();
	
	public Livros obterPorCodigo(String codigo);
	
	public Livros criar(Livros livro);
	
	public Livros atualizar(Livros livro);
	
	void remover(String id);

	public List<Livros> findByNomeContains(String nome);
	
	public List<Livros> findByNome(String autor);

	
	
}
