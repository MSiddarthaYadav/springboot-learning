package com.example.demo.jpa;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeRepository repo;

    public EmployeeController(EmployeeRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/addEmployee")
    public String addEmployee(
            @RequestBody Employee employee) {

        if (employee != null) {
            repo.save(employee);
        }

        return "Employee Added";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {

        return repo.findAll();
    }
}