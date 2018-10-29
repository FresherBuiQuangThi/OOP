package OOP;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {
	private static String DB_URL = "jdbc:mysql://localhost:3306/oop";
    private static String USER_NAME = "root";
    private static String PASSWORD = "123456";
  
    public void select()
    {
	    try {
	    	Connection conn = Connect_DB.getConnection(DB_URL, USER_NAME, PASSWORD);
	        // crate statement
	        Statement stmt = conn.createStatement();
	        // get data from table 'student'
	        ResultSet rs = stmt.executeQuery("select * from student");
	        // show data
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + "  " + rs.getString(2) 
	                    + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
	        }
	        // close connection
	        conn.close();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
    }
    public void selectwhere(int id)
    {
	    try {
	    	Connection conn = Connect_DB.getConnection(DB_URL, USER_NAME, PASSWORD);
	        // crate statement
	        Statement stmt = conn.createStatement();
	        // get data from table 'student'
	        ResultSet rs = stmt.executeQuery("select * from student where id = " + id);
	        // show data
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + "  " + rs.getString(2) 
	                    + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
	        }
	        // close connection
	        conn.close();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
    }   
    public void add(Students students)
    {
    	try {
    		Connection conn = Connect_DB.getConnection(DB_URL, USER_NAME, PASSWORD);
	    	Statement stmt = conn.createStatement();
	    	
    		int c = 0;
    		String b,d = null;
    		double e = 0;
    		
			b = students.name;
			c = students.age;
			d = students.address;
			e = students.gpa;
			
			stmt.executeUpdate("INSERT INTO student (name, age, address, gpa) "
					+ "values (" + "'" + b + "'," + c + "," +  "'" + d + "'," + e + ")");
			System.out.println("INSERT INTO student (name, age, address, gpa) "
					+ "values (" + "'" + b + "'," + c + "," +  "'" + d + "'," + e + ")");
			
			System.out.println("Success!");
    		conn.close();
    		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
}