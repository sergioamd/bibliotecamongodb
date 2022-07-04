package com.example.demo.services;

import java.util.List;

import com.example.demo.model.DetalhesLivro;


public interface DetalhesLivroService {

public List<DetalhesLivro> obterTodos();
	
	public DetalhesLivro obterPorCodigo(String codigo);
	
	public DetalhesLivro criar(DetalhesLivro detalhe);
	
	public DetalhesLivro atualizar(DetalhesLivro detalhe);
	
	void remover(String id);

}
