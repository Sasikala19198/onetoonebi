package com.ty.onetoonebi_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi_dto.Person;

public class PersonDao {

	public void savePerson(Person person) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("umsgs");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(person);
		em.persist(person.getCard());
		et.commit();

	}

	public void findPerson(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("umsgs");
		EntityManager em = emf.createEntityManager();
		EntityManager em1= emf.createEntityManager();


		Person person = em.find(Person.class, id);
		Person person1 = em.find(Person.class, id);
		Person person2 = em1.find(Person.class, id);




	}
}
