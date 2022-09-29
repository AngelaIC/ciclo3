package edu.udea.main.controller;

import edu.udea.main.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EnterpriseController {
    @Autowired
    EnterpriseService enterpriseService;
}
