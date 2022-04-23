package com.sm.repo;

import com.sm.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class EmployeeRepository {

    public List<Employee> getEmployees() {
        return Stream.of(new Employee(100, "Ali", "Manager", 18),
                        new Employee(200, "Hunain", "Developer", 18),
                        new Employee(300, "Mubashir", "DevOps", 18),
                        new Employee(400, "Awais", "BA", 18),
                        new Employee(500, "Atiq", "Developer", 18))
                .collect(Collectors.toList());
    }
}
