package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreDAO {
	Connection c = null;
	ResultSet rs = null;

	public void connectZOTODatabase() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		c = DriverManager.getConnection("jdbc:postgresql://52.19.42.32:5433/zoto", "postgres", "postgres");
		c.setAutoCommit(false);
		System.out.println("Opened database successfully");
	}

	public ResultSet executeQuery(String query) throws SQLException {
		Statement stmt = c.createStatement();
		rs = stmt.executeQuery(query);
		stmt.close();
		return rs;
	}

	public void closeDatabase() throws SQLException {
		rs.close();
		c.close();
		System.out.println("Operation done successfully");
	}

}
