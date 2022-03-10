package com.task.app.service;

import com.task.app.data.Task;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService {

    private final HashMap<String, Task> taskHashMap = new HashMap<>();

    @Override
    public Task create(Task task) {
        String id = String.valueOf(taskHashMap.size() + 1);
        task.setId(id);
        if(!taskHashMap.containsKey(id)){
            taskHashMap.put(id, task);
            return task;
        }
        return null;
    }

    @Override
    public Task findById(String id) {
        return taskHashMap.get(id);
    }

    @Override
    public List<Task> all() {
        return new ArrayList<>(taskHashMap.values());
    }

    @Override
    public boolean deleteById(String id) {
        if(taskHashMap.containsKey(id)) {
            taskHashMap.remove(id);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public Task update(Task task, String id) {
        if(taskHashMap.containsKey(id)) {
            task.setId(id);
            taskHashMap.put(id, task);
            return task;
        }
        return null;
    }
}
