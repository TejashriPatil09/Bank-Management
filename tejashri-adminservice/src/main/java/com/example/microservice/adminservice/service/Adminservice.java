package com.example.microservice.adminservice.service;
import java.util.List;

import com.example.microservice.adminservice.model.*;

public interface Adminservice {
	
	public  List<Account_Master> getAllAccounts();
	public List<Customer_masterDto> getAllCustomers();
	public List<branch_master>  getAllBranches();
	public List<loan_details> getAllLoans();
	public Account_Master insertAccount(Account_Master account);
	public branch_master insertBranch(branch_master branch);
	public void deleteAccount(String account_number);
	public void deleteBranch(String branch_id);
	public void deleteCustomer(String customer_number);
	public List<Customer_masterDto> findCustomerByCid(String customer_number);
	
	
	
	
	

}
