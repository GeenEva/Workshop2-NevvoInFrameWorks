package rsvier.workshop2.view;

import rsvier.workshop2.domain.Account;

public class MainMenuView extends View{

	
	@Override
	public void printHeaderMessage() {
		System.out.println("*....*....* Hoofd Menu *....*....*");
		
	}

	@Override
	public void printMenuMessage() {
		System.out.println("Welkom in het hoofdmenu");
		
	}

	public void printAccountInfo(Account account) {
		System.out.println("U heeft account type: " + account.getAccountType().toString());
	}
}
