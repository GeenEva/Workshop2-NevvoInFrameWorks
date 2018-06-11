package rsvier.workshop2.domain;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

	private long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private Account account;
	
	
	public Person() {}
	
	
	public Person(String firstName, String middleName, String lastName, Account account) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.account = account;
	}

	
	@Id
	@Column(name = "person_id",nullable = false, length = 30)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}


	@Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	@Column(name = "middle_name", nullable = true)
	public String getMiddleName() {
		return middleName;
	}

	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}

	@Column(name= "last_name")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id")
	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", account=" + account + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
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
		Person other = (Person) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		return true;
	}
	
	
	
}
