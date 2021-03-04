package com.quan12yt.elasticdemo.service;

import com.quan12yt.elasticdemo.model.Customer;
import com.quan12yt.elasticdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> allCustomers() {
        List<Customer> ls = new ArrayList<>();
        customerRepository.findAll().forEach(ls::add);
        return ls;
    }

    public List<Customer> findCustomersByName(String name) {
        return customerRepository.findByName(name);
    }

    public List<Customer> findCustomersByNameContain(String name) {
        return customerRepository.findByNameContaining(name);
    }

    public List<Customer> findByNameAndAge(String name, Integer age) {
        return customerRepository.findByNameAndAge(name, age);
    }

    public Optional<Customer> addCustomer(Customer cus) {
        return Optional.of(customerRepository.save(cus));
    }

    public List<Customer> addAll(List<Customer> cus) {
        List<Customer> lst = new ArrayList<>();
        customerRepository.saveAll(cus).forEach(lst::add);
        return lst;
    }

    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }

    public Customer updateCustomer(Customer cus) {
        customerRepository.findById(cus.getId()).map(u -> {
                    u.setName(cus.getName());
                    u.setAddress(cus.getAddress());
                    u.setAge(cus.getAge());
                    return customerRepository.save(u);
                }
        );
        return cus;
    }

}
