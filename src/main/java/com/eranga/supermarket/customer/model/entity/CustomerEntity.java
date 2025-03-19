package com.eranga.supermarket.customer.model.entity;

import com.eranga.supermarket.customer.model.enums.GenderEnum;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_seq")
    @SequenceGenerator(name = "customer_id_seq", sequenceName = "customer_id_seq", allocationSize = 1)
    private Integer id;
    @Version
    private Long version;
    @Column(name = "name", nullable = false)
    private String name;
    private String address;
    private String dob;
    @Column(name = "gender", nullable = false)
    private GenderEnum gender;
    @Column(name = "mobile", nullable = false)
    private String mobile;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "nic", nullable = false)
    private String nic;
}
