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
		mainMenuView.printAccountInfo(account);
	}
	
	
	
	

}
