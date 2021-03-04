package com.quan12yt.elasticdemo;

import com.quan12yt.elasticdemo.model.Customer;
import com.quan12yt.elasticdemo.repository.CustomerRepository;
import com.quan12yt.elasticdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ElasticdemoApplication {

//	@Autowired
//	private static CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(ElasticdemoApplication.class, args);
	}

}
