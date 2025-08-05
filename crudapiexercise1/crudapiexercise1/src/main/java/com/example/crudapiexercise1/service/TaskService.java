package com.example.crudapiexercise1.service;

import com.example.crudapiexercise1.model.TaskModel;
import java.util.List;


public interface TaskService {
    TaskModel addData(TaskModel task);
    TaskModel updateData(Long id, TaskModel task);
    void deleteData(Long id);
    TaskModel getData(Long id);
    List<TaskModel> getAllData();
}
