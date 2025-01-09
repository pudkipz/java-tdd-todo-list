package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoList {
    private Map<String, Boolean> todo = new HashMap<>();
    // <name, status>

    public boolean add(String name) {
        if (this.todo.containsKey(name)) {
            return false;
        }
        this.todo.put(name, false);
        return true;
    }

    public String listTasks() {
        if (todo.isEmpty())
            return "There is nothing to do!";

        StringBuilder sb = new StringBuilder();
        for (String s : todo.keySet()) {
            sb.append(s)
                    .append(": ")
                    .append(todo.get(s) ? "completed" : "uncompleted")
                    .append("\n");
        }
        return sb.toString();
    }

    public boolean updateTaskStatus(String name, boolean updatedStatus) {
        if (!todo.containsKey(name))
            return false;
        todo.replace(name, updatedStatus);
        return true;
    }

    public boolean getTaskStatus(String name) {
        if (!todo.containsKey(name))
            return false;
        return todo.get(name);
    }

    public boolean searchTask(String name) {
        return todo.containsKey(name);
    }

    public boolean removeTask(String name) {
        if (!todo.containsKey(name)) {
            return false;
        }
        todo.remove(name);
        return true;
    }

    public String taskDescending() {
        if (todo.isEmpty())
            return "There is nothing to do!";

        List<String> sortedKeys = todo.keySet().stream().sorted().toList();
        StringBuilder sb = new StringBuilder();
        for (String s : sortedKeys) {
            sb.append(s)
                    .append(": ")
                    .append(todo.get(s) ? "completed" : "uncompleted")
                    .append("\n");
        }
        return sb.toString();
    }

    public String taskAscending() {
        if (todo.isEmpty())
            return "There is nothing to do!";

        List<String> sortedKeys = todo.keySet().stream().sorted().toList().reversed();
        StringBuilder sb = new StringBuilder();
        for (String s : sortedKeys) {
            sb.append(s)
                    .append(": ")
                    .append(todo.get(s) ? "completed" : "uncompleted")
                    .append("\n");
        }
        return sb.toString();
    }

    public ArrayList<String> getCompletedTasks() {
        ArrayList<String> tasks = new ArrayList<>();
        for (String k : todo.keySet()) {
            if (todo.get(k)) {
                tasks.add(k);
            }
        }
        return tasks;
    }

    public ArrayList<String> getUncompletedTasks() {
        ArrayList<String> tasks = new ArrayList<>();
        for (String k : todo.keySet()) {
            if (!todo.get(k)) {
                tasks.add(k);
            }
        }
        return tasks;
    }
}
