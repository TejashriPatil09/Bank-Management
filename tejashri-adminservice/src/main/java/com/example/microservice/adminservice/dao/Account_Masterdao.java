package com.example.microservice.adminservice.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.microservice.adminservice.model.Account_Master;

public interface Account_Masterdao extends JpaRepository<Account_Master,String> {

}
