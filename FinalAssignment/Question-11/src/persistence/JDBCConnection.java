package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {
	
	public static void getData() {
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet set=null;
		
		try {
			// Optional Step-Load the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Establish the connection
			connection = DriverManager.getConnection("jdbc:mysql:///info", "root", "abcd1234");
			
			//Create statement Object and execute statement 
			statement = connection.prepareStatement("select id,email,first_name,last_name from customer");
			set = statement.executeQuery();
			
			//Processing ResultSet
			System.out.println("ID\t\tFirst Name\tLast Name\tEmail");
			while (set.next()) {
				System.out.print(set.getInt(1)+"\t");
				System.out.print(set.getString(3)+"\t\t");
				System.out.print(set.getString(4)+"\t");
				System.out.print(set.getString(2)+"\t");
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				set.close();
				statement.close();
				connection.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
