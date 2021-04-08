/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Nisal
 */

public class DBconnection {
    	private static Connection con;
        private static Statement stmt;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pafDB","root", "");
			stmt = con.createStatement();
			
		} catch (Exception e) {
			 System.out.println("Databace connection is unsuccess");
		}
                return con;
	}
        
        
        
}
