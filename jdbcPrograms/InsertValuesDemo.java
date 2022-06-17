package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertValuesDemo {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String uname = "postgres";
		String password = "navya14";
		int userId = 3;
		String username = "Harshi";
		String password1 = "sree";
		String emp = "Navya";
		String email = "d@gmail.com";
		String query = "insert into accounts values (?,?,?,?,?)";

		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url, uname, password);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, userId);
		st.setString(2, username);
		st.setString(3,password1);
		st.setString(4, email);
		st.setString(5, emp);
		int count = st.executeUpdate();

		System.out.println(count + " Updated Successfully");

		st.close();
		con.close();
	}

}
