 package com.Rakesh.JPA_Implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
    	EntityManager em=emf.createEntityManager();
    	StudentDB s=em.find(StudentDB.class,1);
    	System.out.println(s);
    	
    	
    	//adding values for DB
    	em.getTransaction().begin();
    	StudentDB s1=new StudentDB();
    	s1.setRoolno(2);
    	s1.setName("gopal");
    	s1.setMarks(100);
    	em.persist(s1);
    	em.getTransaction().commit();
    }
    
}
