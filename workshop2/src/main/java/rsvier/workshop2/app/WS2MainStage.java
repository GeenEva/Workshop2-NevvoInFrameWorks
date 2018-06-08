package rsvier.workshop2.app;

import java.util.List;

import rsvier.workshop2.controller.MainMenuController;
import rsvier.workshop2.dao.*;
import rsvier.workshop2.domain.Account;
import rsvier.workshop2.domain.Account.AccountType;

public class WS2MainStage {
	
	public static void main(String[] args){
		
		MainMenuController mainMenu = new MainMenuController();
		mainMenu.runView();
		
	}

}
