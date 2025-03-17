package domain;

public abstract class User {
	
	private String libraryID;
	private String fname;
	private String minit;
	private String lname;
	private String phoneNumber;
	
	public User(String libraryID, String fname, String minit, String lname, String phoneNumber) {
		this.libraryID = libraryID;
		this.fname = fname;
		this.minit = minit;
		this.lname = lname;
		this.phoneNumber = phoneNumber;
	}

	public String getLibraryID() {
		return libraryID;
	}

	public String getFname() {
		return fname;
	}

	public String getMinit() {
		return minit;
	}

	public String getLname() {
		return lname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	
	
	
}
