package edu.udea.main.controller;

import edu.udea.main.model.Enterprise;
import edu.udea.main.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EnterpriseController {
    @Autowired
    private EnterpriseService enterpriseService = new EnterpriseService();
    @PostMapping("/enterprise")
    private void lookEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.lookEnterprise(enterprise);
    }
    @PostMapping("/enterprise1")
    private void makeEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.makeEnterprise(enterprise);
    }
    @PostMapping("/enterprise2")
    private void deleteEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.deleteEnterprise(enterprise);
    }
}

