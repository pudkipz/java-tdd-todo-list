package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
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

    @Test
    public void cannotRemoveNonexistentTask() {
        TodoList todo = new TodoList();
        Assertions.assertFalse(todo.removeTask("Study"));
    }

    @Test
    public void removesTaskIfExists() {
        TodoList todo = new TodoList();
        todo.add("Study");
        Assertions.assertTrue(todo.removeTask("Study"));
        Assertions.assertFalse(todo.searchTask("Study"));
    }

    @Test
    public void tasksAreDescending() {
        TodoList todo = new TodoList();
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
        TodoList todo = new TodoList();
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

    @Test
    public void onlyGettingCompletedTasks() {
        TodoList todo = new TodoList();
        todo.add("Study");
        todo.add("Cook");
        todo.add("Sleep");
        todo.updateTaskStatus("Sleep", true);
        ArrayList<String> completedTasks = todo.getCompletedTasks();
        Assertions.assertTrue(completedTasks.contains("Sleep"));
        Assertions.assertFalse(completedTasks.contains("Study"));
        Assertions.assertFalse(completedTasks.contains("Cook"));
    }

    @Test
    public void onlyGettingUncompletedTasks() {
        TodoList todo = new TodoList();
        todo.add("Study");
        todo.add("Cook");
        todo.add("Sleep");
        todo.updateTaskStatus("Sleep", true);
        ArrayList<String> tasks = todo.getUncompletedTasks();
        Assertions.assertFalse(tasks.contains("Sleep"));
        Assertions.assertTrue(tasks.contains("Study"));
        Assertions.assertTrue(tasks.contains("Cook"));
    }

    @Test
    public void firstTaskIdShouldBeValid() {
        TodoList todo = new TodoList();
        todo.add("Drink coffee");
        Assertions.assertTrue(-1 < todo.getTaskId("Drink coffee"));
    }

    @Test
    public void sndTaskIdShouldBeGtr() {
        TodoList todo = new TodoList();
        todo.add("Drink coffee");
        todo.add("Start working");
        Assertions.assertTrue(
                todo.getTaskId("Drink coffee")
                < todo.getTaskId("Start working"));
    }

    @Test
    public void getByIdReturnsRightTask() {
        TodoList todo = new TodoList();
        todo.add("Study");
        todo.add("Cook");
        todo.add("Sleep");
        Assertions.assertEquals("Study", todo.getTaskById(todo.getTaskId("Study")));
    }

    @Test
    public void getNonexistentTaskByIdShouldBeNull() {
        TodoList todo = new TodoList();
        todo.add("Study");
        todo.add("Cook");
        todo.add("Sleep");
        Assertions.assertNull(todo.getTaskById(todo.getTaskId("Walk")));
    }
}
