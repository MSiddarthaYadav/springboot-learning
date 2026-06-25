package com.example.demo.CRUDOperations;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.EmployeeRepository;

@RestController
public class DeleteEmployee {

    private final EmployeeRepository repo;

    public DeleteEmployee(EmployeeRepository repo) {
        this.repo = repo;
    }

    @DeleteMapping("/removeEmployee/{id}")

    public String deleteEmployee(
            @PathVariable int id) {

        repo.deleteById(id);

        return "Employee Deleted";
    }
}