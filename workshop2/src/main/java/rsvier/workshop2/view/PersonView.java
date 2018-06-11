package rsvier.workshop2.view;

public class PersonView extends View {

	@Override
	public void printHeaderMessage() {
		System.out.println(" - - - - - - Persoonsgegevens - - - - - - ");
		
	}

	@Override
	public void printMenuMessage() {
		System.out.println("\n1 = Bekijk gegevens\n2 = Pas gegevens aan\n0 Ga terug naar vorige menu");
	}

	public void printRequestName() {
		System.out.println("Voornaam: ");
	}
	
	public void printRequestMiddleName() {
		System.out.println("Tussenvoegsel: ");
	}

	public void printRequestLastName() {
		System.out.println("Achternaam: ");
	}
}
