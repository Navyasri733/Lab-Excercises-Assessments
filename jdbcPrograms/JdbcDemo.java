package jdbcPrograms;
import java.sql.*;


public class JdbcDemo {

	public static void main(String[] args) throws Exception {
	 String url = "jdbc:postgresql://localhost:5432/postgres";
	 String username = "postgres";
	 String password = "navya14";
	 String query = "select username from accounts where user_id = 1";
	 
	 Class.forName("org.postgresql.Driver");
	 Connection con = DriverManager.getConnection(url,username,password);
	 Statement st = con.createStatement();
	 ResultSet rs = st.executeQuery(query);
	  
	 rs.next();
	 String name = rs.getString("username");
	 System.out.println(name);
	 
	 st.close();
	 con.close();
	 }

}
