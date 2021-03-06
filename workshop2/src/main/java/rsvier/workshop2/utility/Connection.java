package rsvier.workshop2.utility;

import javax.persistence.*;


public class Connection {
	
	private static EntityManagerFactory factory;

	
	public static EntityManagerFactory getFactory() {
		return factory;
	}


	public static void setFactory(EntityManagerFactory factory) {
		Connection.factory = factory;
	}


	public static EntityManager getEntityManager(){
		
		factory = Persistence.createEntityManagerFactory("WS22");
		EntityManager em = factory.createEntityManager();
		
		return em;
		
	}
	
	
	public static void closeEntityManagerFactory(){
		
		factory.close();
	}
	
}
