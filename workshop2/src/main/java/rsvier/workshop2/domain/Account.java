package rsvier.workshop2.domain;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
	
	
	public enum AccountType {ADMIN , EMPLOYEE , CUSTOMER }
	
	private long accountId;
	private String email;
	private String password;
	private AccountType accountType;
	
	public Account(){
		
	}
	
	public Account(String email, String password, AccountType accountType){
		this.email = email;
		this.password = password;
		this.accountType = accountType;
	}
	
	@Id
	@Column(name = "account_id",nullable = false, length = 30)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getAccountId() {
		return accountId;
	}
	
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	
	@Column(nullable = false, length = 60)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(nullable = false, length = 60)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name = "account_type",nullable = false)
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", password=" + password + ", accountType="
				+ accountType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountId ^ (accountId >>> 32));
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
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
		
		if (accountId != other.accountId)
			return false;
		if (accountType != other.accountType)
			return false;
			
			
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	
	
	

}
