package com.eranga.supermarket.customer.service.impl;

import com.eranga.supermarket.customer.model.dto.CustomerDto;
import com.eranga.supermarket.customer.model.entity.CustomerEntity;
import com.eranga.supermarket.customer.model.mapper.CustomerMapper;
import com.eranga.supermarket.customer.repository.CustomerRepository;
import com.eranga.supermarket.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerDto create(CustomerDto customerDto) {
        CustomerEntity customerEntity = customerRepository.save(customerMapper.customerDtoToEntity(customerDto));
        return customerMapper.customerEntityToDto(customerEntity);
    }
}
