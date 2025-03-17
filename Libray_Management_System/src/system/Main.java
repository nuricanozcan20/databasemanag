package system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DatabaseConnection;
import domain.RegisteredUser;
import ui.LoginPage;

public class Main {
	
	private static Statement statement;



	public static void main(String[] args) throws SQLException {


		DatabaseConnection db = new DatabaseConnection();
		statement=db.connect();
		// If you do not have database you can create with this
		db.createDatabase();

		// TODO Auto-generated method stub //
		LoginPage login = new LoginPage();
		login.getFrame().setVisible(true);
		

	}



	public static Statement getStatement() {
		return statement;
	}
	
	
	


}
