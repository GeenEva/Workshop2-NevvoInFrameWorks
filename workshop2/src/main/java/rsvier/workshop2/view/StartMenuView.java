package rsvier.workshop2.view;

public class StartMenuView extends View{

	@Override
	public void printHeaderMessage() {
		System.out.println("- - - - Start Menu - - - -");
		
	}

	@Override
	public void printMenuMessage() {
		System.out.println("\n1 = Maak nieuw account aan\n2 = Log in\n0 = Verlaat Nevvo");
		
	}

}
