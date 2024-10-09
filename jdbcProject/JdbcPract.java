//package jdbcProject;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//
//
//public class JdbcPract {
//	public static void main(String[] args) throws SQLException {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgt","root","password");
//			java.sql.Statement statement = connection.createStatement();
//			//String createTable = "CREATE TABLE studenttable (id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(100) NOT NULL,age INT NOT NULL,class VARCHAR(50) NOT NULL,addrss VARCHAR(255))";
//			
//
//			statement.executeUpdate(createTable);
//			System.out.println(" insert  sucessfully ");
//			
//		} catch (ClassNotFoundException e) {
//		
//			e.printStackTrace();
//		}
//		
//	
//}
////}
//
//package jdbcProject;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class JdbcPract {
//    public static void main(String[] args) throws SQLException {
//        try {
//            // Load MySQL JDBC Driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            
//            // Establish the connection
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgt", "root", "password");
//            
//            // Create a statement
//            java.sql.Statement statement = connection.createStatement();
//            
//            // Corrected SQL Insert Query (without + signs)
//            String insertString = "INSERT INTO studenttable (name, age, class, addrss) VALUES "
//                                + "('John Doe', 20, '10th Grade', '123 Main St, City'), "
//                                + "('Milan Parajuli', 20, '10th Grade', '354 Main St, City'), "
//                                + "('Upendra', 25, '10th Grade', '5555 Main St, City')";
//            
//            // Execute the SQL insert statement
//            statement.executeUpdate(insertString);
//            
//            // Success message
//            System.out.println("Inserted successfully");
//            
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}

//}
//
//package jdbcProject;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class JdbcPract {
//	public static void main(String[] args) throws SQLException {
//		try {
//			// Load MySQL JDBC Driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			// Establish the connection
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgt", "root",
//					"password");
//
//			// Create a statement
//			java.sql.Statement statement = connection.createStatement();
//
//			String outString = "select * from studenttable";
//
//			ResultSet resultSet = statement.executeQuery(outString);
//			
//			while (resultSet.next()) {
//				 int id = resultSet.getInt("id");
//				 String name= resultSet.getString("name");
//				 int age = resultSet.getInt("age");
//	                String className = resultSet.getString("class");
//	                String address = resultSet.getString("addrss");
//	                
//	                // Print the record
//	                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Class: " + className + ", Address: " + address);
//	            }
//				
//			
//
//			// Success message
//			System.out.println("select success ");
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//}

//package jdbcProject;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class JdbcPract {
//    public static void main(String[] args) throws SQLException {
//        try {
//            // Load MySQL JDBC Driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Establish the connection
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgt", "root",
//                    "password");
//
//            // Insert using PreparedStatement
//            String insString = "INSERT INTO studenttable (name, age, class, addrss) VALUES (?, ?, ?, ?)";
//            PreparedStatement insertste = connection.prepareStatement(insString);
//            insertste.setString(1, "Milan parajuli");
//            insertste.setInt(2, 20);
//            insertste.setString(3, "12th Grade");
//            insertste.setString(4, "Palpa");
//
//            int insert = insertste.executeUpdate();
//            if (insert > 0) {
//                System.out.println("A new student was inserted successfully!");
//            } else {
//                System.err.println("Cannot insert into the table.");
//            }
//
//            // Query the table
//            String querString = "SELECT * FROM studenttable";
//            PreparedStatement query = connection.prepareStatement(querString);
//
//            ResultSet resultSet = query.executeQuery();
//
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                String className = resultSet.getString("class");
//                String address = resultSet.getString("addrss");
//
//                // Print the record
//                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Class: " + className
//                        + ", Address: " + address);
//            }
//
//            System.err.println( "*************************************************************************************************");
//
//            // Success message
//            System.out.println("Select query executed successfully.");
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}





package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPract {
    public static void main(String[] args) throws SQLException {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgt", "root", "password");

            // Insert using PreparedStatement with addBatch
            String insString = "INSERT INTO studenttable (name, age, class, addrss) VALUES (?, ?, ?, ?)";
            PreparedStatement insertStmt = connection.prepareStatement(insString);
            


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}