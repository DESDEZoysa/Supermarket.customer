package com.eranga.supermarket.customer.controller;

import com.eranga.supermarket.customer.model.dto.CustomerDto;
import com.eranga.supermarket.customer.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public CustomerDto create(@Valid @RequestBody CustomerDto customerDto){
        return customerService.create(customerDto);
    }

    @PutMapping
    public CustomerDto update(@Valid @RequestBody CustomerDto customerDto){
        return customerService.create(customerDto);
    }

    @GetMapping
    public List<CustomerDto> getCustomer(){
        return customerService.getCustomer();
    }

    @GetMapping("/{id}")
    public CustomerDto getCustomer(@PathVariable Integer id){
        return customerService.getCustomer(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        customerService.delete(id);
    }
}


