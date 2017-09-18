package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Todos;

public interface TodosRepository extends JpaRepository<Todos, Integer> {}
