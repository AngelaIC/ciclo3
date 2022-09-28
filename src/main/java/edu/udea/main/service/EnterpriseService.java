package edu.udea.main.service;

import edu.udea.main.model.Enterprise;

import java.util.ArrayList;

public class EnterpriseService {
    private ArrayList<Enterprise> enterprises;
    public EnterpriseService(){
        this.enterprises = new ArrayList<>();
    }
    public ArrayList<Enterprise> getEnterprises() {
        return enterprises;
    }

    public void setEnterprises(ArrayList<Enterprise> enterprises) {
        this.enterprises = enterprises;
    }
}
