package jdbcprogram;

import java.sql.*;
import java.util.Scanner; 

public class InsertData {
	
	private static Connection connect() throws SQLException
	{
		String port = "9909"; 
		String database = "sakila";
		String username = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:"+port+"/"+database;
		
		return DriverManager.getConnection(url, username, password);
	}

	public static void main(String[] args) throws SQLException {
		 
		
		Connection conn = connect();  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Actor Details");
		
		System.out.print("First Name : ");
		String first_name = sc.next();
		
		System.out.print("Last Name : ");
		String last_name = sc.next();
		
		sc.close();
		
		
		String sql = "INSERT INTO actor(first_name,last_name) values (?,?)";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, first_name);
		stmt.setString(2, last_name);
		
		int response = stmt.executeUpdate();
		if(response > 0) {
			
			System.out.println("Added Successfully");
			
		} else {
			
			System.out.println("Error Occured");
		}
		
		conn.close();
		 

	}

}
