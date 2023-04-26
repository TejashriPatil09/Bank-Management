package com.example.userservice.service;

import java.util.List;

import com.example.userservice.model.*;

public interface UserService {
	
	public Customer addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer insertCustomer(Customer customer);
	public void deleteCustomer(String bid);
	public LoansDto applyforloan(LoansDto loan);
	public LoansDto insertLoan(LoansDto loan);
	public LoansDto insertLoan1(LoansDto loan);

}
