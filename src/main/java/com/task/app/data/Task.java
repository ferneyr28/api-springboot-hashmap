package com.task.app.data;

import com.task.app.dto.TaskDto;

import java.util.Date;

public class Task {

    private String id;
    private String name;
    private String description;
    private String status;
    private String assignedTo;
    private Date dueDate;
    private Date created;

    public Task(String name, String description, String status, String assignedTo, Date dueDate, Date created) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.created = created;
    }

    public Task (TaskDto taskDto) {
        this(taskDto.getName(), taskDto.getDescription(), taskDto.getStatus(), taskDto.getAssignedTo(), taskDto.getDueDate(), taskDto.getCreated());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
