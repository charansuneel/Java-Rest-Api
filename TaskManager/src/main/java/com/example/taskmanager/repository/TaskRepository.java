package com.example.taskmanager.repository;

import com.example.taskmanager.contract.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {
    List<Task> findAllByNameContainingIgnoreCase(String name);

    List<Task> findTop10ByAssigneeOrderByStartTime(String assignee);
}
