package javaHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcUrl = "jdbc:mysql://localhost:3306/sick_days?useSSL=false";
		String user = "root";
		String pass = "Lyrabon1!";
		
		try {
			System.out.println("Connecting to database: "+ jdbcUrl);
			
			Connection myConn = 
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful!!!");
			
		} catch (Exception exc) {
			exc.printStackTrace();
	}
	}
	

}

