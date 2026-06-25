package com.example.demo.CRUDOperations;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.Employee;
import com.example.demo.jpa.EmployeeRepository;

@RestController
public class UpdateEmployee {

    private final EmployeeRepository repo;

    public UpdateEmployee(EmployeeRepository repo) {
        this.repo = repo;
    }

    @PutMapping("/modifyEmployee")

    public String updateEmployee(
            @RequestBody Employee employee) {

        if (employee != null) {
            repo.save(employee);
        }

        return "Employee Updated";
    }
}