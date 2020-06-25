package com.ab.todolist.converter;

import com.ab.todolist.dto.ToDoItemDto;
import com.ab.todolist.dto.ToDoListDto;
import com.ab.todolist.model.ToDoItem;
import com.ab.todolist.model.ToDoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Arpit Bhardwaj
 */
@Component
public class ToDoListConverter implements Converter<ToDoList, ToDoListDto> {

    @Autowired
    private ToDoItemConverter toDoItemConverter;

    @Override
    public ToDoListDto convert(ToDoList toDoList) {

        List<ToDoItem> items = toDoList.getItems();

        List<ToDoItemDto> toDoItemDtos = items.stream()
                .map(toDoItemConverter::convert)
                .collect(Collectors.toList());

        return new ToDoListDto(toDoList.getName(), toDoItemDtos);
    }
}
