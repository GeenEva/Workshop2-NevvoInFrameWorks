package rsvier.workshop2.dao;

import rsvier.workshop2.domain.Account;

public interface GenericDAO<T> {
	
	public void createObject(T entity);
	public T getObject(Class<T> classs, long id);
	
	public void updateObject(T entity);
	public void deleteObject(long id);
	public void closeEntityManager();
	
	//Testing criteria on non-generic DAO
	public Account getAccount(String email);

}
