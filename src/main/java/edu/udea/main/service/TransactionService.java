package edu.udea.main.service;

import edu.udea.main.model.Transaction;
import edu.udea.main.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public void lookTransaction(Transaction transaction){
        transactionRepository.findAll();
    }
    public void makeTransaction(Transaction transaction){
        transactionRepository.save(transaction);

    }
    public void deleteTransaction(Transaction transaction){
        transactionRepository.delete(transaction);

    }
    public void updateTransaction(){

    }
}
