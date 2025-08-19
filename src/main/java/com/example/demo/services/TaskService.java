package com.example.demo.services;

import com.example.demo.models.Task;
import com.example.demo.models.Status;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {
    private Map<Integer, Task> taskRepo = new HashMap<>();
    private int currentId = 1;

    
    public Task createTask(Task task) {
        task.setId(currentId++);
        if (task.getStatus() == null) {
            task.setStatus(Status.TODO); // Default status
        }
        taskRepo.put(task.getId(), task);
        return task;
    }

    
    public List<Task> getAllTasks() {
        return new ArrayList<>(taskRepo.values());
    }

    
    public Task getTaskById(int id) {
        return taskRepo.get(id);
    }

    
    public Task updateTask(int id, Task task) {
        if (taskRepo.containsKey(id)) {
            task.setId(id);
            taskRepo.put(id, task);
            return task;
        }
        return null;
    }

    
    public boolean deleteTask(int id) {
        return taskRepo.remove(id) != null;
    }
}
