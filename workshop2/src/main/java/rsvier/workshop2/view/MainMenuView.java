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
	
	public void printADMINMainMenu() {
		System.out.println("\nWelkom in het hoofdmenu van Administrator. " +
				"Maak uw keuze:\n1 = \n2 = \n3 =");
	}
	
	public void printEMPLOYEEMainMenu() {
		System.out.println("\nWelkom in het hoofdmenu van Medewerker. " +
				"Maak uw keuze:\n1 = \n2 = \n3 =");
	}
	
	public void printCUSTOMERMainMenu() {
		System.out.println("\nWelkom in het hoofdmenu van Klant. " +
				"Maak uw keuze:\n1 = \n2 = \n3 =");
	}
}
