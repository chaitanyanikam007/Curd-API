package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Orders;
import com.example.repository.CustomerRepository;
import com.example.repository.OrdersRepository;

import jakarta.persistence.Entity;

@Controller
public class OrdersController {
	
	
	@Autowired
	OrdersRepository orderrepo;
	
	@Autowired
	CustomerRepository customerrepo;
	
	@RequestMapping("item_details")
	public void addItemsdetails(@RequestParam("id")int id,Orders o) {
		o.setCustomer(customerrepo.findById(id).get());
		orderrepo.save(o);
		
		
		
		
	}
	

}
