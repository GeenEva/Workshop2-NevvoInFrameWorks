package rsvier.workshop2.view;

public class MainMenuView extends View{

	@Override
	public void printHeaderMessage() {
		System.out.println("*....*....* Nevvo*....*....*");
		
	}

	@Override
	public void printMenuMessage() {
		System.out.println("\n1 = Inloggen\n2 = Maak nieuw account\n0 = Verlaat Nevvo");
		
	}

}
