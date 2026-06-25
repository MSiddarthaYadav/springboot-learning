package com.example.demo.CRUDOperations;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.Employee;
import com.example.demo.jpa.EmployeeRepository;

@RestController
public class ReadEmployee {

    private final EmployeeRepository repo;

    public ReadEmployee(EmployeeRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/readEmployees")

    public List<Employee> getEmployees() {

        return repo.findAll();
    }
}