package system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JPasswordField;

import domain.RegisteredUser;
import domain.User;
import ui.Gender;

public class UserFactory {
	
	private String libraryID;
	private String password;
	private String fname;
	private String minit;
	private String lname;
	private String phoneNumber;
	private String identificationNumber;
	private String dateOfBirth;
	private Gender gender;
	private String emails;
	private String address;
	private Date registrationDate;
	
	public UserFactory(String fname, String minit, String lname,
			String phoneNumber) {
		this.fname = fname;
		this.minit = minit;
		this.lname = lname;
		this.phoneNumber = phoneNumber;
		this.createLibraryID();
		
		
	}
	
	public UserFactory(String fname, String minit, String lname,
			String phoneNumber, String id, String dateOfBirth, Gender gender, String email, String address) {
		this.fname = fname;
		this.minit = minit;
		this.lname = lname;
		this.phoneNumber = phoneNumber;
		this.identificationNumber = id;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.emails = email;
		this.address=address;
		this.createLibraryID();
		
		
	}
	
	public void createLibraryID() {
		this.libraryID= "1234";
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	
	public User createRegisteredUser() {
		return new RegisteredUser(libraryID,password,fname,minit,lname,phoneNumber,identificationNumber,dateOfBirth,gender,emails,address,"06/06/2024");        
	}

	public String getLibraryID() {
		return libraryID;
	}
	
	
	

}
