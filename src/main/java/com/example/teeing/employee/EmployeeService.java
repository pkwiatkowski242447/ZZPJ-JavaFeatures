package com.example.teeing.employee;

import java.util.List;
import java.util.stream.Collectors;


class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeService {

    double getAvgEmployeeSalary(List<Employee> employees) {
        // use List::stream method

        return employees.stream().collect(Collectors.summingDouble(Employee::getSalary)) / employees.size();
    }
}
