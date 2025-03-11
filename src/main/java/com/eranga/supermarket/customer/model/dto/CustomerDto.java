package com.eranga.supermarket.customer.model.dto;

import com.eranga.supermarket.customer.model.enums.GenderEnum;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    private Integer id;
    private String name;
    private String address;
    private String dob;
    private GenderEnum gender;
    private String mobile;
    private String email;
}
