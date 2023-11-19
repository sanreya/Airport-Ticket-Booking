import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@SuppressWarnings("unchecked")
public class AirportInfo{
	public ArrayList<String> Airport_info(String source, String destination) {
	 try {
		 
		 ArrayList<String> info = new ArrayList<String>();
	     Connection connection = (Connection) DriverManager
	        .getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");

	     PreparedStatement st = connection
	       .prepareStatement("select source, destination, airplane_name, date from airplane where source=? and destination = ?");	

	     st.setString(1,source);
	     st.setString(2,destination);
	     ResultSet rs = st.executeQuery();
	     while (rs.next()) {
	         info.add(rs.getString("source"));
	         info.add(rs.getString("destination"));
	         info.add(rs.getString("airplane_name"));
	         info.add(rs.getString("date"));
	     } 
	     return info;
	   } catch (SQLException sqlException) {
	         sqlException.printStackTrace();
	 }
	 return null;
	}
}
