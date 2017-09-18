package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todos;
import com.example.demo.repository.TodosRepository;

@RestController
@RequestMapping(value = "/rest/todos")
public class TodosResource {
	
	 @Autowired
    TodosRepository todosRepository;
	 
	@GetMapping(value = "/all")
    public List<Todos> getAll() {
        return todosRepository.findAll();
    }

}
