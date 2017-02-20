package kz.nurk.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {
	static final String JDBC_DRIVER = "org.postgresql.Driver";
	static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/test";
	
	static final String USER = "postgres";
	static final String PASS = "postgres";
	
	public static ArrayList<Student> getStudent(){
		Connection conn = null;
		Statement stmt = null;
        ResultSet result = null;
    	ArrayList<Student> list = new ArrayList<Student>();
        
        try {
    		Class.forName(JDBC_DRIVER);
    		
    		conn = DriverManager.getConnection(DB_URL,USER,PASS);
    		
    		stmt = conn.createStatement();
    		
    		String sql = "SELECT id, name FROM students";
    		result = stmt.executeQuery(sql);
    		
    		while(result.next()) {
    			Long id = result.getLong("id");
    			String name = result.getString("name");
    			list.add(new Student(id, name));
    		}
    		
    	}catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	System.out.println("Соединение устанвлено");		
		
		return list;
	}
}
