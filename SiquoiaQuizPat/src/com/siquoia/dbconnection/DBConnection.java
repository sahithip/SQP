package com.siquoia.dbconnection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


public class DBConnection {


	public Connection getConnection()
	{
		Connection con = null;

		try 
		{
			Class.forName("java.sql.Driver");
			con = DriverManager.getConnection("jdbc:derby://localhost:1527/SiQuoiaDB", "patrick", "1234");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

	public void closeConnection(Connection con)
	{
		if(con != null)
		{
			try 
			{
				con.close();
			}
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void closeStatement(PreparedStatement stmnt)
	{
		if(stmnt != null)
		{
			try 
			{
				stmnt.close();
			}
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}



}
