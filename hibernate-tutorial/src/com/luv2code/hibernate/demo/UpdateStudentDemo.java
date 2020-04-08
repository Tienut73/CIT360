package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
			
		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {	
			int studentId = 1;
			
			// Get new session and start transactions
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on ID. (Primary Key)
			System.out.println("\nGetting student with ID: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Updating student...");
			myStudent.setFirstName("James");
			
			// Commit the transaction
			session.getTransaction().commit();
			
			// New Code
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// update email for all students
			System.out.println("Update email for all students");
			
			session.createQuery("update Student set email = 'student@Hogwarts.com'")
				.executeUpdate();
			
			// Commit the transaction
						session.getTransaction().commit();
						
			System.out.println("Save complete!");
		}
		finally {
			factory.close();
		}
	}

}
