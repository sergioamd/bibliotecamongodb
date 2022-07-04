package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Livros;
import com.example.demo.services.LivrosService;

@RestController
@RequestMapping("/livros")
public class LivrosController {

	@Autowired
	private LivrosService LivroService;
	
	@GetMapping
	public List<Livros> obterTodos() {
		return this.LivroService.obterTodos();
	}
	
	@GetMapping("/{codigo}")
	public Livros obterPorCodigo(@PathVariable String codigo) {
		return this.LivroService.obterPorCodigo(codigo);
	}
	
	@PostMapping
	public Livros criar(@RequestBody Livros livro) {
		return this.LivroService.criar(livro);
	}
	
	@PutMapping("/{codigo}")
	public Livros atualizar(@RequestBody Livros livro) {
		return this.LivroService.criar(livro);
	}
	
	@DeleteMapping("/{codigo}")
	public Livros delete(@PathVariable(name = "id")String id) {
		this.LivroService.remover(id);
		return null;
	}
	
	@GetMapping(value = "searchnew/{nome}")
	public List<Livros> findByNomeContains(@PathVariable String nome){
		return this.LivroService.findByNomeContains(nome);
	}
	
	@GetMapping(value = "autor/{autor}")
	public List<Livros> findByNome(@PathVariable String autor){
		return this.LivroService.findByNome(autor);
	}
	
	
	
}
