package edu.udea.main.controller;

import edu.udea.main.model.Employee;
import edu.udea.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/employee")
    private void makeEmployee(@RequestBody Employee employee){
        employeeService.makeEmployee(employee);
    }
}
