package com.yash.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class ResultSetMetaDataDemo {
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

		// 4. result set meta data information
		Statement stmt = con.createStatement();
		String sql = "select * from contact";
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("column count :"+ rsmd.getColumnCount());
		System.out.println("First column name  : "+rsmd.getColumnName(1));
		System.out.println("First column type  : "+rsmd.getColumnType(1));
		System.out.println("Table name  : "+rsmd.getTableName(1));
		// 5.
		stmt.close();
		con.close();
	}

}
