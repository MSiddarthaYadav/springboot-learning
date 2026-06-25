package com.example.demo.derivedquery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.Employee;

public interface EmployeeDerivedRepository
        extends JpaRepository<Employee, Integer> {

    List<Employee> findByName(String name);

}