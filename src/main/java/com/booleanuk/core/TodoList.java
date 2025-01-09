package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class TodoList {
    Map<String, Boolean> todo = new HashMap<>();
    // <name, status>

    public boolean add(String name) {
        if (this.todo.containsKey(name)) {
            return false;
        }
        this.todo.put(name, false);
        return true;
    }

    public String listTasks() {
        return "There is nothing to do!";
    }
}
