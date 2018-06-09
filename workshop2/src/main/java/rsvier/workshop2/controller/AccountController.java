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
	private Validator validator;
	private Hashing hashing;
	
	public AccountController() {
	}
	

	
	@Override
	public void runView() {
		accountView.printHeaderMessage();
		
	}
	
	
	public void createNewAccount() {
		
		String email = requestAndValidateCreateEmail();
		
		//password validation not working yet
		//String password = requestAndValidateCreatePassword();
		
		accountView.printRequestPassword();
		String password = accountView.getStringInput();
		
		accountView.printRequestTypeOfAccount();
		AccountType accountType = switchTypeOfAccount(accountView.getIntInput());
		
		Account account = new Account(email, password, accountType);
		
		genDAO.createObject(account);
		genDAO.closeEntityManager();
	}


	public String requestAndValidateCreateEmail() {
		String email;
		do {
		accountView.printRequestEmail();
		email = accountView.getStringInput();
		
		} while (!Validator.emailCreateValidation(email));
		
		return email;
	}
	
	
	private String requestAndValidateCreatePassword() {
		
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
	
	public void logIn() {
		validator.loginAccountValidation();
		//use accounttype to go to accountHomeMenu for admin/employee/customer
	}
	
	public String requestAndValidateEmail(String email) {
		
		return email;
	}
	
	
}
