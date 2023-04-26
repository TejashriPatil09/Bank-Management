package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.model.Customer;
import com.example.userservice.model.LoansDto;
import com.example.userservice.service.UserServiceImpl;

@RestController
@RequestMapping("/Customers")
public class UserController {
	@Autowired
	UserServiceImpl service;
	
	@PostMapping("/registercustomer")
	public Customer setcustomerreg(@RequestBody Customer customer)
	{
		return service.addCustomer(customer);
	}
	
	@PostMapping("/applyforcustomerloan")
	public LoansDto applyforloanCustomer(@RequestBody LoansDto loan)
	{
		return service.insertLoan(loan);
	}

}
