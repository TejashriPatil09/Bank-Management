package com.example.microservice.adminservice.model;

public class Customer_masterDto {
	
	String CUSTOMER_NUMBER;
	String  FIRSTNAME;
	String middlename;
	String lastname;
	 String CUSTOMER_CITY;
      int  CUSTOMER_CONTACT_NO;
      String occupation;
     String CUSTOMER_DATE_OF_BIRTH;
     
     public Customer_masterDto()
     {
    	 
     }

	public String getCUSTOMER_NUMBER() {
		return CUSTOMER_NUMBER;
	}

	public void setCUSTOMER_NUMBER(String cUSTOMER_NUMBER) {
		CUSTOMER_NUMBER = cUSTOMER_NUMBER;
	}

	public String getFIRSTNAME() {
		return FIRSTNAME;
	}

	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCUSTOMER_CITY() {
		return CUSTOMER_CITY;
	}

	public void setCUSTOMER_CITY(String cUSTOMER_CITY) {
		CUSTOMER_CITY = cUSTOMER_CITY;
	}

	public int getCUSTOMER_CONTACT_NO() {
		return CUSTOMER_CONTACT_NO;
	}

	public void setCUSTOMER_CONTACT_NO(int cUSTOMER_CONTACT_NO) {
		CUSTOMER_CONTACT_NO = cUSTOMER_CONTACT_NO;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getCUSTOMER_DATE_OF_BIRTH() {
		return CUSTOMER_DATE_OF_BIRTH;
	}

	public void setCUSTOMER_DATE_OF_BIRTH(String cUSTOMER_DATE_OF_BIRTH) {
		CUSTOMER_DATE_OF_BIRTH = cUSTOMER_DATE_OF_BIRTH;
	}

	public Customer_masterDto(String cUSTOMER_NUMBER, String fIRSTNAME, String middlename, String lastname,
			String cUSTOMER_CITY, int cUSTOMER_CONTACT_NO, String occupation, String cUSTOMER_DATE_OF_BIRTH) {
		super();
		CUSTOMER_NUMBER = cUSTOMER_NUMBER;
		FIRSTNAME = fIRSTNAME;
		this.middlename = middlename;
		this.lastname = lastname;
		CUSTOMER_CITY = cUSTOMER_CITY;
		CUSTOMER_CONTACT_NO = cUSTOMER_CONTACT_NO;
		this.occupation = occupation;
		CUSTOMER_DATE_OF_BIRTH = cUSTOMER_DATE_OF_BIRTH;
	}
     
}
