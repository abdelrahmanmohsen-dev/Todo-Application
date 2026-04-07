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


}
