package rsvier.workshop2.controller;


import rsvier.workshop2.view.*;

public class MainMenuController extends Controller{

	View view;
	Controller accountController = new AccountController();
	
	
	public MainMenuController(View view) {
		this.view = view;
	}
	
	@Override
	public void runView() {
		view.printMenuMessage();
		mainMenuSwitch(view.getIntInput());
	}
	
	
	public void mainMenuSwitch(int choice) {
		
		switch(choice) {
		case 1:	//Log in
				((AccountController)accountController).logIn();
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
