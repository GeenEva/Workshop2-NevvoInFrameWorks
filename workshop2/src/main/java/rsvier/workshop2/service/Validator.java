package rsvier.workshop2.service;

import rsvier.workshop2.dao.GenericDAO;
import rsvier.workshop2.dao.GenericDAOImp;
import rsvier.workshop2.domain.*;
import rsvier.workshop2.domain.Account.AccountType;
import rsvier.workshop2.view.*;


public class Validator {

	AccountView accountView = new AccountView();
	
	Hashing hashing = new Hashing();
	
	
	
	public Account loginAccountValidation() {
		
		Account account = new Account();
		GenericDAO<Account> genDAO = new GenericDAOImp(account.getClass());
		accountView.printRequestEmail();
		String email = accountView.getStringInput();
		accountView.printRequestPassword();
		String password = accountView.getStringInput();
		
		//Get the row where column "ColumnName" has the value "genString"
		account = (Account)genDAO.getObject("email", email);

		if (account == null || (!hashing.checkPassword(password, account.getPassword()))) {
			genDAO.clearEntityManager();
			System.out.println("\nUw gegevens zijn onjuist.\n");
			return null;
		}
		
		return account;
	}
	
	
	public static boolean emailCreateValidation(String email) {
		
		if (!email.matches("\\w+@\\w+\\.\\w+")) {
			System.out.println("Dit is geen geldig e-mail adres");
			return false;
		}
		
		return true;
		
	}
	
	
	public static boolean passWordCreateValidation(String password) {
		if (password.matches(".*\\s+.*")) {
			System.out.println("Uw wachtwoord mag geen spatie bevatten.");
			return false;
		}
		if (!(password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=])(?=\\S+$).{8,}$"))) {
			System.out.println(
				"Uw wachtwoord moet minstens een hoofdletter, een kleine letter, een getal \nen een speciaal "
				+ "leesteken bevatten en uit minimaal 8 karakters bestaan.");
			return false;
		}

		return true;
		
	}

	
	public boolean postalCodeCreateValidation(String postalCode) {
		if (!postalCode.matches("^[1-9][0-9]{3}\\s?[a-zA-Z]{2}$")) {
			System.out.println("De ingevulde postcode is niet correct.");
			return false;
		}

		return true;
	}


	public boolean checkAdminAuthority(AccountType accountType) {
		
		if(accountType == AccountType.ADMIN) {
			
			System.out.println("Geef admin wachtwoord: ");
			String woordje = accountView.getStringInput();
		
			if(!woordje.equals("sesampasta")) {
				return false;
			}
		}
		return true;
	}
	
}
