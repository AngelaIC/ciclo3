package edu.udea.main.controller;

import edu.udea.main.model.Enterprise;
import edu.udea.main.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EnterpriseController {
    @Autowired
    EnterpriseService enterpriseService;
    @PostMapping("/enterprise")
    private void makeEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.makeEnterprise(enterprise);
    }
}
