package com.booleanuk.extension;

public class Task {
    private static int nextId = 0;
    private int id;
    private boolean completed;
    private String name;

    public Task(String name) {
        completed = false;
        this.id = nextId;
        nextId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
