package com.ab.todolist.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 */

@Entity
@Table(name = "TODO_LIST")
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_list_id")
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "todo_list_id")
    private List<ToDoItem> items = new ArrayList<>();

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ToDoItem> getItems() {
        return items;
    }

    public void setItems(List<ToDoItem> items) {
        this.items = items;
    }

    public void addToDoItem(ToDoItem item){
        this.items.add(item);
    }
}
