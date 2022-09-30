package edu.udea.main.controller;

import edu.udea.main.model.Enterprise;
import edu.udea.main.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EnterpriseController {
    @Autowired
    EnterpriseService enterpriseService;

    @GetMapping("/enterprise")
    private String lookEnterprise(){
        enterpriseService.lookEnterprise();
        return "enterprise";
    }
    @PostMapping("/enterprise")
    private void makeEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.makeEnterprise(enterprise);
    }
    @DeleteMapping("/enterprise/{id}")
    private void deleteEnterprise(@PathVariable("id") Long id){
        enterpriseService.deleteEnterprise(id);
    }
}
