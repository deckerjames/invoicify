package com.libertymutual.goforcode.invoicify.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="invoicify_user")
public class FlatFeeBillingRecord extends BillingRecord {    

    private double amount;

    public FlatFeeBillingRecord() {}
    
    @Override
    public double getTotal() {
       return amount;
    }
}
