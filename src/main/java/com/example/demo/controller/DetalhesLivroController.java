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

import com.example.demo.model.DetalhesLivro;
import com.example.demo.services.DetalhesLivroService;

@RestController
@RequestMapping("/detalhe")
public class DetalhesLivroController {

	@Autowired
	private DetalhesLivroService detalhesService;
	
	@GetMapping
	public List <DetalhesLivro> obterTodos(){
		return this.detalhesService.obterTodos();
	}
	
	@GetMapping("/{codigo}")
	public DetalhesLivro obterPorCodigo(@PathVariable String codigo) {
		return this.detalhesService.obterPorCodigo(codigo);
	}
	
	@PostMapping
	public DetalhesLivro criar(@RequestBody DetalhesLivro livro) {
		return this.detalhesService.criar(livro);
	}
	
	@PutMapping("/{codigo}")
	public DetalhesLivro atualizar(@RequestBody DetalhesLivro livro) {
		return this.detalhesService.criar(livro);
	}
	
	@DeleteMapping("/{codigo}")
	public DetalhesLivro delete(@PathVariable(name = "id")String id) {
		this.detalhesService.remover(id);
		return null;
	}
}
