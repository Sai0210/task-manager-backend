package com.sai.taskmanager.controller;

import com.sai.taskmanager.dto.TaskRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @PostMapping
    public String createTask(@RequestBody TaskRequest task){
        return "Task Received : " + task.getTitle();
    }

}
