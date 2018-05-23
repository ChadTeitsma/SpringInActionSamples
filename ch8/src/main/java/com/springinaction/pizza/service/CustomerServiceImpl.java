package com.springinaction.pizza.service;

import com.springinaction.pizza.domain.Customer;

public class CustomerServiceImpl implements CustomerService {
    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        if( Math.random() < .5){
            return new Customer();
        } else {
            throw new CustomerNotFoundException();
        }

    }
}
