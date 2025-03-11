package com.eranga.supermarket.customer.controller;

import com.eranga.supermarket.customer.model.dto.CustomerDto;
import com.eranga.supermarket.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public CustomerDto create(@RequestBody CustomerDto customerDto){
        return customerService.create(customerDto);
    }

    @GetMapping("/one")
    public String getCustomerOne(){
        return "Customer One";
    }
}


