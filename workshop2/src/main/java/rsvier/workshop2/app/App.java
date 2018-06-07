package rsvier.workshop2.app;

import rsvier.workshop2.dao.*;
import rsvier.workshop2.domain.Account;
import rsvier.workshop2.domain.Account.AccountType;

public class App {
	
	public static void main(String[] args){
		
		GenericDAO<Account> gd = new GenericDAOImp<>(Account.class);
		
		Account account1 = new Account("Evy","1234",AccountType.EMPLOYEE);
		Account account2 = new Account("Arno","5678",AccountType.CUSTOMER);
		Account account3 = new Account("Evert","fuck00",AccountType.CUSTOMER);
		
		gd.createObject(account1);
		gd.createObject(account2);
		gd.createObject(account3);
		
	}

}
