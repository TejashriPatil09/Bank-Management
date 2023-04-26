package com.example.userservice.model;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "customer_master")
public class Customer {
	
	@Id
	@Column(name="CUSTOMER_NUMBER")
	String customernumber;
	@Column(name="FIRSTNAME")
	String firstname;
    String middlename;
    String lastname;
    @Column(name="CUSTOMER_CITY")
	String customercity;
    @Column(name="CUSTOMER_CONTACT_NO")
	String customecontactNo;
    @Column(name="OCCUPATION")
	String occupation;
    @Column(name="CUSTOMER_DATE_OF_BIRTH")
	String dob;

    public Customer()
    {
    }

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
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

	public String getCustomercity() {
		return customercity;
	}

	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}

	public String getCustomecontactNo() {
		return customecontactNo;
	}

	public void setCustomecontactNo(String customecontactNo) {
		this.customecontactNo = customecontactNo;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Customer(String customernumber, String firstname, String middlename, String lastname, String customercity,
			String customecontactNo, String occupation, String dob) {
		super();
		this.customernumber = customernumber;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.customercity = customercity;
		this.customecontactNo = customecontactNo;
		this.occupation = occupation;
		this.dob = dob;
	}
    
    }
    



