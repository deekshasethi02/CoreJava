package com.yash.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.log4j.Logger;

public class BatchInsertionDemo {
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
		logger.info("con : "+con);

		// 4. create statement
		String sql = "insert into contact(name,phone) values (?,?) ";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, "rob's");
		preparedStatement.setString(2, "34567");
		preparedStatement.addBatch();
		
		preparedStatement.setString(1, "robbin's");
		preparedStatement.setString(2, "31234");
		preparedStatement.addBatch();
		
		preparedStatement.setString(1, "deep's");
		preparedStatement.setString(2, "347");
		preparedStatement.addBatch();
		
		preparedStatement.executeBatch();
		logger.info("record has been added successfully....check db");
		
		// 5.
		preparedStatement.close();
		con.close();
	}
}
