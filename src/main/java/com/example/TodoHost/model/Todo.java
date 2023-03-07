package com.example.TodoHost.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "todo_tbl")
public class Todo {
    @Id
    private Integer id;
    private String title;
    private boolean status;
}
