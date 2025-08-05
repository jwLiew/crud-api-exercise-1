package com.example.crudapiexercise1.service.impl;

import com.example.crudapiexercise1.model.TaskModel;
import com.example.crudapiexercise1.repository.TaskRepository;
import com.example.crudapiexercise1.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository tasks;

    // Create
    @Override
    public TaskModel addData(TaskModel task) {
        return tasks.save(task);
    }

    // Update
    @Override
    public TaskModel updateData(Long id, TaskModel task) {
        if(tasks.existsById(id)){
            task.setId(id);
            return tasks.save(task);
        }
        throw new RuntimeException("Task with ID " + id + " not found");
    }

    // Delete
    @Override
    public void deleteData(Long id) {
        if(tasks.existsById(id)){
            tasks.deleteById(id);
        }
        else {
            throw new RuntimeException("Task with id "+ id + " not found");
        }
    }

    // Read

    // Get Data by Id
    @Override
    public TaskModel getData(Long id) {
        return tasks.findById(id).orElseThrow(()-> new RuntimeException("Task with id "+ id +" not found"));
    }

    // Get All Data
    @Override
    public List<TaskModel> getAllData() {
        return tasks.findAll();
    }

}
