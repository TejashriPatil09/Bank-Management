package com.example.microservice.adminservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.microservice.adminservice.model.*;
import com.example.microservice.adminservice.service.Adminservice;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	Adminservice service;
	
	@GetMapping("/allAccounts")
	public List<Account_Master> showAllAccounts() {
		return service.getAllAccounts();
	}
	
	@GetMapping("/allBranches")
	public List<branch_master> showAllBranches() {
		return service.getAllBranches();
	}
	
	@GetMapping("/allCustomers")
	public List<Customer_masterDto> getAllCustomers() {
		return service.getAllCustomers();
	}
	
	@GetMapping("/allLoans")
	public List<loan_details> getAllLoans() {
		return service.getAllLoans();
	}
	
	@PostMapping("/addAccount")
	public Account_Master addAccount(@RequestBody Account_Master account) {
		return service.insertAccount(account);
	}
	
	@PostMapping("/addBranch")
	public branch_master addBranch(@RequestBody branch_master branch) {
		return service.insertBranch(branch);
	}
	

}
