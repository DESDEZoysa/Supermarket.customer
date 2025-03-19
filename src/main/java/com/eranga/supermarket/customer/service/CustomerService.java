package com.eranga.supermarket.customer.service;

import com.eranga.supermarket.customer.model.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    CustomerDto create(CustomerDto customerDto);
    List<CustomerDto> getCustomer();
    CustomerDto getCustomer(Integer id);
    void delete(Integer id);
}
