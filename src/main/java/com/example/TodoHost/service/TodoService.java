package com.example.TodoHost.service;

import com.example.TodoHost.dao.TodoRepo;
import com.example.TodoHost.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepo todoRepo;
    public void addTodo(Todo todo) {
        todoRepo.save(todo);
    }

    public List<Todo> getAll() {
        return todoRepo.findAll();
    }
}
