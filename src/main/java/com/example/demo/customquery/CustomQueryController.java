package com.example.demo.customquery;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom")

public class CustomQueryController {

    private final CustomEmployeeRepo repository;

    public CustomQueryController(CustomEmployeeRepo repository) {
        this.repository = repository;
    }

    // Insert Data
    @PostMapping("/add")
    public CustomEmployee addEmployee(
            @RequestBody CustomEmployee employee) {

        return repository.save(employee);
    }

    // Find By Name
    @GetMapping("/name/{name}")
    public List<CustomEmployee> getName(
            @PathVariable String name) {

        return repository.findByName(name);
    }

    // Find Salary Greater Than
    @GetMapping("/salary/{salary}")
    public List<CustomEmployee> getSalary(
            @PathVariable double salary) {

        return repository.getSalary(salary);
    }
}