package edu.udea.main.controller;

import edu.udea.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
}
