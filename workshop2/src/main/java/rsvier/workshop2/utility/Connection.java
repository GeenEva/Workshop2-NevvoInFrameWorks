package rsvier.workshop2.utility;

import javax.persistence.*;


public class Connection {
	
	private static EntityManagerFactory factory;

	
	public static EntityManager getEntityManager(){
		
		factory = Persistence.createEntityManagerFactory("WS2");
		EntityManager em = factory.createEntityManager();
		
		return em;
		
	}
	
	
	public static void closeEntityManagerFactory(){
		
		factory.close();
	}
	
}
