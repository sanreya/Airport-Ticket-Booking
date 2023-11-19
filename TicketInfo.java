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
public class TicketInfo{
	public ArrayList<String> get_info(String TicketID) {
	 try {
		 
		 ArrayList<String> info = new ArrayList<String>();
	     Connection connection = (Connection) DriverManager
	        .getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");

	     PreparedStatement st = connection
	       .prepareStatement("select * from Ticket where Ticket_ID=? ");

	     st.setString(1,TicketID);
	     ResultSet rs = st.executeQuery();
	     while (rs.next()) {
	         info.add(rs.getString("source"));
	         info.add(rs.getString("destination"));
	         info.add(rs.getString("passenger_name"));
	         info.add(rs.getString("Ticket_ID"));
	         info.add(rs.getString("date"));
	         info.add(rs.getString("time"));
	         info.add(rs.getString("price"));
	     } 
	     return info;
	   } catch (SQLException sqlException) {
	         sqlException.printStackTrace();
	 }
	 return null;
	}
}
