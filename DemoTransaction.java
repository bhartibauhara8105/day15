package com.day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoTransaction {

	public static void main(String[] args) throws Exception {
		 Class.forName("com.mysql.jdbc.Driver");
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","root");
		System.out.println("driver is loaded");
	     Statement csmt=con.createStatement();
	     con.setAutoCommit(false);
	     try
	     {
	    	 int i1=csmt.executeUpdate("insert into candidate_skills values(100,3)");
	    	 int i2= csmt.executeUpdate("update skills set name='Ruby'where id=8");
	    	 int i3= csmt.executeUpdate("delete from candidates where id=0");
	    	 con.commit();
	    	 System.out.println("transaction is sucess");
	     }
	     catch(Exception e)
	     {
	    	 try
	    	 {
	    		con.rollback(); 
	    	 System.out.println("trnsaction fails");
	    	 }
	    	 catch(Exception ex)
	    	 {
	    		 System.out.println(ex);
	    	 }
	    	 
	     }
	     csmt.close();
	     con.close();
	     
	}

}
