package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Livros;

public interface LivrosRepository extends MongoRepository<Livros, String> {

	List<Livros> findByNome(String autor);

	List<Livros> findByNomeContains(String nome);

	
   
	
	
	
}
