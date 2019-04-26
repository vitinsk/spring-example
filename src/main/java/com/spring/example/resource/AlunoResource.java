package com.spring.example.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.example.model.Aluno;
import com.spring.example.service.AlunoService;

@RestController
@RequestMapping("alunos")
public class AlunoResource {

	@Autowired AlunoService alunoService;
	
	@GetMapping
	private ResponseEntity<List<Aluno>> findAll(){
		return ResponseEntity.ok(alunoService.findAll());
	}
	
	@GetMapping("/{codigo}")
	private ResponseEntity<Aluno> findByCodigo(@PathVariable Integer codigo){
		return ResponseEntity.ok(alunoService.findByCodigo(codigo));
	}
	
	@GetMapping("/nome")
	private ResponseEntity<Aluno> findByCodigo(@RequestParam (value = "value") String nome){
		return ResponseEntity.ok(alunoService.findByNome(nome));
	}
}
	
	
