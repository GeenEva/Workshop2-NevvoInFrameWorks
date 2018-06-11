package rsvier.workshop2.controller;


import rsvier.workshop2.domain.*;
import rsvier.workshop2.view.*;

public class MainMenuController extends Controller{

	MainMenuView mainMenuView = new MainMenuView();
	AccountController accountController = new AccountController();
	Account account;
	ProductController productController = new ProductController();
	
	
	//The Main Menu is always constructed with an account, so you always know what type of account is logged in here
	public MainMenuController(Account account) {
		this.account = account;
	}

	
	@Override
	public void runView() {
		mainMenuView.printHeaderMessage();
		mainMenuSwitch(account);
	}
	
	
	public void mainMenuSwitch(Account account) {
		
		switch(account.getAccountType()) {
		
		case ADMIN: 	mainMenuView.printAdminMainMenu();
						//to controller
						break;
						
		case EMPLOYEE:	mainMenuView.printEmployeeMainMenu();
						employeeMainMenuSwitch(mainMenuView.getIntInput());
						runView();
						break;
						
		case CUSTOMER: 	mainMenuView.printCustomerMainMenu();
						customerMainMenuSwitch(mainMenuView.getIntInput());
						break;
						
		default: 		break;
		}
	}


	private void customerMainMenuSwitch(int choice) {
		
		switch(choice) {
		
		case 1:
			 	break;
		case 2: 
				break;
		case 0: 
				break;
				
		default: break;
		}
		
	}


	private void employeeMainMenuSwitch(int choice) {
		
		switch(choice) {
			case 1: 	//Go to Product Menu
						productController.runView();
						break;
						
			case 2: 	//Go to Customer Menu
						System.out.println("Dit gedeelte werkt nog niet.");
						runView();
						break;
						
			case 3:		//Go to Order Menu
						System.out.println("Dit gedeelte werkt nog niet.");
						runView();
						break;
						
			case 0: 	//Go back and log out
						System.out.println("\n...Je logt nu uit...\n");
						break;
						
			default: 	break;
					
		}
		
	}
	
	

}
