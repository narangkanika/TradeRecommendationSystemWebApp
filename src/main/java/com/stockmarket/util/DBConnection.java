package com.stockmarket.util;
import java.sql.*;
public class DBConnection {
	public static Connection createConnection()
	 {
	 Connection con = null;
	 String url = "jdbc:oracle:thin:@localhost:1521:xe"; //for SQL and oracle or any other db server this url differs. where ravi is the database name and 3306 is the port where mysql is running
	 String username = "stockmarket"; //username of database user
	 String password = "stockmarket"; //password
	 
	try
	 {
	 try
	 {
	 Class.forName("oracle.jdbc.OracleDriver");// differs from DB server to server
	 }
	 catch (ClassNotFoundException e)
	 {
	 e.printStackTrace();
	 }
	 
	con = DriverManager.getConnection(url, username, password);
	 
	}
	 catch (Exception e)
	 {
	 e.printStackTrace();
	 }
	 
	return con;
	 }
}