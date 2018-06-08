package rsvier.workshop2.controller;


import rsvier.workshop2.view.*;

public class MainMenuController extends Controller{

	View mainMenuView = new MainMenuView();
	Controller accountController = new AccountController();
	
	
	@Override
	public void runView() {
		mainMenuView.printMenuMessage();
		mainMenuSwitch(mainMenuView.getIntInput());
	}
	
	
	public void mainMenuSwitch(int choice) {
		
		switch(choice) {
		case 1:	//Log in
				System.out.println("Log in...");
				accountController.runView();
				break;
				
		case 2: //Make new account
				((AccountController)accountController).createNewAccount();
				break;
				
		case 0: //Stay here...
				runView();
				break;
				
		default: //Stay here...
				runView();
				break;
		}
	}

}
