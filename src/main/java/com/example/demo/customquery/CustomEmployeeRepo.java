package com.example.demo.customquery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomEmployeeRepo
extends JpaRepository<CustomEmployee, Long> {

    // JPQL Query
    @Query("SELECT e FROM CustomEmployee e WHERE e.name=?1")
    List<CustomEmployee> findByName(String name);

    // Native Query
    @Query(value =
    "SELECT * FROM custom_employee WHERE salary > ?1",
    nativeQuery = true)

    List<CustomEmployee> getSalary(double salary);
}