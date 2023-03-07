package com.example.TodoHost.dao;

import com.example.TodoHost.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Todo,Integer> {
}
