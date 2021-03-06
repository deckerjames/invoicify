package com.libertymutual.goforcode.invoicify.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class FlatFeeBillingRecord extends BillingRecord {

    private double amount;

    public FlatFeeBillingRecord() {
    }

    @Override
    public double getTotal() {
        return amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
