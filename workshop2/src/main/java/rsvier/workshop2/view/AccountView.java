package rsvier.workshop2.view;

public class AccountView extends View{

	@Override
	public void printHeaderMessage() {
		System.out.println("- - - - - Account Menu - - - - -");
	}
	

	@Override
	public void printMenuMessage() {
	}
		
	
		
	public void printRequestEmail() {
		System.out.print("Vul e-mailadres in: ");
	}

	public void printRequestPassword() {
		System.out.print("Vul wachtwoord in: ");
	}
	
	public void printRequestTypeOfAccount() {
		System.out.println("Geef type account:\n1 = Admin\n2 = Employee\n3 = Customer\n");
	}

	public void printLoginDetailsWrong() {
        System.out.println("De opgegeven inloggegevens zijn onjuist!");
    }
	
	public void printLoginAccountIsSuccessful() {
		System.out.println("\nU bent nu ingelogd in uw account.");
	}
	
	public void printAccountNotFound() {
		System.out.println("Geen account met dit e-mailadres gevonden.");
	}


	public void printYourAccountHasBeenCreated() {
		System.out.println("\nUw account is aangemaakt.");
		
	}
	
}
