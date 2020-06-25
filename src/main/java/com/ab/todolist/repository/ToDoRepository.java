package com.ab.todolist.repository;

import com.ab.todolist.model.ToDoList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Arpit Bhardwaj
 */

@Repository
public interface ToDoRepository extends CrudRepository<ToDoList, Long> {
}
