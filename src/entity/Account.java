package entity;

import java.util.Objects;

public class Account {
	private String accountID;
	private String username;
	private String password;
	private String Status;
	
	
	public Account(String accountID, String username, String password, String status) {
		super();
		this.accountID = accountID;
		this.username = username;
		this.password = password;
		Status = status;
	}


	public String getAccountID() {
		return accountID;
	}


	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", username=" + username + ", password=" + password + ", Status="
				+ Status + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(accountID);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountID, other.accountID);
	}
	
	
	
}
