package com.yash.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;



public class InsertDemo {
private static Logger logger = Logger.getLogger(InsertDemo.class);
	public static void main(String[] args) throws Exception {
	
		//1. Gather DB information
		// refer mysql mannual for Driver and url
		String driverClassName =  "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/mydb";
		String user = "root";
		String pwd = "root";
		
		//2. load driver or register driver
		
		Class c = Class.forName(driverClassName);
		c.newInstance(); //create object of loaded driver class,uses default constructor
		logger.info("class : " +c);
		
		//3. create connection object
		Connection con = DriverManager.getConnection(url,user,pwd);
		logger.info(con);
		
		
		//4. create sta
		Statement stmt = con.createStatement();
		String sql = "insert into contact(name,phone) values ('deeksha','123456') ";
		String sql1 = "insert into contact(name,phone) values ('ashish','123') ";
		stmt.executeUpdate(sql);
		stmt.executeUpdate(sql1);
		//5. 
		stmt.close();
		con.close();
	}

}
