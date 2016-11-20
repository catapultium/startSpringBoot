package com.startspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/customers")
    public Iterable<Customer> customers() {
        return customerRepository.findAll();
    }
}
