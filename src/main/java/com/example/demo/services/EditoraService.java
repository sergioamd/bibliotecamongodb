package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Editora;


public interface EditoraService {

	public List<Editora> obterTodos();
	
	public Editora obterPorCodigo(String codigo);
	
	public Editora criar(Editora editora);
	
	public Editora atualizar(Editora editora);
	
	void remover(String id);
}
