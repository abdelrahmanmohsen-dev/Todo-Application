package com.App.Todo.Application.Repositories;

import com.App.Todo.Application.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
