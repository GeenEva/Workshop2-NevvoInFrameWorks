package rsvier.workshop2.controller;

import rsvier.workshop2.dao.*;
import rsvier.workshop2.domain.*;
import rsvier.workshop2.domain.Account.AccountType;
import rsvier.workshop2.service.Hashing;
import rsvier.workshop2.service.Validator;
import rsvier.workshop2.view.*;

public class AccountController extends Controller{

	private AccountView accountView = new AccountView();
	private GenericDAO genDAO = new GenericDAOImp();
	private Validator validator = new Validator();
	private Hashing hashing = new Hashing();
	private AddressController addressController = new AddressController();
	private PersonController personController = new PersonController();
	
	public AccountController() {
	}
	

	
	@Override
	public void runView() {
		accountView.printHeaderMessage();
		
	}

	public Account createNewAccount() {
		
		String email = requestAndValidateNewEmail();
		String password = requestAndValidateNewPassword();
	
		accountView.printRequestTypeOfAccount();
		AccountType accountType = switchTypeOfAccount(accountView.getIntInput());
		
		Account account = new Account(email, password, accountType);
		
		personController.createNewPerson(account);
	//	addressController.createNewAddress();
		
		return account;
	}


	public String requestAndValidateNewEmail() {
		
		String email;
		do {
		accountView.printRequestEmail();
		email = accountView.getStringInput();
		
		} while (!Validator.emailCreateValidation(email));
		
		return email;
	}
	
	
	private String requestAndValidateNewPassword() {
		
		String password;
		
		do {
		accountView.printRequestPassword();
		password = accountView.getStringInput();
		} while (!Validator.passWordCreateValidation(password));
		
		return hashing.createHash(password);
	}
	
	
	public AccountType switchTypeOfAccount(int choice) {
		
		switch(choice) {
		case 1: return AccountType.ADMIN;
		
		case 2: return AccountType.EMPLOYEE;
		
		case 3: return AccountType.CUSTOMER;
		
		default:System.out.println("Wrong input...");;
				runView();
				return null;
		}
	}
	
	
	
	public Account logIn() {
		
		Account account = validator.loginAccountValidation();
		
		if (account == null) {
			 return null; }
		
		
		return account;
	}
	
	
	
	
	public String requestAndValidateEmail(String email) {
		
		return email;
	}
	
	
	
	
}
