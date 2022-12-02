package jdbcprogram;

import java.sql.*; 

public class ReadData {

	public static void main(String[] args) throws SQLException {
		
		String port = "9909"; 
		String database = "sakila";
		String username = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:"+port+"/"+database;
		 
		Connection conn = DriverManager.getConnection(url, username, password);
		
		Statement stmt = conn.createStatement();
		
		String sql = "SELECT * FROM actor order by actor_id desc LIMIT 10";
		
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("ID  Actor Name");
		while(rs.next())
		{
			System.out.println(rs.getInt(1) +"  "+ rs.getString(2) +" "+rs.getString(3));
		}
		
		
		

	}

}
