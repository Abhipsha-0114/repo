package com.miniproj2;
import java.sql.*;
import java.util.*;



public class UserDAO {
	DatabaseConnector db = new DatabaseConnector();
	public String register(User u)
	{
		String result="";
		
		try
		{
			System.out.println("hello");
			String query="insert into chief_minister values(?,?,?,?,?)";
			PreparedStatement pstmt=db.getPreparedStatement(query);
			pstmt.setInt(1,u.getCid());
			pstmt.setString(2, u.getCname());
			pstmt.setString(3, u.getQualification());
			pstmt.setString(4, u.getState());
			
			pstmt.setString(5, u.getParty());
			
			
			int i = pstmt.executeUpdate();
			
			if(i==1)
			{
				result=Result.SUCCESS;
			}
			else
			{
				result=Result.FAILURE;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result=Result.PROBLEM;
		}
		finally
		{
			db.closeConnection();
		}
		return result;
	}
	public ArrayList<User> getAllUsers()
	{
		ArrayList<User> list=new ArrayList<>();
		
		
		try
		{
			String query="Select * from chief_minister";
			ResultSet rs=db.getResultSet(query);
			while(rs.next())
			{
				User u=new User();
				u.setCid(rs.getInt("cid"));
				u.setCname(rs.getString("cname"));
				u.setQualification(rs.getString("qualification"));
				u.setState(rs.getString("state"));
				u.setParty(rs.getString("party"));
				list.add(u);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
		}
		finally
		{
			db.closeConnection();
		}
		
		return  list;
	}
	public String deleteUser(User u)
	{
		String result="";
		
		try
		{
			String query="delete from chief_minister where cid=?";;
			PreparedStatement pstmt=db.getPreparedStatement(query);
			pstmt.setInt(1,u.getCid());
			
			int i=pstmt.executeUpdate();
			
			if(i==1)
			{
				result=Result.SUCCESS;
			}
			else
			{
				result=Result.FAILURE;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result=Result.PROBLEM;
		}
		finally
		{
			db.closeConnection();
		}
		
		return result;
	}


}
