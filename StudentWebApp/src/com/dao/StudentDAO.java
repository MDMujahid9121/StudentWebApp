package com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.DbConnection;
import com.model.Student;

public class StudentDAO {

	public Student stLogin(String emailId, String password) {
		
		Connection con = DbConnection.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		if (con == null) {
			System.out.println("Cannot Establish the Connection to the Database...");
			return null;
		}
				
		try {
			String selectQry = "Select * from student where emailId = ? and password = ?";
			
			pst = con.prepareStatement(selectQry);
			pst.setString(1, emailId);
			pst.setString(2, password);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				
				Student st = new Student();
				
				st.setStudentId(rs.getInt("studentId"));
				st.setStudentName(rs.getString(2));
				st.setAge(rs.getInt(3));
				st.setGender(rs.getString(4));
				st.setEmailId(rs.getString(5));
				st.setPassword(rs.getString(6));
				
				return st;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			if (con != null) {
				try {
					rs.close();
					pst.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
				
		return null;		
	}
	
}