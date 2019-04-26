package com.spring.example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.example.model.Aluno;
import com.spring.example.repository.AlunoRepository;

@SpringBootApplication
public class SpringstarterApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringstarterApplication.class, args);
	}

	@Autowired AlunoRepository alunoRespository;
	
	@Override
	public void run(String... args) throws Exception {
		Aluno aluno1 = new Aluno("Vitor", 22, "41620798");
		Aluno aluno2 = new Aluno("Diego", 22, "41220578");
		Aluno aluno3 = new Aluno("Jonathan", 22, "42620587");
		Aluno aluno4 = new Aluno("Igor", 22, "42078987");
		
		alunoRespository.saveAll(Arrays.asList(aluno1,aluno2,aluno3,aluno4));
		
		
		
	}

}
