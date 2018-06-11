package rsvier.workshop2.controller;


import rsvier.workshop2.domain.*;
import rsvier.workshop2.view.*;

public class MainMenuController extends Controller{

	MainMenuView mainMenuView = new MainMenuView();
	AccountController accountController = new AccountController();
	Account account;
	
	
	//The Main Menu is always constructed with an account, so you always know what type of account is here
	public MainMenuController(Account account) {
		this.account = account;
	}

	
	@Override
	public void runView() {
		mainMenuView.printMenuMessage();
		mainMenuSwitch(account);
	}
	
	
	public void mainMenuSwitch(Account account) {
		switch(account.getAccountType()) {
		
		case ADMIN: 	mainMenuView.printADMINMainMenu();
						//to controller
		case EMPLOYEE:	mainMenuView.printEMPLOYEEMainMenu();
						//to controller
		case CUSTOMER: 	mainMenuView.printCUSTOMERMainMenu();
						//to controller
		
		default: break;
		}
	}
	
	

}
