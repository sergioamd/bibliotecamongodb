package com.example.demo;

import java.awt.PageAttributes.MediaType;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.controller.LivrosController;
import com.example.demo.model.Livros;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LivroTest extends DemoApplicationTests{

	private MockMvc mockMvc;
	
	@Autowired
	private LivrosController livroController;
	
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(livroController).build();
	}
	
	@Test
	public void criarLivro_RetornarstatusCode201() throws JsonProcessingException {
		Livros livro = new Livros(null, "joao e maria", "maria", false);
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper.writeValueAsString(livro);
		
		this.mockMvc.perform(MockMvcRequestBuilders.post("/livros")
				    .contentType(MediaType.APPLICATION_JSON) 
				    .content(json)
				)
		.andExpect(MockMvcResultMatchers.status().isCreated())
		.andExpect(MockMvcResultMatchers.header().string("locations",
				Matchers.containsString("http://localhost/livros")));
	}
	
}
