package Eureka1;

import java.io.IOException;
import java.io.PrintWriter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BasicLogin extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
	 	res.setContentType("text/html");
		
		String user=req.getParameter("userName");
		String pass=req.getParameter("userPassword");
		
		if(user.equals("Logan") && pass.equals("qwerty123"))
			pw.println("Login Success...!");
		else
			pw.println("Login Failed...!");
		pw.close();
	}
}

