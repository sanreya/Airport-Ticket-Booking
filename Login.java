import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("unchecked")
public class Login implements ActionListener{


    JFrame frame = new JFrame();
    JButton login = new JButton("login");
    JButton reset = new JButton("reset");
    JTextField userIDField = new JTextField();
    JPasswordField value = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID: ");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel();  
    
    Login(){
        
        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));
        
        userIDLabel.setBounds(50,100,200,25);
        userPasswordLabel.setBounds(50,150,200,25);
        
        
        userIDField.setBounds(125,100,200,25);
        value.setBounds(125,150,200,25);
        
        login.setBounds(125,200,100,25);
        login.addActionListener(this);
        reset.setBounds(225,200,100,25);
        reset.addActionListener(this);
        
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(value);
        frame.add(login);
        frame.add(reset);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==reset){
            userIDField.setText("");
            value.setText("");
        }
        if(e.getSource()==login){
            String userID = userIDField.getText();
            String password = String.valueOf(value.getPassword());
            
            ID id = new ID();
        	String Ticket_id = id.return_Ticket(userIDField.getText(), String.valueOf(value.getPassword()));
            
                if(Ticket_id != "NULL"){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("login successful");
                    
                    Ticket t = new Ticket(Ticket_id);
                }
       }
    }
}

