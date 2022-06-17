package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchTableDemo {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "navya14";
		String query = "select * from accounts ";

		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		String userdata = "";
		while (rs.next()) {

			userdata = rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getString(4);
			System.out.println(userdata);

		}
		st.close();
		con.close();

	}
}