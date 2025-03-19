package com.eranga.supermarket.customer.model.dto;

import com.eranga.supermarket.customer.model.enums.GenderEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    private Integer id;
    private Long version;
    @NotBlank(message = "Customer name cannot be blank")
    private String name;
    private String address;
    @NotNull(message = "Gender cannot be null")
    private GenderEnum gender;
    private String dob;
    @NotBlank(message = "Email cannot be blank")
    private String email;
    @NotBlank(message = "Mobile cannot be blank")
    private String mobile;
    @NotBlank(message = "NIC cannot be blank")
    private String nic;

}
