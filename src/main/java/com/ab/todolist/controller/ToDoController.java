package com.ab.todolist.controller;

import com.ab.todolist.dto.ToDoListDto;
import com.ab.todolist.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */

@RestController
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/lists")
    public List<ToDoListDto> getToDoLists(){
        return toDoService.getToDoLists();
    }
}
