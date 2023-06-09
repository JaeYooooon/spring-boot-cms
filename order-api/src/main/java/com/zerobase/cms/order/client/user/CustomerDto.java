package com.zerobase.cms.order.client.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CustomerDto {

    public Long id;
    public String email;
    private Integer balance;
}
