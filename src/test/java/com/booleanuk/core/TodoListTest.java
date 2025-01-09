package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
//    @Test
//    public void exampleTest() {
//        String hello = "Hello";
//        Assertions.assertEquals("Hello", hello);
//        Assertions.assertNotEquals("Goodbye", hello);
//    }
    @Test
    public void canAddTask() {
        String name = "Study";
        TodoList todo = new TodoList();
        Assertions.assertTrue(todo.add(name));
    }

    @Test
    public void cannotAddDuplicateTasks() {
        TodoList todo = new TodoList();
        todo.add("Study");
        Assertions.assertFalse(todo.add("Study"));
    }
}
