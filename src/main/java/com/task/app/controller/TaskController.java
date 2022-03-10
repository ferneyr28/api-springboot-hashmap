package com.task.app.controller;

import com.task.app.data.Task;
import com.task.app.dto.TaskDto;
import com.task.app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/v1/task")

public class TaskController {

    private final TaskService taskService;

    public TaskController(@Autowired TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("all")
    public ResponseEntity<List<Task>> all() {
        return new ResponseEntity<>(taskService.all(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Task> findById(@PathVariable String id) {
        return new ResponseEntity<>(taskService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody TaskDto taskDto) {
        return new ResponseEntity<>(taskService.create(new Task(taskDto)), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Task> update(@RequestBody TaskDto taskDto, @PathVariable("id") String id) {
        return new ResponseEntity<>(taskService.update(new Task(taskDto), id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
        return new ResponseEntity<>(taskService.deleteById(id) ,HttpStatus.OK);
    }

}
