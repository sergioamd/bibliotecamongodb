package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DetalhesLivro;
import com.example.demo.model.Editora;
import com.example.demo.model.Livros;
import com.example.demo.repository.DetalhesLivroRepository;
import com.example.demo.repository.EditoraRepository;
import com.example.demo.repository.LivrosRepository;
import com.example.demo.services.LivrosService;

@Service
public class LivrosServiceImpl implements LivrosService{

	@Autowired
	private LivrosRepository livroRepository;
	
	@Autowired
	private EditoraRepository editoraRepository;
	
	@Autowired
	private DetalhesLivroRepository detalheRepository;

	
	@Override
	public List<Livros> obterTodos() {
		// TODO Auto-generated method stub
		return this.livroRepository.findAll();
	}

	@Override
	public Livros obterPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.livroRepository.findById(codigo)
				.orElseThrow(() -> new IllegalArgumentException("livro não existe"));
	}

	@Override
	public Livros criar(Livros livro) {
	   Editora edd = this.editoraRepository
			   .findById(livro.getEditora().getId())
			   .orElseThrow(() -> new IllegalArgumentException("livro inexistene"));
			   
	         livro.setEditora(edd);
	         
	 DetalhesLivro dl = this.detalheRepository
	  			.findById(livro.getDetalhes().getId())
	  			 .orElseThrow(() -> new IllegalArgumentException("Detalhes do livro não existem"));
	  			   
	  	         livro.setDetalhes(dl);     
	   
		return this.livroRepository.save(livro);
	}

	@Override
	public Livros atualizar(Livros livro) {
		// TODO Auto-generated method stub
		
		return this.livroRepository.save(livro);
	}

	@Override
	public void remover(String id) {
		this.livroRepository.deleteById(id);
		
		
	}

	public List<Livros> findByNomeContains(String nome) {
		// TODO Auto-generated method stub
		return this.livroRepository.findByNomeContains(nome);
	}
	
	public List<Livros> findByNome(String autor) {
		// TODO Auto-generated method stub
		return this.livroRepository.findByNome(autor);
	}


	

}
