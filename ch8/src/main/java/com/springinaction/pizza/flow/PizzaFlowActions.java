package com.springinaction.pizza.flow;

import com.springinaction.pizza.domain.Customer;
import com.springinaction.pizza.service.CustomerNotFoundException;
import com.springinaction.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaFlowActions {

    @Autowired
    CustomerService customerService;

    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        return customerService.lookupCustomer(phoneNumber);
    }
}
