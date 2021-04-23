package com.cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpMain {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("empentity");
		EntityManager em=emf.createEntityManager();
		Emp emp=new Emp(12345,"Aditya","Developer");
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		em.close();
		System.out.println("Employee saved");

	}

}
