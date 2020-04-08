package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// create session factory
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {		
					// create 3 student objects
					System.out.println("Creating new student object...");
					Student tempStudent1 = new Student("Harry", "Potter", "HarPot@Hogwarts.wiz");
					Student tempStudent2 = new Student("Ron", "Weasley", "RonWea@Hogwarts.wiz");
					Student tempStudent3 = new Student("Hermione", "Granger", "HerGra@Hogwarts.wiz");

					// begin a transaction
					session.beginTransaction();
					
					// save the student object
					// Each student automatically gets their own ID
					System.out.println("Saving student info...");
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);

					// commit the transaction
					session.getTransaction().commit();
					
					System.out.println("Save complete!");
				}
				finally {
					factory.close();
				}

	}

}
