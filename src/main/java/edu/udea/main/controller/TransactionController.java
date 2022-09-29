package edu.udea.main.controller;

import edu.udea.main.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TransactionController {
    @Autowired
    TransactionService transactionService;
}
