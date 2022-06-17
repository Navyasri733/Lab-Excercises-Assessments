package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/accounts", "postgres",
				"navya14")) {
			if (con != null) {
				System.out.print("successful");
			} else {
				System.out.println("Failed");
			}

		} catch (SQLException e) {
			System.err.format("SQL state: %s\\n%s", e.getSQLState(), e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
