package rsvier.workshop2.controller;

import rsvier.workshop2.dao.*;
import rsvier.workshop2.domain.*;
import rsvier.workshop2.view.*;

public class PersonController extends Controller {
	
	private PersonView personView = new PersonView();
	

	@Override
	public void runView() {
		// TODO Auto-generated method stub
		
	}

	public void createNewPerson(Account account) {
		Person person = new Person();
		GenericDAO genDAOPerson = new GenericDAOImp(person.getClass());
		
		personView.printRequestName();
		person.setFirstName(personView.getStringInput());
		personView.printRequestMiddleName();
		person.setMiddleName(personView.getStringInput());
		personView.printRequestLastName();
		person.setLastName(personView.getStringInput());
		person.setAccount(account);
		
		genDAOPerson.createObject(person);
		genDAOPerson.closeEntityManager();
	}

}
