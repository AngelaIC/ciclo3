package edu.udea.main.service;

import edu.udea.main.model.Employee;
import edu.udea.main.model.Enterprise;
import edu.udea.main.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class EnterpriseService {
    @Autowired
    EnterpriseRepository enterpriseRepository;

    public void lookEnterprise(Enterprise enterprise){
        enterpriseRepository.findAll();
    }
    public void makeEnterprise(Enterprise enterprise){
    enterpriseRepository.save(enterprise);
    }
    public void deleteEnterprise(Enterprise enterprise){
        enterpriseRepository.delete(enterprise);
    }
    public void updateEnterprise(Enterprise enterprise){


    }
}
