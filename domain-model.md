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
| ArrayList<String> getCompletedTasks()                 |                                | There are completed tasks in the todolist                  | string with all completed tasks    |
|                                                       |                                | There are no completed tasks in the todolist               | string with error message          |
|                                                       |                                |                                                            |                                    |
| ArrayList<String> getUnCompletedTasks()               |                                | There are uncompleted tasks in the todolist                | List with all uncompleted tasks    |
|                                                       |                                | There are no uncompleted tasks in the todolist             | Empty list                         |
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

## Class: TodoList

| Method                                                | Member Variable             | Scenario                                                   | Result                             |
|-------------------------------------------------------|-----------------------------|------------------------------------------------------------|------------------------------------|
| boolean add(String name)                              | HashMap<String, Task> tasks | Task with the provided name is not already in the todolist | true                               |
|                                                       |                             | Task with the provided name is already in the todolist     | false                              |
|                                                       |                             |                                                            |                                    |
| String listTasks()                                    |                             | There are tasks in the todolist                            | string with all tasks              |
|                                                       |                             | There are no tasks in the todolist                         | string with error message          |
|                                                       |                             |                                                            |                                    |
| boolean updateTaskStatus(String name, Boolean status) |                             | There is a task with the provided name                     | true                               |
|                                                       |                             | There is no task with the provided name                    | false                              |
|                                                       |                             |                                                            |                                    |
| ArrayList<String> getCompletedTasks()                 |                             | There are completed tasks in the todolist                  | string with all completed tasks    |
|                                                       |                             | There are no completed tasks in the todolist               | string with error message          |
|                                                       |                             |                                                            |                                    |
| ArrayList<String> getUnCompletedTasks()               |                             | There are uncompleted tasks in the todolist                | List with all uncompleted tasks    |
|                                                       |                             | There are no uncompleted tasks in the todolist             | Empty list                         |
|                                                       |                             |                                                            |                                    |
| boolean searchTask(String name)                       |                             | There was a task with the provided name                    | true                               |
|                                                       |                             | There was no task with the provided name                   | false                              |
|                                                       |                             |                                                            |                                    |
| boolean removeTask(String name)                       |                             | Task with the provided name is not in the todolist         | false                              |
|                                                       |                             | Task with the provided name is in the todolist             | true                               |
|                                                       |                             |                                                            |                                    |
| taskDescending()                                      |                             | There are tasks in the todolist                            | string in descending order by name |
|                                                       |                             | There are no tasks in the todolist                         | string with error message          |
|                                                       |                             |                                                            |                                    |
| taskAscending()                                       |                             | There are tasks in the todolist                            | string in ascending order by name  |
|                                                       |                             | There are no tasks in the todolist                         | string with error message          |
|                                                       |                             |                                                            |                                    |
| getTaskById(int id)                                   |                             | Task with the given ID exists                              | return task object                 |
|                                                       |                             | Task with the given ID does not exist                      | return null                        |
| updateTaskName(int id, String newName)                |                             | Task with ID exists/does not exist                         | return true/false                  |
| updateTaskStatusById(int id, Boolean status)          |                             | Task with ID exists/does not exist                         | return true/false                  |
| getTaskId(String name)                                |                             | Task with name exists/does not exist                       | Return int/return -1               |

## Task

| Method | Member Variable   | Scenario | Result |
|--------|-------------------|----------|--------|
|        | int id            |          |        |
|        | boolean completed |          |        |
|        | String name       |          |        |