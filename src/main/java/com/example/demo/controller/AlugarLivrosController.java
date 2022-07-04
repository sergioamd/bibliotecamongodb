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

import com.example.demo.model.AluguelLivro;
import com.example.demo.services.AlugarLivrosServices;

@RestController
@RequestMapping("/alugar")
public class AlugarLivrosController {

	@Autowired
	private AlugarLivrosServices alugarServices;
	
	@GetMapping
	public List<AluguelLivro> obterTodos() {
		return this.alugarServices.obterTodos();
	}
	
	@GetMapping("/{codigo}")
	public AluguelLivro obterPorCodigo(@PathVariable String codigo) {
		return this.alugarServices.obterPorCodigo(codigo);
	}
	
	@PostMapping
	public AluguelLivro criar(@RequestBody AluguelLivro aluguel) {
		return this.alugarServices.criar(aluguel);
	}
	
	@PutMapping("/{codigo}")
	public AluguelLivro atualizar(@PathVariable(name = "id") String id, @RequestBody AluguelLivro aluguel) {
		return this.alugarServices.criar(aluguel);
	}
	
	@DeleteMapping("/{codigo}")
	public AluguelLivro delete(@PathVariable(name = "id")String id) {
		this.alugarServices.remover(id);
		return null;
		
		
	}
}
