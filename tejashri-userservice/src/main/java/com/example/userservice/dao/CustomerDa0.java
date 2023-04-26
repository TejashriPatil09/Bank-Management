package com.example.userservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userservice.model.Customer;
@Repository
public interface CustomerDa0 extends JpaRepository<Customer ,String> {
	

}
