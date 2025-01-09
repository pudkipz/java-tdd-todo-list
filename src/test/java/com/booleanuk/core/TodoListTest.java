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

    @Test
    public void emptyListShouldReturnError() {
        TodoList todo = new TodoList();
        Assertions.assertEquals("There is nothing to do!", todo.listTasks());
    }

    @Test
    public void nonemptyListShouldListAll() {
        TodoList todo = new TodoList();
        todo.add("Study");
        todo.add("Cook");
        todo.add("Sleep");
        Assertions.assertTrue(todo.listTasks().contains("Study: uncompleted"));
        Assertions.assertTrue(todo.listTasks().contains("Cook: uncompleted"));
        Assertions.assertTrue(todo.listTasks().contains("Sleep: uncompleted"));
    }

    @Test
    public void updateNonexistentTask() {
        TodoList todo = new TodoList();
        Assertions.assertFalse(todo.updateTaskStatus("Eat cake", true));
    }

    @Test
    public void updateTaskUpdatesTask() {
        TodoList todo = new TodoList();
        todo.add("Study");
        Assertions.assertFalse(todo.getTaskStatus("Study"));
        Assertions.assertTrue(todo.updateTaskStatus("Study", true));
        Assertions.assertTrue(todo.getTaskStatus("Study"));
    }

    @Test
    public void searchingWorksCorrectly() {
        TodoList todo = new TodoList();
        todo.add("Study");
        todo.add("Cook");
        todo.add("Sleep");
        Assertions.assertTrue(todo.searchTask("Study"));
        Assertions.assertTrue(todo.searchTask("Cook"));
        Assertions.assertTrue(todo.searchTask("Sleep"));
        Assertions.assertFalse(todo.searchTask("Tidy"));
    }
}
