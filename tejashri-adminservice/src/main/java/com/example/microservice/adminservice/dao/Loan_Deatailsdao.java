package com.example.microservice.adminservice.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.microservice.adminservice.model.loan_details;
public interface Loan_Deatailsdao extends JpaRepository< loan_details,String>{

}
