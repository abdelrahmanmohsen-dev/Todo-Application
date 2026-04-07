package com.App.Todo.Application.controllers;

import com.App.Todo.Application.Models.Task;
import com.App.Todo.Application.Repositories.TaskRepository;
import com.App.Todo.Application.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public ResponseEntity<String> getAllTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return ResponseEntity.ok("Tasks");
    }
    @PostMapping
    public ResponseEntity<String> addTask(@RequestBody String title) {
        taskService.addTask(title);
        return ResponseEntity.status(HttpStatus.CREATED).body("redirect:/");
    }


}
