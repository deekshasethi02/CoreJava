package com.yash.crud;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class DBMetaData {
	private static Logger logger = Logger.getLogger(InsertDemo.class);

	public static void main(String[] args) throws Exception {

		// 1. Gather DB information
		// refer mysql mannual for Driver and url
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/mydb";
		String user = "root";
		String pwd = "root";

		// 2. load driver or register driver

		Class c = Class.forName(driverClassName);
		c.newInstance(); // create object of loaded driver class,uses default constructor
		logger.info("class : " + c);

		// 3. create connection object
		Connection con = DriverManager.getConnection(url, user, pwd);
		logger.info(con);

		// 4. DB meta data information
		
		DatabaseMetaData dbmd = con.getMetaData();
		System.out.println("vendor name : " +dbmd.getDatabaseProductName());
		System.out.println("version  : " +dbmd.getDatabaseProductVersion());
		System.out.println("driver name : " +dbmd.getDriverName());
		System.out.println("URL : " +dbmd.getURL());
		System.out.println("user name : " +dbmd.getUserName());
		
		//5. 
		con.close();
	}
}
