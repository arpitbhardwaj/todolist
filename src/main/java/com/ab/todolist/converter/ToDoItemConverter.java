package com.ab.todolist.converter;

import com.ab.todolist.dto.ToDoItemDto;
import com.ab.todolist.model.ToDoItem;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


/**
 * @author Arpit Bhardwaj
 */

@Component
public class ToDoItemConverter implements Converter<ToDoItem, ToDoItemDto> {

    @Override
    public ToDoItemDto convert(ToDoItem item) {
        return new ToDoItemDto(item.getItem(), item.isComplete());
    }
}
