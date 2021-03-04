package com.quan12yt.elasticdemo.repository;

import com.quan12yt.elasticdemo.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

    List<Customer> findByName(String name);
    List<Customer> findByNameContaining(String name);
    List<Customer> findByNameAndAge(String name, Integer age);
}
