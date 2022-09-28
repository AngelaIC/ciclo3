package edu.udea.main.controller;

import edu.udea.main.model.Enterprise;
import edu.udea.main.service.EnterpriseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EnterpriseController {
    private EnterpriseService enterpriseService = new EnterpriseService();
    @GetMapping("/enterprise")
    public ResponseEntity<ArrayList<Enterprise>> getEnterprises(){
        return new ResponseEntity<>(enterpriseService.getEnterprises(), HttpStatus.OK);
    }
}
