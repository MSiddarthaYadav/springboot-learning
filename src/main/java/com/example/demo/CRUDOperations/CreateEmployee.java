package com.example.demo.CRUDOperations;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.Employee;
import com.example.demo.jpa.EmployeeRepository;

@RestController
public class CreateEmployee {

    private final EmployeeRepository repo;

    public CreateEmployee(EmployeeRepository repo) {
        this.repo = repo;
    }

  @PostMapping("/createEmployee")

    public String addEmployee(
            @RequestBody Employee employee) {

        if (employee != null) {
            repo.save(employee);
        }

        return "Employee Added";
    }
}