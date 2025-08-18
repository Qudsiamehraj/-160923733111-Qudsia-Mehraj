package com.example.demo.controller;

import com.example.demo.models.Task;
import com.example.demo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // ✅ Create Task (POST)
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    // ✅ Get All Tasks (GET)
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // ✅ Get Task by ID (GET)
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable int id) {
        return taskService.getTaskById(id);
    }

    // ✅ Update Task (PUT)
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    // ✅ Delete Task (DELETE)
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        boolean removed = taskService.deleteTask(id);
        return removed ? "Task deleted successfully" : "Task not found";
    }
}
