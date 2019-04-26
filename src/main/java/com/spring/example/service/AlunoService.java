package com.spring.example.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.example.model.Aluno;
import com.spring.example.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired AlunoRepository alunoRepository;
	
	public List<Aluno> findAll(){
		return alunoRepository.findAll();
	}
	
	public Aluno findByCodigo(Integer codigo) {
		return alunoRepository.findById(codigo).orElse(null);
	}
	
	public Aluno findByNome(String nome) {
		return alunoRepository.findByNome(nome).orElse(null);
	}
}
