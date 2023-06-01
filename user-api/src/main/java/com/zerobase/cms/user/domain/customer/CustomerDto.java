package com.zerobase.cms.user.domain.customer;

import com.zerobase.cms.user.domain.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Getter
@AllArgsConstructor
public class CustomerDto {

    public Long id;
    public String email;
    private Integer balance;
    public static CustomerDto from(Customer customer){
        return new CustomerDto(customer.getId(), customer.getEmail(), customer.getBalance() == null ? 0 : customer.getBalance());
    }
}
