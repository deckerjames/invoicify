package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.Configuration;
import org.meanbean.test.ConfigurationBuilder;

public class RateBasedBillingRecordTest {

        private RateBasedBillingRecord rateBasedBillingRecord;

        @Before
        public void setUp() {
                rateBasedBillingRecord = new RateBasedBillingRecord();
        }

        @Test
        public void test_all_getters_and_setters() {
                BeanTester tester = new BeanTester();
                Configuration configuration = new ConfigurationBuilder()
                                .ignoreProperty("createdOn")
                                .build();
                tester.testBean(RateBasedBillingRecord.class, configuration);
        }
        
        @Test 
        public void test_getTotal_returns_product_of_rate_and_quantity() {
                rateBasedBillingRecord.setQuantity(5);
                rateBasedBillingRecord.setRate(2);
                
                double total = rateBasedBillingRecord.getTotal();
                
                assertThat(total).isEqualTo(10);
        }

}