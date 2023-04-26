package com.example.microservice.adminservice.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.microservice.adminservice.model.transaction_details;
public interface Transaction_Detailsdao extends JpaRepository<transaction_details,String>{

}
