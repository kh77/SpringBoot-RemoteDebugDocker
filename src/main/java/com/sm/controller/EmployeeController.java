package com.sm.controller;

import com.sm.model.Employee;
import com.sm.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/{department}")
    public List<Employee> getEmployees(@PathVariable String department) {
        return employeeRepository.getEmployees()
                .stream()
                .filter(employee -> department.equals(employee.getDepartment()))
                .collect(Collectors.toList());
    }
}
