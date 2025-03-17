package domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import system.Main;
import ui.Gender;

public class Visitor extends User{
	
	
	public Visitor(String libraryID, String fname, String minit, String lname, String phoneNumber) {
		
		super(libraryID,fname,minit,lname,phoneNumber);
	}
	
	public static boolean authenticateVisitor(String libid_entry) throws SQLException {
		
		
        String ruser = "SELECT * FROM Visitor WHERE lib_id='"+libid_entry+"'";

        ResultSet resultSet = Main.getStatement().executeQuery(ruser);
        if (resultSet.next()) {
            // Retrieving data from the result set
            String lib_id = resultSet.getString("lib_id");
            

        
		return true;
	}
        return false;
	}
	
	public static Visitor getVisitor(String libid_entry) throws SQLException {
		
        String user = "SELECT * FROM User WHERE lib_id='"+libid_entry+"'";
        ResultSet resultSet = Main.getStatement().executeQuery(user);
        if (resultSet.next()){
	        String libraryID = resultSet.getString("lib_id");
	        String fname = resultSet.getString("fname");
	        String minit = resultSet.getString("minit"); 
	        String lname = resultSet.getString("lname"); 
	        String phoneNumber = resultSet.getString("phonenum");   
	        
	        return new Visitor(libraryID, fname, minit, lname, phoneNumber);
	        }
		
		
        return null;
		
        

	}
	
	public String getLibraryID() {
		return super.getLibraryID();
	}

	public String getFname() {
		return super.getFname();
	}

	public String getMinit() {
		return super.getMinit();
	}

	public String getLname() {
		return super.getLname();
	}

	public String getPhoneNumber() {
		return super.getPhoneNumber();
	}

}
