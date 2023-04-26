package com.example.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.userservice.dao.CustomerDa0;
import com.example.userservice.model.Customer;
import com.example.userservice.model.LoanDetailsProxy;
import com.example.userservice.model.LoansDto;

public class UserServiceImpl implements UserService {
    @Autowired
    CustomerDa0 dao;
    
   @Autowired
    LoanDetailsProxy temp;
    
     @Override
     public List<Customer> getAllCustomer()
     {
    	 return dao.findAll();
     }
     
     @Override
     public Customer insertCustomer(Customer customer)
     {
    	 return dao.save(customer);
     }
     
   @Override
      public void deleteCustomer(String bid)
      {
      }
   
   @Override
   public LoansDto insertLoan1(LoansDto loan)
   {
	   return temp.applyforloans(loan);
   }

@Override
public Customer addCustomer(Customer customer) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public LoansDto applyforloan(LoansDto loan) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public LoansDto insertLoan(LoansDto loan) {
	// TODO Auto-generated method stub
	return null;
}


}
