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
public class ID{
	String return_Ticket(String userName, String password) {
	 try {
	     Connection connection = (Connection) DriverManager
	        .getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");

	     PreparedStatement st = connection
	       .prepareStatement("Select Ticket_ID from login where user_ID=? and password=?");

	     st.setString(1, userName);
	     st.setString(2, password);
	     ResultSet rs = st.executeQuery();
	     while (rs.next()) {
	         return rs.getString(1);
	     } 
	   } catch (SQLException sqlException) {
	         sqlException.printStackTrace();
	 }
	 return "NULL";
	}
}