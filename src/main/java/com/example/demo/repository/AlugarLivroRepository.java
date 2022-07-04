package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.AluguelLivro;

public interface AlugarLivroRepository extends MongoRepository<AluguelLivro, String> {

	
	
}
