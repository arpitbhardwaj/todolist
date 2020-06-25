package com.ab.todolist.service;

import com.ab.todolist.converter.ToDoListConverter;
import com.ab.todolist.dto.ToDoListDto;
import com.ab.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author Arpit Bhardwaj
 */

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    @Autowired
    private ToDoListConverter toDoListConverter;

    public List<ToDoListDto> getToDoLists(){
        return StreamSupport.stream(toDoRepository.findAll().spliterator(), false)
                .map(toDoListConverter::convert)
                .collect(Collectors.toList());
    }
}
