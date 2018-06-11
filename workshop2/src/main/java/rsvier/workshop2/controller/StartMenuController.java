package rsvier.workshop2.controller;

import rsvier.workshop2.domain.Account;
import rsvier.workshop2.view.StartMenuView;

public class StartMenuController extends Controller{

	StartMenuView startMenuView = new StartMenuView();
	AccountController accountController = new AccountController();
	Account account;
	
	@Override
	public void runView() {
		
		startMenuView.printHeaderMessage();
		startMenuView.printMenuMessage();
		startMenuSwitch(startMenuView.getIntInput());
	}
	

public void startMenuSwitch(int choice) {
		
		switch(choice) {
				
		case 1: //Make new account
				account = accountController.createNewAccount();
				new MainMenuController(account).runView();
				runView();
				break;
				
		case 2:	//Log in
				account = accountController.logIn();
				new MainMenuController(account).runView();
				runView();
				break;
				
		case 0: //Leave application
				break;
				
		default: //Stay here...
				System.out.println("Ongeldige keuze");
				runView();
				break;
		}
	}
	
}
