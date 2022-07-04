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

import com.example.demo.model.Editora;
import com.example.demo.services.EditoraService;

@RestController
@RequestMapping("/editora")
public class EditoraController {

	@Autowired
	private EditoraService editoraService;
	
	@GetMapping
	public List<Editora> obterTodos() {
		return this.editoraService.obterTodos();
	}
	
	@GetMapping("/{codigo}")
	public Editora obterPorCodigo(@PathVariable String codigo) {
		return this.editoraService.obterPorCodigo(codigo);
	}
	
	@PostMapping
	public Editora criar(@RequestBody Editora editora) {
		return this.editoraService.criar(editora);
	}
	
	@PutMapping("/{codigo}")
	public Editora atualizar(@RequestBody Editora editora) {
		return this.editoraService.criar(editora);
	}
	
	@DeleteMapping("/{codigo}")
	public Editora delete(@PathVariable(name = "id")String id) {
		this.editoraService.remover(id);
		return null;
		
		
	}
	
}
