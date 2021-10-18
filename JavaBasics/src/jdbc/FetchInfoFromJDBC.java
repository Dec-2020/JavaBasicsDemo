package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchInfoFromJDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/movies";
		String username = "root";
		String password = "root";
		String query = "select * from movies";
		
		Class.forName("com.mysql.jdbc.Driver"); 
        Connection con = DriverManager.getConnection(dbUrl,username,password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        while(rs.next()) {
        	System.out.println("Title: " + rs.getString("title") + "\t");
        }
   }

}
