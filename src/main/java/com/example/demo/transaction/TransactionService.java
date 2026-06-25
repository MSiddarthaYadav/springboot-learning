package com.example.demo.transaction;

import java.util.Objects;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class TransactionService {

    private final TransactionEmployeeRepo repository;

    public TransactionService(TransactionEmployeeRepo repository) {
        this.repository = repository;
    }

    @Transactional
    public TransactionEmployee saveEmployee(
            TransactionEmployee employee) {

        return Objects.requireNonNull(repository.save(employee));
    }
}