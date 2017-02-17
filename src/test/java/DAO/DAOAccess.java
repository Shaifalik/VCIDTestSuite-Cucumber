package DAO;

import java.sql.SQLException;

public class DAOAccess {
	static PostgreDAO pstJdbc;

	public static PostgreDAO getConnection() throws ClassNotFoundException, SQLException {
		pstJdbc = new PostgreDAO();
		pstJdbc.connectZOTODatabase();
		return pstJdbc;
	}

}
