package edu.udea.main.controller;

import edu.udea.main.model.Transaction;
import edu.udea.main.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService = new TransactionService();
    @GetMapping("/transaction")
    public void lookTransaction(@RequestBody Transaction transaction){
        transactionService.lookTransaction(transaction);
    }
    @GetMapping("/transaction1")
    public void makeTransaction(@RequestBody Transaction transaction){
        transactionService.makeTransaction(transaction);
    }
    @GetMapping("/transaction2")
    public void deleteTransaction(@RequestBody Transaction transaction){
        transactionService.deleteTransaction(transaction);
    }


}
