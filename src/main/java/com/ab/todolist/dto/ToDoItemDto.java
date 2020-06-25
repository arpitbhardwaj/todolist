package com.ab.todolist.dto;

/**
 * @author Arpit Bhardwaj
 */
public class ToDoItemDto {
    private String name;
    private boolean complete;

    public ToDoItemDto(String name, boolean complete) {
        this.name = name;
        this.complete = complete;
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return complete;
    }
}
