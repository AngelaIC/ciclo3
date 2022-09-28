package edu.udea.main.service;

import edu.udea.main.model.Transaction;

import java.util.ArrayList;

public class TransactionService {
    private ArrayList<Transaction> transactions;
    public TransactionService(){
        this.transactions = new ArrayList<>();

    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}
