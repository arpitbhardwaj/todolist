package com.ab.todolist.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public class ToDoListDto {

    private String name;

    private List<ToDoItemDto> items = new ArrayList<>();

    public ToDoListDto(String name, List<ToDoItemDto> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public List<ToDoItemDto> getItems() {
        return items;
    }

    public void addToDoItem(ToDoItemDto item){
        this.items.add(item);
    }
}
