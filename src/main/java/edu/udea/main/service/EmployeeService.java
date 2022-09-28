package edu.udea.main.service;

import edu.udea.main.model.Employee;

import java.util.ArrayList;

public class EmployeeService {
    private ArrayList<Employee> employees;
    public EmployeeService(){
        this.employees = new ArrayList<>();

    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
