package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Address;
import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import com.example.repository.OrdersRepository;

@Controller
public class CustomerController {

	@Autowired
	public CustomerRepository customerRepo;
	@Autowired
	OrdersRepository ordersrepo;
	@RequestMapping("/")
	public String home() {
		return"index.jsp";
		
	}
	@RequestMapping("cust_details")
	public String addcustomer(@ModelAttribute Customer c, @ModelAttribute Address a) {
		
		c.setAddress(a);
		customerRepo.save(c);
		return "add.jsp";
	}
	
	
}
