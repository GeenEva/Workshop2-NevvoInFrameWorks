package rsvier.workshop2.app;

import java.util.List;

import rsvier.workshop2.controller.MainMenuController;
import rsvier.workshop2.controller.StartMenuController;
import rsvier.workshop2.dao.*;
import rsvier.workshop2.domain.Account;
import rsvier.workshop2.domain.Account.AccountType;
import rsvier.workshop2.view.MainMenuView;
import rsvier.workshop2.view.StartMenuView;

public class WS2MainStage {
	
	public static void main(String[] args){

	
		/*		Account account = new Account();
		GenericDAO genDAO = new GenericDAOImp(account.getClass());
		
		Account account2 = (Account)genDAO.getObject("email", "mailmail");
		
		System.out.println(account2.toString());
	*/	
		
	//	MainMenuController mainMenu = new MainMenuController();
	//	mainMenu.runView();
		
		
		StartMenuController startMenuController = new StartMenuController();
		startMenuController.runView();
		
	}

}
