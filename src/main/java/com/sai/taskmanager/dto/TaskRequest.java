package com.sai.taskmanager.dto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class TaskRequest {
    private String title;
    private boolean completed;

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }
}



