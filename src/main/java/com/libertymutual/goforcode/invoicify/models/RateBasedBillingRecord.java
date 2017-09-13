package com.libertymutual.goforcode.invoicify.models;

import javax.persistence.Entity;

@Entity
public class RateBasedBillingRecord extends BillingRecord {    

    private double rate;
    private double quantity;    

     @Override
    public double getTotal() {
        return rate * quantity;
    }
    
    
}
