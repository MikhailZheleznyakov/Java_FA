package com.example.demo.controllers;

import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.TaskRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import com.example.demo.tables.Category;
import com.example.demo.tables.Task;
import com.example.demo.tables.User;

@RestController
@RequestMapping("api/Kr29")
public class Controller {
    private final UserRepository userRepository;
    private final TaskRepository taskRepository;
    private final CategoryRepository categoryRepository;
    public Controller(UserRepository userRepository, TaskRepository taskRepository, CategoryRepository categoryRepository){
        this.userRepository=userRepository;
        this.taskRepository=taskRepository;
        this.categoryRepository=categoryRepository;
    }

    @PostMapping("/adduser")
    User createUser(@RequestBody User user) {
        System.out.println(user);
        return this.userRepository.save(user);
    }
    @PostMapping("/addtask")
    Task createTask(@RequestBody Task task) {
    }
    @PostMapping("/addcategory")
    Category createCategory(@RequestBody Category createCategory){
        System.out.println(createCategory);
        return categoryRepository.save(createCategory);
    }
    @GetMapping("/getuser")
    User getUser(@PathVariable long id) {
        return this.userRepository.findClientById(id);
    }
    @GetMapping("/gettask")
    Task getTask(@PathVariable long id) {
        return this.taskRepository.findClientById(id);
    }
    @GetMapping("/getcategory")
    Category getCategory(@PathVariable long id) {
        return this.categoryRepository.findClientById(id);
    }
}