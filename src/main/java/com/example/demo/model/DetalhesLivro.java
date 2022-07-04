package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class DetalhesLivro {

	@Id
	private String id;
	private String capa;
	private Integer paginas;
	private String publico;
   
    
    
    public DetalhesLivro() {
    	
    }


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCapa() {
		return capa;
	}


	public void setCapa(String capa) {
		this.capa = capa;
	}


	public Integer getPaginas() {
		return paginas;
	}


	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}


	public String getPublico() {
		return publico;
	}


	public void setPublico(String publico) {
		this.publico = publico;
	}


	
    
    
    
}
