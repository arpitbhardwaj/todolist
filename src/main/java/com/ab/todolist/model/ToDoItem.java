package com.ab.todolist.model;

import javax.persistence.*;

/**
 * @author Arpit Bhardwaj
 */

@Entity
@Table(name = "TODO_ITEM")
public class ToDoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_item_id")
    private long id;

    @Column(nullable = false)
    private String item;

    @Column(nullable = false)
    private boolean complete;

    @ManyToOne
    @JoinColumn(name = "todo_list_id", insertable = false,updatable = false)
    private ToDoList toDoList;

    public long getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
