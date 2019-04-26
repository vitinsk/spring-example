package com.spring.example.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Aluno {	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;   
    
	private String nome;
    
	private Integer idade;
    
	private String ra;	
    
    public Aluno() {}

	public Aluno(String nome, Integer idade, String ra) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.ra = ra;
	}
    
    
}
