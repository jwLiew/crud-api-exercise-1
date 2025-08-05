package com.example.crudapiexercise1.controller;

import com.example.crudapiexercise1.model.TaskModel;
import com.example.crudapiexercise1.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    TaskService taskService;

    // Handles POST request
    @PostMapping
    public TaskModel addData(@RequestBody TaskModel task){
        return taskService.addData(task);
    }

    // Handles GET ALL request
    @GetMapping
    public List<TaskModel> getAllData(){
        return taskService.getAllData();
    }

    // Handles GET request
    @GetMapping("/{id}")
    public TaskModel getData(@PathVariable("id") Long id){
        return taskService.getData(id);
    }

    // Handles PUT request
    @PutMapping("/{id}")
    public TaskModel updateData(@PathVariable("id") Long id, @RequestBody TaskModel task){
        return taskService.updateData(id, task);
    }

    // Handles DELETE request
    @DeleteMapping("/{id}")
    public String deleteData(@PathVariable("id") Long id){
        taskService.deleteData(id);
        return "Task with Id " + id + " deleted successfully";
    }

}
