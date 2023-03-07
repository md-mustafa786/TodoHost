package com.example.TodoHost.controller;

import com.example.TodoHost.model.Todo;
import com.example.TodoHost.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/save")
    public ResponseEntity<String> savetodo(@RequestBody Todo todo){
        todoService.addTodo(todo);
        return new ResponseEntity<>("saved",HttpStatus.ACCEPTED);
    }

    @GetMapping("get-all")
    public List<Todo> getAll(){
      return todoService.getAll();
    }

}
