package com.cjc.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cjc.app.model.Customer;
import com.cjc.app.model.Product;
import com.cjc.app.repository.CustomerRepository;
import com.cjc.app.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductRepository ProductRepository = context.getBean(ProductRepository.class);
		CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
		
		Product p1= new Product(101, "Pen", "blue", 10);
		Product p2= new Product(102, "Laptop", "black", 10000);
		Product p3= new Product(103, "Bottle", "Pink", 100);
		Product p4= new Product(104, "Book", "Green", 110);
		Product p5= new Product(105, "Tv", "Geay", 35000);
		
		
		Customer c1= new Customer();
		c1.setCid(1);
		c1.setCname("Komal");
		c1.setAddress("Pune");		
		c1.setProdList(Arrays.asList(p1,p2));
		
		Customer c2= new Customer();
		c2.setCid(2);
		c2.setCname("sayali");
		c2.setAddress("Nagpur");		
		c2.setProdList(Arrays.asList(p3,p4));
		
		Customer c3= new Customer();
		c3.setCid(3);
		c3.setCname("Nilesh");
		c3.setAddress("Jalgaon");		
		c3.setProdList(Arrays.asList(p4,p5));

		customerRepository.saveAll(Arrays.asList(c1,c2,c3));
	

		
	}

}
