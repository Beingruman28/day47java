package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setName("ruman");
		employee.setSalary(20000);
		em.persist(employee);
		
		Manager manager = new Manager();
		manager.setName("onkar");
		manager.setSalary(10000);
		manager.setDepartmentName("capgemini");
		em.persist(manager);
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database");
		em.close();
		factory.close();
	}

}
