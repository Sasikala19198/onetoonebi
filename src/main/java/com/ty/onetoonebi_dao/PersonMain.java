package com.ty.onetoonebi_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi_dto.Pancard;
import com.ty.onetoonebi_dto.Person;

public class PersonMain {

	public static void main(String[] args) {

		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("umsgs");
		//EntityManager em = emf.createEntityManager();
		//EntityManager em1 = emf.createEntityManager();
		//EntityTransaction et = em.getTransaction();

		/*
		 * Pancard card = new Pancard(); card.setName("gowsi");
		 * card.setPannumber("CDFGG7698M");
		 * 
		 * Person person = new Person(); person.setName("gowsi"); person.setAge(25);
		 * person.setGender("female"); person.setAddress("madurai");
		 * 
		 * card.setPerson(person); person.setCard(card);
		 */

		PersonDao dao = new PersonDao();
		dao.findPerson(2);
		
			//System.out.println(person);
		//System.out.println(person2);

		//dao.savePerson(person);
		// Person person=em.findPerson(2);

	}
}
