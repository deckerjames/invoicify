package com.libertymutual.goforcode.invoicify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/billing-records")
@Controller
public class BillingRecordController {
    
    @GetMapping("")
    public String list() {
        return "billing-records/list";
    }

}
