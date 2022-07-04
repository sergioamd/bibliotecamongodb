package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AluguelLivro;
import com.example.demo.model.Livros;
import com.example.demo.repository.AlugarLivroRepository;
import com.example.demo.repository.LivrosRepository;
import com.example.demo.services.AlugarLivrosServices;

@Service
public class AlugarLivrosServiceImpl implements AlugarLivrosServices {


    
	@Autowired
	private AlugarLivroRepository alugarRepository;
	
	@Autowired 
	private LivrosRepository livrosRepository;
	
	@Autowired
	private LivrosServiceImpl livrosService;
	
	@Override
	public List<AluguelLivro> obterTodos() {
		// TODO Auto-generated method stub
		return this.alugarRepository.findAll();
	}

	@Override
	public AluguelLivro obterPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.alugarRepository.findById(codigo)
				.orElseThrow(() -> new IllegalArgumentException("Aluguel  não existe"));
	}

	@Override
	public AluguelLivro criar(AluguelLivro aluguel) {
		 
		Livros lvr = this.livrosRepository
				.findById(aluguel.getLivro().getId())
				.orElseThrow(() -> new IllegalArgumentException("livro inexistene"));
             
             if(!lvr.isAlugado() == false) { 
            	 aluguel.setLivro(lvr);
            	livrosService.atualizar(lvr); 
            	lvr.setAlugado(true);
            	//aluguel.setAlugado(true);
             }else {
            	 System.out.println("Livro alugado");
             }
             
		
		 return this.alugarRepository.save(aluguel);
	}

	@Override
	public AluguelLivro atualizar(AluguelLivro aluguel) {
		// TODO Auto-generated method stub
		return this.alugarRepository.save(aluguel);
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		this.alugarRepository.deleteById(id);
	}

}
