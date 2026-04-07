package com.App.Todo.Application.Services;

import com.App.Todo.Application.Models.Task;
import com.App.Todo.Application.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    public void addTask(String title) {
        Task newTask = new Task();
        newTask.setTitle(title);
        newTask.setCompleted(false);
        taskRepository.save(newTask);
    }
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
    public void toggleTask(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }

}
