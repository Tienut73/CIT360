package eureka;
import java.io.*;
import java.servlet.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Basic extends HttpServlet {
		private String message;
			public void init() throws ServletException {
				// require initialization
				message = "Welcome to GardenAnywhereBox.com!";
			}
			
			public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
				
				//Set response
				response.setContentType("text/html");
				
				//Actual logic
				PrintWriter out = response.getWriter();
				out.println("<h1>" + message + "</h1>");
			}
			
			public void destroy() {
				
			}
}
