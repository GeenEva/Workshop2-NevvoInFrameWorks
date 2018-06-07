package rsvier.workshop2.dao;

import java.util.List;

import javax.persistence.*;

import rsvier.workshop2.utility.Connection;

public class GenericDAOImp<T> implements GenericDAO<T> {
	
	
	
	private EntityManager entityManager;
	public Class<T> classs;
	
	
	
	public GenericDAOImp(){
		
		entityManager = Connection.getEntityManager();
		
	}
	
	public GenericDAOImp(Class<T> classToSet){
		
		entityManager = Connection.getEntityManager();
		this.classs = classToSet;
	}

	@Override
	public void createObject(T entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
	
	}

	@Override
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

	@Override
	public void updateObject(T entity) {
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		
		
	}

	@Override
	public void deleteObject(long id) {
		entityManager.getTransaction().begin();
		entityManager.clear();
		entityManager.remove(entityManager.find(classs, id));;
		entityManager.getTransaction().commit();
		
		
	}

}
