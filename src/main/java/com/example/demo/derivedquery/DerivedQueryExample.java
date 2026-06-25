package com.example.demo.derivedquery;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.Employee;

@RestController
public class DerivedQueryExample {

    private final EmployeeDerivedRepository repo;

    public DerivedQueryExample(EmployeeDerivedRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/employee/{name}")

    public List<Employee> getEmployeeByName(
            @PathVariable String name) {

        return repo.findByName(name);
    }
}