package com.example.demo.services;

import java.util.List;

import com.example.demo.model.AluguelLivro;

public interface AlugarLivrosServices {
	
	public List<AluguelLivro> obterTodos();
    
	public AluguelLivro obterPorCodigo(String codigo);
	
	public AluguelLivro criar(AluguelLivro aluguel);
	
	public AluguelLivro atualizar(AluguelLivro aluguel);
	
	void remover(String id);
}
