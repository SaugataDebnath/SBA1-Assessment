package com.iiht.evaluation.eloan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.iiht.evaluation.eloan.dto.UserInfo;
import com.iiht.evaluation.eloan.model.LoanInfo;
import com.iiht.evaluation.eloan.model.User;

public class ConnectionDao {
	private static final long serialVersionUID = 1L;
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;

	public ConnectionDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }

	public  Connection connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}
		return jdbcConnection;
	}

	public void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}

	// put the relevant DAO methods here..

	public UserInfo insertUserInfo() {

		Connection conn = null;
		Statement stmt = null;
		UserInfo unserInfo = null;

		try {
			jdbcConnection = this.connect();
			stmt = jdbcConnection.createStatement();
			UserInfo userInfo;
			ResultSet rs = stmt.executeQuery(String.format(FETCH_INFO, userInfo));

			while (rs.next()) {
				System.out.println(rs.getString("userName"));

				userInfo = new UserInfo(rs.getString("USER_NAME"), rs.getString("FIRST_NAME"),
						rs.getString("LAST_NAME"), rs.getString("DOB"), rs.getString("GENDER"), rs.getString("MOBILE"),
						rs.getString("EMAIL"), rs.getString("CITY"), rs.getString("COUNTRY"), rs.getString("PINCODE"),
						rs.getString("ADDRESS"));
			}

			return userInfo;

		} catch (Exception e) {

			System.out.println("User details not retreived");
			System.out.println("Error" + e.getMessage());

		}
	}

	public LoanInfo addLoan(String applno, String purpose, int amtrequest, String doa, String bstructure, String bindicator,
			String address, String email, String mobile,String status) {

		Connection conn = null;
		Statement stmt = null;
		LoanInfo addloan = null;

		try {
			jdbcConnection = this.connect();
			stmt = jdbcConnection.createStatement();
			LoanInfo addloan;
			ResultSet rs = stmt.executeQuery(String.format(FETCH_INFO, addloan));

			while (rs.next()) {
				System.out.println(rs.getString("applno"));

				addloan = new LoanInfo();

			return addloan;

			}
		} catch (Exception e) {

			System.out.println("Loan details not retreived");
			System.out.println("Error" + e.getMessage());

		}
	}

	public User registerUser() {
		return null;

	}


}
