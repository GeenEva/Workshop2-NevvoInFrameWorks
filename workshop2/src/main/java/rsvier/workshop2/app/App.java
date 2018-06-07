package rsvier.workshop2.app;

import java.util.List;

import rsvier.workshop2.dao.*;
import rsvier.workshop2.domain.Account;
import rsvier.workshop2.domain.Account.AccountType;

public class App {
	
	public static void main(String[] args){
		
		GenericDAOImp<Account> gd = new GenericDAOImp<>(Account.class);
		
		
		Account account1 = new Account("Evy","1234",AccountType.EMPLOYEE);
		Account account2 = new Account("Arno","5678",AccountType.CUSTOMER);
		
		
		
		
		/*      					create() = works!!
		
		gd.createObject(account1);
		gd.createObject(account2);
		gd.createObject(account3);
		
		
		
	
		
		
		/*		 					getAll() = works!!
		 
		 
		List<Account> list = gd.getAllObject();
		
		for(int i = 0; i < list.size() ; i++){
			
			System.out.println(list.get(i).toString());
		}
	
		
		
		
									update() + get() = work!
		
		Account account = gd.getObject(5);
		System.out.println("Old info\n" + account.toString());;
		
		account.setPassword("newPassword");
		gd.updateObject(account);
		
		Account accountNew = gd.getObject(5);
		System.out.println("New info" + accountNew.toString());;
		
		*/
		
		
			//						delete() = work!
		
		gd.deleteObject(4);
		
		
	}

}
