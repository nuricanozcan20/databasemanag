package domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import system.Main;
import ui.Gender;



public class RegisteredUser extends User {
	
	private String identificationNumber;
	private String password;
	private String dateOfBirth;
	private Gender gender;
	private String emails;
	private String address;
	private String registrationDate;
	
	public RegisteredUser(String libraryID, String password, String fname, String minit, String lname, String phoneNumber,
			String identificationNumber, String dateOfBirth, Gender gender, String emails, String address, String registrationDate) {
		super(libraryID,fname,minit,lname,phoneNumber);
		this.password = password;
		this.identificationNumber = identificationNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.emails = emails;
		this.address = address;
		this.registrationDate = registrationDate;
	}
	
	
	public static boolean authenticateUser(String libid_entry, String pass_entry ) throws SQLException {
		
		
        String user = "SELECT * FROM User WHERE lib_id='"+libid_entry+"'";
        String ruser = "SELECT * FROM RegisteredMember WHERE lib_id='"+libid_entry+"'";

        ResultSet resultSet = Main.getStatement().executeQuery(user);
        if (resultSet.next()) {
            // Retrieving data from the result set
            String lib_id = resultSet.getString("lib_id");

        
            System.out.println("Retrieved entry:");
            System.out.println("ID: " + lib_id);
            resultSet = Main.getStatement().executeQuery(ruser);
            if(resultSet.next()) {
            	String p_true = resultSet.getString("password");
                System.out.println("Password: " + p_true);
                if(p_true.equals(pass_entry)) {
                	return true;
                }

            }
           
        } else {
            return false;
        }

        
		return false;
	}
	
	public static RegisteredUser getUser(String libid_entry) throws SQLException {
		
        String user = "SELECT * FROM User WHERE lib_id='"+libid_entry+"'";
        ResultSet resultSet = Main.getStatement().executeQuery(user);
        if (resultSet.next()){
	        String libraryID = resultSet.getString("lib_id");
	        String fname = resultSet.getString("fname");
	        String minit = resultSet.getString("minit"); 
	        String lname = resultSet.getString("lname"); 
	        String phoneNumber = resultSet.getString("phonenum");   
	        
	        String ruser = "SELECT * FROM RegisteredMember WHERE lib_id='"+libid_entry+"'";
	        resultSet = Main.getStatement().executeQuery(ruser);
	        if(resultSet.next()) {
				String identificationNumber = resultSet.getString("cit_id");
				String dateOfBirth = resultSet.getString("birth_date");
				Gender gender;
				if(resultSet.getString("gender").equals("MALE")) {
					 gender = Gender.MALE;
				}else {
					 gender = Gender.FEMALE;
				}
				String emails = resultSet.getString("email");
				String address = resultSet.getString("address");
				String registrationDate = resultSet.getString("reg_date");
				String password = resultSet.getString("password");
				
				return new RegisteredUser(libraryID, password, fname, minit, lname, phoneNumber, identificationNumber, dateOfBirth, gender, emails, address, registrationDate);
	        }
        }
		
		
        return null;
		
        

	}


	public String getIdentificationNumber() {
		return identificationNumber;
	}


	public String getPassword() {
		return password;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public Gender getGender() {
		return gender;
	}


	public String getEmails() {
		return emails;
	}


	public String getAddress() {
		return address;
	}


	public String getRegistrationDate() {
		return registrationDate;
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
