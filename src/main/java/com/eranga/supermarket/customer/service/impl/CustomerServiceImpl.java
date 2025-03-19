package com.eranga.supermarket.customer.service.impl;

import com.eranga.supermarket.customer.model.dto.CustomerDto;
import com.eranga.supermarket.customer.model.entity.CustomerEntity;
import com.eranga.supermarket.customer.model.mapper.CustomerMapper;
import com.eranga.supermarket.customer.repository.CustomerRepository;
import com.eranga.supermarket.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<CustomerDto> getCustomer() {
        Sort sort = Sort.by(Sort.Order.desc("name"));
        return customerMapper.customerEntityToDtoList(customerRepository.findAll(sort));
    }

    @Override
    public CustomerDto getCustomer(Integer id) {
        return customerMapper.customerEntityToDto(customerRepository.findById(id).orElseThrow());
    }

    @Override
    public void delete(Integer id) {
        customerRepository.deleteById(id);
    }
}
