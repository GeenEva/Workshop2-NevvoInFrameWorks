package rsvier.workshop2.view;

import rsvier.workshop2.domain.Account;

public class MainMenuView extends View{

	
	@Override
	public void printHeaderMessage() {
		System.out.println("\n- - - - - - - - Hoofd Menu - - - - - - - -");
		
	}

	@Override
	public void printMenuMessage() {
		System.out.println("Welkom in het hoofdmenu");
		
	}

	public void printAccountInfo(Account account) {
		System.out.println("Je hebt account type: " + account.getAccountType().toString());
	}
	
	public void printAdminMainMenu() {
		System.out.println("\nWelkom in het hoofdmenu van Administrator. " +
				"Maak je keuze:\n\n1 = \n2 = \n3 = \n0 = Uitloggen\n");
	}
	
	public void printEmployeeMainMenu() {
		System.out.println("\nWelkom in het hoofdmenu van Medewerker. " +
				"Maak je keuze:\n\n1 = Ga naar Product Menu\n2 = Ga naar Klant Menu"
					+ "\n3 = Ga naar Bestellingen Menu\n0 = Uitloggen\n");
	}
	
	public void printCustomerMainMenu() {
		System.out.println("\nWelkom in het hoofdmenu van Klant. " +
				"Maak je keuze:\n\n1 = Bekijk alle Nevvo producten\n2 = Bekijk je bestellingen" +
					"\n3 = Bekijk je persoonlijke gegevens\n0 = Uitloggen\n");
	}
}
