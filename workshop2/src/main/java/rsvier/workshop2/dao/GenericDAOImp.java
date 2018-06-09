package rsvier.workshop2.dao;

import java.util.List;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import rsvier.workshop2.domain.Account;
import rsvier.workshop2.utility.Connection;

public class GenericDAOImp<T> implements GenericDAO<T> {
		
	private EntityManager entityManager;
	public Class<T> classs;
	private Account account;
	
	
	public GenericDAOImp(){
		
		entityManager = Connection.getEntityManager();
		
	}
	
	
	public GenericDAOImp(Class<T> classToSet){
		
		entityManager = Connection.getEntityManager();
		this.classs = classToSet;
	}

	
	public void createObject(T entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
	
	}
	

	
	public T getObject(Class<T> classs,long id) {
		
		return entityManager.find(classs, id);
	}
	
	
	public T getObject(long id){
		
		return entityManager.find(classs, id);
	}
	
	
	public List<T> getAllObject(){
		
		entityManager.getTransaction().begin();
		entityManager.clear();
		String className = classs.getSimpleName();
		List<T> list = entityManager.createQuery("SELECT entity FROM " + className + " entity").getResultList();
		entityManager.getTransaction().commit();
		
		return list;
		
	}


	
	public void updateObject(T entity) {
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		
	}


	public void deleteObject(long id) {
		entityManager.getTransaction().begin();
		entityManager.clear();
		entityManager.remove(entityManager.find(classs, id));;
		entityManager.getTransaction().commit();
		
	}
	
	public void closeEntityManager() {
		entityManager.close();
	}

	
		//Testing criteria on non-generic DAO
		public Account getAccount(String email) {
			
			CriteriaBuilder builder = Connection.getFactory().getCriteriaBuilder();
			CriteriaQuery<Account> criteria = builder.createQuery(Account.class);
			Root<Account> accountRoot = criteria.from(Account.class);
			criteria.select(accountRoot);
			criteria.where(builder.equal(accountRoot.get( "email" ), email));

			return entityManager.createQuery(criteria).getSingleResult();
		}
	
		//Trying out the same one in a generic way
		public T getObject(String columnName, String genString) {
		
			CriteriaBuilder builder = Connection.getFactory().getCriteriaBuilder();
			CriteriaQuery<T> criteria = (CriteriaQuery<T>) builder.createQuery(classs);
			Root<T> rootObject = (Root<T>) criteria.from(classs);
			criteria.select(rootObject);
			//Get the row where column "ColumnName" has the value "genString"
			criteria.where(builder.equal(rootObject.get( columnName ), genString));

			return entityManager.createQuery(criteria).getSingleResult();
			
		}
		
}
