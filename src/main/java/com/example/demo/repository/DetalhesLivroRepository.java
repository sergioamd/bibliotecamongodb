package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.DetalhesLivro;

public interface DetalhesLivroRepository extends MongoRepository<DetalhesLivro, String> {

}
