package Online_Resume_Builder;
import java.sql.*;

import javax.swing.*;



public class DataBaseConnectivity {
	Connection con=null;
	public static Connection dbconnector() {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Resume_Builder", "root" , "root");
			
			return con;
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
			
		}

	}
	
}
