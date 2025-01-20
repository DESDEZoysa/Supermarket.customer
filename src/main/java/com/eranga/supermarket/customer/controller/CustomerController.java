package com.eranga.supermarket.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping
    public String getCustomerList(){
        return "Customer List";
    }

    @GetMapping("/one")
    public String getCustomerOne(){
        return "Customer One";
    }
}


