package com.example.microservice.adminservice.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.microservice.adminservice.dao.*;
import com.example.microservice.adminservice.model.*;

@Service
public  class AdminserviceImpl implements Adminservice{
                        
	
	@Autowired
	Account_Masterdao accountdao;
	
	@Autowired
	Branch_Masterdao branchdao;
	
	@Autowired
	Loan_Deatailsdao loandao;
	
	@Autowired
	Transaction_Detailsdao transactiondao;
	
	@Autowired 
	RestTemplate template;
	
	@Override
	public  List<Account_Master> getAllAccounts()
	{
		return null;
		
	}
	
	@Override
	public List<Customer_masterDto> getAllCustomers(){
		return null;
	}
	
	@Override
	public List<branch_master>  getAllBranches()
	{
		return null;
		
	}
	
   @Override
   public List<loan_details> getAllLoans()
   {
	   return null;
   }
   
   public Account_Master insertAccount(Account_Master account)
   {
	   return null;
   }
   
   @Override
   public branch_master insertBranch(branch_master branch)
   {
	   return null;
   }
   @Override
   public void deleteAccount(String account_number) {
	   
   }
   
   @Override
   public void deleteBranch(String branch_id) {
	   
   }
   
  @Override
  public void deleteCustomer(String customer_number) {
}
  
  @Override
  public List<Customer_masterDto> findCustomerByCid(String customer_number){
	  return null;
  }


}
