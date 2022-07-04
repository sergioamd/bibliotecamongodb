package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Editora;
import com.example.demo.repository.EditoraRepository;
import com.example.demo.services.EditoraService;

@Service
public class EditoraServiceImpl implements EditoraService {

	@Autowired
	private EditoraRepository editoraRepository;
	
	@Override
	public List<Editora> obterTodos() {
		// TODO Auto-generated method stub
		return this.editoraRepository.findAll();
	}

	@Override
	public Editora obterPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.editoraRepository.findById(codigo)
				.orElseThrow(() -> new IllegalArgumentException("funcioanrio não existe"));
	}

	@Override
	public Editora criar(Editora editora) {
		// TODO Auto-generated method stub
		return this.editoraRepository.save(editora);
	}
	
	@Override
	public Editora atualizar(Editora editora) {
		// TODO Auto-generated method stub
		return this.editoraRepository.save(editora);
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		this.editoraRepository.deleteById(id);
		
	}

}
