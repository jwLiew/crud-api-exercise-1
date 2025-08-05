package com.example.crudapiexercise1.repository;

import com.example.crudapiexercise1.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskModel, Long> {
}
