package edu.udea.main.service;

import edu.udea.main.model.Employee;
import edu.udea.main.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public void lookEmployee(){

    }
    public void makeEmployee(Employee employee){
        employeeRepository.save(employee);

    }
    public void deleteEmployee(){

    }

}
