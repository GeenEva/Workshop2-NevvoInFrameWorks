package rsvier.workshop2.controller;

import rsvier.workshop2.dao.*;
import rsvier.workshop2.domain.*;
import rsvier.workshop2.domain.Account.AccountType;
import rsvier.workshop2.view.*;

public class AccountController extends Controller{

	private AccountView accountView = new AccountView();
	private GenericDAO genDAO = new GenericDAOImp();
	
	public AccountController() {
	}
	

	
	@Override
	public void runView() {
		
		accountView.printHeaderMessage();

	}
	
	
	public void createNewAccount() {
		accountView.printRequestEmail();
		String email = accountView.getStringInput();
		accountView.printRequestPassword();
		String passWord = accountView.getStringInput();
		accountView.printRequestTypeOfAccount();
		AccountType accountType = switchTypeOfAccount(accountView.getIntInput());
		
		Account account = new Account(email, passWord, accountType);
		
		genDAO.createObject(account);
		genDAO.closeEntityManager();
	}

	public AccountType switchTypeOfAccount(int choice) {
		
		switch(choice) {
		case 1: return AccountType.ADMIN;
		//	break;
		case 2: return AccountType.EMPLOYEE;
		//	break;
		case 3: return AccountType.CUSTOMER;
		//	break;
		default:return null;
			
		//	break;
		}
	}
}
