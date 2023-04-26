package com.example.microservice.adminservice.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.microservice.adminservice.model.branch_master;
public interface Branch_Masterdao extends JpaRepository<branch_master,String> {

}
