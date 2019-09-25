package Vendor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Vendor.VendorGs;
import Vendor.DBConnection;
public class VendorDAO {
	Connection c=null;
	public VendorDAO() throws ClassNotFoundException,SQLException
	{
		c=DBConnection.getConnection();
	}
	public void insertCustomer(VendorGs obj) throws SQLException
	{
		
			String INSERTQUERY="insert into Vendor values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst=c.prepareStatement(INSERTQUERY);
			pst.setString(1,obj.getName());
			pst.setString(2,obj.getDob());
			pst.setString(3,obj.getGenter());
			pst.setString(4,obj.getPhone_no());
			pst.setString(5,obj.getEmail());
			pst.setString(6,obj.getPassword());
			pst.setString(7,obj.getBrand_name());
			pst.setString(8,obj.getLocation());
			pst.setString(9,obj.getDescription());
		    pst.execute();
		    System.out.println("DataInserted Successfully");
			
	}



}

