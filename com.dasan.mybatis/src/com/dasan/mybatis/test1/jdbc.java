package com.dasan.mybatis.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
 public static void main(String[] args) {
	 Connection conn = null;
     Statement stmt = null;
     ResultSet rs = null;
     
		
		try {
			
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybase","root","123456");
		    stmt = conn.createStatement();
		    String sql = "select * from users";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
              System.out.println(rs.getString("id")+rs.getString("name")+rs.getString("age"));
            
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
	} 
}

