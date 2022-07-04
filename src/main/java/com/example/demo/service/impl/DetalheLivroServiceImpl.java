package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DetalhesLivro;
import com.example.demo.repository.DetalhesLivroRepository;
import com.example.demo.services.DetalhesLivroService;

@Service
public class DetalheLivroServiceImpl implements DetalhesLivroService {

	@Autowired
	private DetalhesLivroRepository detalhesRepository;
	
	@Override
	public List<DetalhesLivro> obterTodos() {
		// TODO Auto-generated method stub
		return this.detalhesRepository.findAll();
	}

	@Override
	public DetalhesLivro obterPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.detalhesRepository.findById(codigo)
				.orElseThrow(() -> new IllegalArgumentException("Detalhes não existem"));
	}

	@Override
	public DetalhesLivro criar(DetalhesLivro detalhe) {
		// TODO Auto-generated method stub
		return this.detalhesRepository.save(detalhe);
	}

	@Override
	public DetalhesLivro atualizar(DetalhesLivro detalhe) {
		// TODO Auto-generated method stub
		return this.detalhesRepository.save(detalhe);
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		this.detalhesRepository.deleteById(id);
	}

}
