package rsvier.workshop2.dao;

public class DAOFactory {

	

	public DAOFactory(int menuChoice) {

		switch (menuChoice) {

		case 1:

			System.out.println("U werkt nu met de SQL database");
			//to be implemented
			break;
		case 2:
			System.out.println("U werkt nu met de MongoDB database");
			//to be implemented
			break;
		default:
			System.out.println("Dit is geen geldige invoer.");

			break;
		}

	}

	public void chooseSQLOrMongoSwitch() {

	}


}
