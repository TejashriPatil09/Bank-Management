package com.example.userservice.model;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("ADMIN-SERVICE/loans")
public class LoanDetailsProxy {

	public LoansDto applyforloans(@RequestBody LoansDto loan) {
		// TODO Auto-generated method stub
		return null;
	}

}
