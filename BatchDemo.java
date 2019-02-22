package com.day15;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {
Connection con;
Statement csmt;
ResultSet rs;
BatchDemo()
{
	
}
void createConnection()
{
  try
  {
	  Class.forName("com.mysql.jdbc.Driver");
	  con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","root");
      csmt=con.createStatement();	  
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
}
void createBatch() throws Exception 
{
  
	//csmt.addBatch("insert into skills(name) values('Hybetnet')");
	//csmt.addBatch("update skills set name='web app' where id=4");
	csmt.addBatch("delete from skills where id=9");
	con.setAutoCommit(false);
	
	try
	{
		int i[]=csmt.executeBatch();
		con.commit();
		System.out.println("batch is sucessfully executed");
	}
	catch(Exception e)
	{
		System.out.println();
	}
}

	public static void main(String[] args) throws Exception  {
			BatchDemo b=new BatchDemo();
			b.createConnection();
			b.createBatch();
   
	}

}
