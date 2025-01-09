# Core

## Class: TodoList 

| Method                                                | Member Variable                | Scenario                                                   | Result                             |
|-------------------------------------------------------|--------------------------------|------------------------------------------------------------|------------------------------------|
| boolean add(String name)                              | HashMap<String, Boolean> tasks | Task with the provided name is not already in the todolist | true                               |
|                                                       |                                | Task with the provided name is already in the todolist     | false                              |
|                                                       |                                |                                                            |                                    |
| String listTasks()                                    |                                | There are tasks in the todolist                            | string with all tasks              |
|                                                       |                                | There are no tasks in the todolist                         | string with error message          |
|                                                       |                                |                                                            |                                    |
| boolean updateTaskStatus(String name, Boolean status) |                                | There is a task with the provided name                     | true                               |
|                                                       |                                | There is no task with the provided name                    | false                              |
|                                                       |                                |                                                            |                                    |
| String getCompletedTasks()                            |                                | There are completed tasks in the todolist                  | string with all completed tasks    |
|                                                       |                                | There are no completed tasks in the todolist               | string with error message          |
|                                                       |                                |                                                            |                                    |
| String getUnCompletedTasks()                          |                                | There are uncompleted tasks in the todolist                | string with all uncompleted tasks  |
|                                                       |                                | There are no uncompleted tasks in the todolist             | string with error message          |
|                                                       |                                |                                                            |                                    |
| boolean searchTask(String name)                       |                                | There was a task with the provided name                    | true                               |
|                                                       |                                | There was no task with the provided name                   | false                              |
|                                                       |                                |                                                            |                                    |
| boolean removeTask(String name)                       |                                | Task with the provided name is not in the todolist         | false                              |
|                                                       |                                | Task with the provided name is in the todolist             | true                               |
|                                                       |                                |                                                            |                                    |
| taskDescending()                                      |                                | There are tasks in the todolist                            | string in descending order by name |
|                                                       |                                | There are no tasks in the todolist                         | string with error message          |
|                                                       |                                |                                                            |                                    |
| taskAscending()                                       |                                | There are tasks in the todolist                            | string in ascending order by name  |
|                                                       |                                | There are no tasks in the todolist                         | string with error message          |

*Note: "error message" means something like "The list is empty".*

# Extension

## Todo

| Method                                       | Member Variable       | Scenario | Result |
|----------------------------------------------|-----------------------|----------|--------|
| add(String name)                             | ArrayList<Task> tasks |          |        |
|                                              | id                    |          |        |
| listTasks( )                                 |                       |          |        |
| updateTaskStatus(Task task, Boolean state)   |                       |          |        |
|                                              |                       |          |        |
| getCompletedTasks()                          |                       |          |        |
| getNotCompletedTasks()                       |                       |          |        |
| SearchTask(Task task)                        |                       |          |        |
| removeTask(Task task)                        |                       |          |        |
| taskDescending()                             |                       |          |        |
| taskAscending()                              |                       |          |        |
| getTaskById(int id)                          |                       |          |        |
| updateTaskName(int id, String newName)       |                       |          |        |
| updateTaskStatusById(int id, Boolean status) |                       |          |        |
|                                              |                       |          |        |

## Task

| Method | Member Variable  | Scenario | Result |
|--------|------------------|----------|--------|
|        |                  |          |        |
|        | Boolean complete |          |        |
|        | String name      |          |        |