package edu.udea.main.controller;

import edu.udea.main.model.Employee;
import edu.udea.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService = new EmployeeService();
    @PostMapping("/employee")
    public void lookEmployee(@RequestBody Employee employee){
        employeeService.lookEmployee(employee);
    }
    @PostMapping("/employee1")
    public void makeEmployee(@RequestBody Employee employee){
        employeeService.makeEmployee(employee);
    }
    @PostMapping("/employee2")
    public void deleteEmployee(@RequestBody Employee employee){
        employeeService.deleteEmployee(employee);
    }

}
