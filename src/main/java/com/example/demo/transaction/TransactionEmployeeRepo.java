package com.example.demo.transaction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionEmployeeRepo
        extends JpaRepository<TransactionEmployee, Long> {

}