package Vendor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name = request.getParameter("Fname");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("No");
		String Dob=request.getParameter("DOB");
		String Email= request.getParameter("email");
		String pswd = request.getParameter("pswd");
		String Brand = request.getParameter("Brand_name");
		String loc = request.getParameter("location");
		String desc = request.getParameter("desc");
	    try
	    {
	    	VendorDAO dao=new VendorDAO();
	    	VendorGs obj1=new VendorGs();
	    	obj1.setName(name);
	    	obj1.setGenter(gender);
	    	obj1.setPhone_no(phone);
	    	obj1.setDob(Dob);
	    	obj1.setEmail(Email);
	    	obj1.setPassword(pswd);
	    	obj1.setBrand_name(Brand);
	    	obj1.setLocation(loc);
	    	obj1.setDescription(desc);
	    	dao.insertCustomer(obj1);
	    	System.out.println("DataInserted Successfully");
			
	    	
	    }
	    catch(Exception e)
	    {
	    	out.println(e);
	    }
	}

	


}
