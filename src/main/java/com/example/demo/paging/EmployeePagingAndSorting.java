package com.example.demo.paging;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paging")
public class EmployeePagingAndSorting {

    private final EmployeePagingRepo repository;

    public EmployeePagingAndSorting(EmployeePagingRepo repository) {
        this.repository = repository;
    }

    // Insert Data
    @PostMapping("/add")
    public @NonNull EmployeePagingEntity addEmployee(
            @RequestBody @NonNull EmployeePagingEntity employee) {

        return repository.save(employee);
    }

    // Paging
    @GetMapping("/page")
    public List<EmployeePagingEntity> getPage() {

        Pageable pageable =
                PageRequest.of(0, 2);

        Page<EmployeePagingEntity> page =
                repository.findAll(pageable);

        return page.getContent();
    }

    // Sorting
    @GetMapping("/sort")
    public List<EmployeePagingEntity> sortData() {

        return repository.findAll(
                Sort.by("name")
        );
    }
}