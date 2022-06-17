package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteColumnProgm {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "navya14";
		String query = "AlTER TABLE employee Drop salary";
		
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement st = con.prepareStatement(query);
        st.executeUpdate();
	    System.out.println("Column Deleted");
	    
	    
	    st.close();
	    con.close();
	    
	}
	

}
