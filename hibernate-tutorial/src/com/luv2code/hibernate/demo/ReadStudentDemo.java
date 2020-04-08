package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
			
		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {		
			// create a student object
			System.out.println("Creating new student object...");
			Student tempStudent = new Student("Neville", "Longbottom", "NevLon@Hogwarts.wiz");
			
			// begin a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving student info...");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			// commit the transaction
			session.getTransaction().commit();
			
			//New Code Pertaining to Retrieving Objects
			System.out.println("Saved student. Generated ID: " + tempStudent.getId());
			
			// Get new session and start transactions
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on ID. (Primary Key)
			System.out.println("\nGetting student with ID: " + tempStudent.getId());
			
			Student myStudent = session.get(Student.class, tempStudent.getId());
			
			System.out.println("Get complete: " + myStudent);
			// Commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Save complete!");
		}
		finally {
			factory.close();
		}
	}

}
