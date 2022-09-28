package edu.udea.main.controller;

import edu.udea.main.model.Transaction;
import edu.udea.main.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService = new TransactionService();


}
