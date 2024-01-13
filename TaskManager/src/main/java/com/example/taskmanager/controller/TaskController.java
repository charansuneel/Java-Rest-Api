package com.example.taskmanager.controller;

import com.example.taskmanager.contract.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskRepository repository;

    @GetMapping
    public ResponseEntity<List<Task>> getAllEntities() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Task getEntityById(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/findByName/{name}")
    public List<Task> getEntityByName(@PathVariable String name) {
        return repository.findAllByNameContainingIgnoreCase(name);
    }

    @GetMapping("/findByAssignee/{assignee}")
    public List<Task> getEntityByAssignee(@PathVariable String assignee) {
        return repository.findTop10ByAssigneeOrderByStartTime(assignee);
    }

    @PutMapping
    public Task updateEntity(@RequestBody Task entity) {
        return repository.save(entity);
    }

    @DeleteMapping
    public Task deleteEntity(@RequestParam String id) {
        Task task = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return task;
    }
}
