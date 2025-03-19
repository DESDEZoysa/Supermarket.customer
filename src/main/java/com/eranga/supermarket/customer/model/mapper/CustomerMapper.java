package com.eranga.supermarket.customer.model.mapper;

import com.eranga.supermarket.customer.model.dto.CustomerDto;
import com.eranga.supermarket.customer.model.entity.CustomerEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerMapper {

    public CustomerEntity customerDtoToEntity(CustomerDto customerDto){
        CustomerEntity customerEntity = new CustomerEntity();
        BeanUtils.copyProperties(customerDto,customerEntity);
        return customerEntity;
    }

    public CustomerDto customerEntityToDto(CustomerEntity customerEntity){
        CustomerDto CustomerDto = new CustomerDto();
        BeanUtils.copyProperties(customerEntity,CustomerDto);
        return CustomerDto;
    }

    public List<CustomerDto> customerEntityToDtoList(List<CustomerEntity> customerEntityList){
        return customerEntityList.stream().map(this::customerEntityToDto).collect(Collectors.toList());
    }
}
