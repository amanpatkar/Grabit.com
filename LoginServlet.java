package Vendor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","Urmila123");
			int id=	Integer.parseInt(request.getParameter("user_id"));
			String pass=request.getParameter("pwd");
			PreparedStatement pst=c.prepareStatement("select password from Login where user_id=?");
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			HttpSession hs=request.getSession();
			while(rs.next())
			{
				String dbpwd=rs.getString(1);
				if(dbpwd.equals(pass))
				{
					//hs.setAttribute("LOGIN", id);
					//response.sendRedirect("CustomerHome.jsp");
					out.println("Login Successful ");
				}
				else {
					out.println("Login Failed");
				}
			}
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

	
	

}
