package com.quan12yt.elasticdemo.controller;

import com.quan12yt.elasticdemo.model.Customer;
import com.quan12yt.elasticdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/api/customers")
    public List<Customer> findAll() {
        return customerService.allCustomers();
    }

    @PostMapping("/api/customers/add")
    public Optional<Customer> addOne(@RequestBody Customer cus) {
        return customerService.addCustomer(cus);
    }
    @PostMapping("/api/customers/addAll")
    public List<Customer> addAll(@RequestBody List<Customer> cus) {
        return customerService.addAll(cus);
    }


    @PostMapping("/api/customers/name")
    public List<Customer> findByName(@RequestParam String name) {
        return customerService.findCustomersByName(name);
    }
    @PostMapping("/api/customers/contain")
    public List<Customer> findByNameContain(@RequestParam String name) {
        return customerService.findCustomersByNameContain(name);
    }

    @PostMapping("/api/customers/age")
    public List<Customer> findByNameAndAge(@RequestParam String name, @RequestParam Integer age) {
        return customerService.findByNameAndAge(name, age);
    }

    @DeleteMapping("/api/customers/delete")
    public void delete(@RequestParam String id) {
        customerService.deleteCustomer(id);
    }

    @PostMapping("/api/customers/update")
    public Customer update(@RequestBody Customer cus) {
        return customerService.updateCustomer(cus);
    }
}
