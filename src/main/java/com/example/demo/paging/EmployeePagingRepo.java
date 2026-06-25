package com.example.demo.paging;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePagingRepo
        extends JpaRepository<EmployeePagingEntity, Integer> {

}