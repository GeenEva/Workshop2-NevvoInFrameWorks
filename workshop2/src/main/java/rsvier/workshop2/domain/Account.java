package rsvier.workshop2.domain;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
	
	
	public enum AccountType {ADMIN, EMPLOYEE, CUSTOMER }
	
	private long id;
	private String email;
	private String password;
	private AccountType accountType;
	
	private Person person;
	
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
		return id;
	}
	
	
	public void setAccountId(long id) {
		this.id = id;
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
	

	@OneToOne
	@PrimaryKeyJoinColumn
	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", password=" + password + ", accountType=" + accountType
				+ ", person=" + person + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
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
		if (accountType != other.accountType)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

	

	
}
