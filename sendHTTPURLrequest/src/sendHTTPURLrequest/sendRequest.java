package sendHTTPURLrequest;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;


public class sendRequest {
	public static void main(String[] args) {
		
		try {
			URL urlD = new URL("http:https://gardenanywherebox.com/?lang=eng");
			HttpURLConnection urlDcon = (HttpURLConnection) urlD.openConnection();
		
			urlDcon.connect();
			
			InputStream incoming = urlDcon.getInputStream();
			
			System.out.println(incoming);
			
			String serverName = "localhost";
			String mydatabase = "mydatabase";
			String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
			
			String username = "username";
			String password = "password";
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection.isClosed());
		} catch (Exception e) {
			System.out.println("Database cannot be accessed.");
		}
		
}
}