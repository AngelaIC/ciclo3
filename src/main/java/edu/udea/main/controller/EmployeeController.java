package edu.udea.main.controller;

import edu.udea.main.model.Employee;
import edu.udea.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService = new EmployeeService();

}
