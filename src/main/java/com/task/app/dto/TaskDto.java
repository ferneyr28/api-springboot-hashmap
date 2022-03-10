package com.task.app.dto;

import java.util.Date;

public class TaskDto {

    private String name;
    private String description;
    private String status;
    private String assignedTo;
    private Date dueDate;
    private Date created;

    public TaskDto(String name, String description, String status, String assignedTo, Date dueDate, Date created) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getCreated() {
        return created;
    }

}
