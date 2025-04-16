package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Customer {
	private String customerID;
	private String fullname;
	private String phoneNumber;
	private String email; 
	private LocalDate regisDate;
	
	
	public Customer(String customerID, String fullname, String phoneNumber, String email, LocalDate regisDate) {
		super();
		this.customerID = customerID;
		this.fullname = fullname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.regisDate = regisDate;
	}


	public String getCustomerID() {
		return customerID;
	}


	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getRegisDate() {
		return regisDate;
	}


	public void setRegisDate(LocalDate regisDate) {
		this.regisDate = regisDate;
	}


	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", fullname=" + fullname + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", regisDate=" + regisDate + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(customerID);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(customerID, other.customerID);
	}
	
	
}
