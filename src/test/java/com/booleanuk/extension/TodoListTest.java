package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void canAddTask() {
        String name = "Study";
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        Assertions.assertTrue(todo.add(name));
    }

    @Test
    public void cannotAddDuplicateTasks() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("Study");
        Assertions.assertFalse(todo.add("Study"));
    }

    @Test
    public void emptyListShouldReturnError() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        Assertions.assertEquals("There is nothing to do!", todo.listTasks());
    }

    @Test
    public void nonemptyListShouldListAll() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("Study");
        todo.add("Cook");
        todo.add("Sleep");
        Assertions.assertTrue(todo.listTasks().contains("Study: uncompleted"));
        Assertions.assertTrue(todo.listTasks().contains("Cook: uncompleted"));
        Assertions.assertTrue(todo.listTasks().contains("Sleep: uncompleted"));
    }

    @Test
    public void updateNonexistentTask() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        Assertions.assertFalse(todo.updateTaskStatus("Eat cake", true));
    }

    @Test
    public void updateTaskUpdatesTask() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("Study");
        Assertions.assertFalse(todo.getTaskStatus("Study"));
        Assertions.assertTrue(todo.updateTaskStatus("Study", true));
        Assertions.assertTrue(todo.getTaskStatus("Study"));
    }

    @Test
    public void searchingWorksCorrectly() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("Study");
        todo.add("Cook");
        todo.add("Sleep");
        Assertions.assertTrue(todo.searchTask("Study"));
        Assertions.assertTrue(todo.searchTask("Cook"));
        Assertions.assertTrue(todo.searchTask("Sleep"));
        Assertions.assertFalse(todo.searchTask("Tidy"));
    }

    @Test
    public void cannotRemoveNonexistentTask() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        Assertions.assertFalse(todo.removeTask("Study"));
    }

    @Test
    public void removesTaskIfExists() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("Study");
        Assertions.assertTrue(todo.removeTask("Study"));
        Assertions.assertFalse(todo.searchTask("Study"));
    }

    @Test
    public void tasksAreDescending() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("Cook");
        todo.add("Eat");
        todo.add("Tidy up");
        Assertions.assertEquals(
                "Cook: uncompleted",
                todo.taskDescending().split("\n")[0]);
        Assertions.assertEquals(
                "Eat: uncompleted",
                todo.taskDescending().split("\n")[1]);
        Assertions.assertEquals(
                "Tidy up: uncompleted",
                todo.taskDescending().split("\n")[2]);
    }

    @Test
    public void tasksAreAscending() {
        com.booleanuk.core.TodoList todo = new TodoList();
        todo.add("Cook");
        todo.add("Eat");
        todo.add("Tidy up");
        Assertions.assertEquals(
                "Cook: uncompleted",
                todo.taskAscending().split("\n")[2]);
        Assertions.assertEquals(
                "Eat: uncompleted",
                todo.taskAscending().split("\n")[1]);
        Assertions.assertEquals(
                "Tidy up: uncompleted",
                todo.taskAscending().split("\n")[0]);
    }
}
