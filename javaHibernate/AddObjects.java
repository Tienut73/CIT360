package javaHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class AddObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// create session factory
			SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(SickDays.class)
									.buildSessionFactory();
			
			// create session
			Session session = factory.getCurrentSession();
			
			// use the session object to save java object
			try {
				
				// create a student object
				System.out.println("Creating new student object...");
				SickDays house1 = new SickDays();
				SickDays house2 = new SickDays();
				SickDays house3 = new SickDays();
				// start a transaction
				session.beginTransaction();
				
				// save the student object
				System.out.println("Saving the student...");
				session.save(house1);
				session.save(house2);
				session.save(house3);
				// commit transaction
				session.getTransaction().commit();
				
				System.out.println("Done!");
				
			}
			
			finally {
				factory.close();
		}

		}
	


	}
	

