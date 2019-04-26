package com.spring.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.example.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

	Optional<Aluno> findByNome(String nome);
}
