package rsvier.workshop2.view;

public class ProductView extends View{

	@Override
	public void printHeaderMessage() {
		System.out.println("- - - - - Product Menu - - - - -");
		
	}

	@Override
	public void printMenuMessage() {
		System.out.println("\n1 = Maak nieuw product aan\n2 = Bekijk Producten\n0 = Terug naar Hoofd Menu");
		
	}
	
	public void printAskProductName() {
		System.out.println("\nGeef de naam van het product: ");
	}

	public void printAskProductPrice() {
		System.out.println("\nGeef de prijs van het product: € ");
	}
	
	public void printAskProductStock() {
		System.out.println("\nGeef het aantal toe te voegen aan de voorraad: ");
	}
	

}
