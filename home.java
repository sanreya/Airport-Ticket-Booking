import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;	
import java.util.*;

@SuppressWarnings("unchecked")
class home{

    home(){
		JFrame f = new JFrame("airport");
    		
        Toolkit tk = Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
		Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
		f.setSize(screenSize.width,screenSize.height); //Set the width and height of the JFrame. 
		
		//panel1
		//Color c1 = new Color(245,80,80);
		JPanel panel1 = new JPanel();
		panel1.setBounds(0,0,screenSize.width,100);
		panel1.setBackground(new Color(245,80,80));
		JLabel l1 = new JLabel("Air");
		l1.setBounds(20,20,100,30);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Stencil",  Font.BOLD, 30));
		JButton login = new JButton("Login");
		login.setBounds(1400,20,100,50);
		login.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){
		    	Login log = new Login();
		    }
	    });
	      
		f.add(login);
		f.add(l1);
		f.add(panel1);
		
		
		
		//panel2
		//Color c2 = new Color(27,26,23);
		JPanel panel2 = new JPanel();
		//panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.setBounds(0,100,screenSize.width,280);
		panel2.setBackground(new Color(27,26,23));
		JButton submit = new JButton("submit");
		
        submit.setBounds(1400,300,100,50);
		JLabel from = new JLabel("DEPARTURE");
		from.setBounds(40,100,600,100);
		from.setForeground(Color.white);
		from.setFont(new Font("Stencil",  Font.BOLD, 30));
		JLabel destin = new JLabel("DESTINATION");
		destin.setBounds(900,100,600,100);
		destin.setForeground(Color.white);
		destin.setFont(new Font("Stencil",  Font.BOLD, 30));
		JTextField t1 = new JTextField();
		t1.setBounds(40,200,600,50);
		JTextField t2 = new JTextField();
		t2.setBounds(900,200,600,50);
		submit.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){  
                if(e.getSource() == submit){
                selection s = new selection(t1.getText(),t2.getText());
                } 
            }
        });
		
		f.add(from);
		f.add(destin);
		f.add(t1);
		f.add(t2);
		f.add(submit);
		f.add(panel2);
			
			
				
		//panel3
		/*JPanel panel3 = new JPanel();
		panel3.setBounds(0,260,screenSize.width,200);
		ImageIcon image = new ImageIcon("/home/sanjana/airport/fly-non-stop-image.webp");
		//ImageIcon image = new ImageIcon(getClass().getResource("/home/sanjana/airport/fly-non-stop-image.webp"));
		JLabel displayImage = new JLabel(image);
		f.add(displayImage); 
		f.add(panel3);*/
		
		
		
		//panel4
		Color c3 = new Color(247,241,229);
		JPanel panel4 = new JPanel(new GridLayout(1,4,20,20));
		panel4.setBounds(0,370,screenSize.width,600);
		panel4.setBackground(c3);
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
		    JPanel subPanel1 = new JPanel(new GridLayout(8,1,0,0));
		        JLabel sl0 = new JLabel("Travel Information");
		        JLabel sl1 = new JLabel("Airports and terminals");		        
		        JLabel sl2 = new JLabel("Baggage");
		        JLabel sl3 = new JLabel("Check-in information");
		        JLabel sl4 = new JLabel("Mobile Check-in");
		        JLabel sl5 = new JLabel("Our fares");
		        subPanel1.add(sl0);
		        subPanel1.add(sl1);
		        subPanel1.add(sl2);
		        subPanel1.add(sl3);
		        subPanel1.add(sl4);
		        subPanel1.add(sl5);
		    JPanel subPanel2 = new JPanel(new GridLayout(8,1,0,0));
		        JLabel sl9 = new JLabel("Our Products and Services");		        
		        JLabel sl10 = new JLabel("bigpay pocket");
		        JLabel sl11 = new JLabel("Affiliate Partner");
		        JLabel sl12 = new JLabel("Ride");
		        JLabel sl13 = new JLabel("IKHLAS");
		        subPanel2.add(sl9);
		        subPanel2.add(sl10);
		        subPanel2.add(sl11);
		        subPanel2.add(sl12);
		        subPanel2.add(sl13);
		    JPanel subPanel3 = new JPanel(new GridLayout(8,1,0,0));
		        JLabel sl17 = new JLabel("Partners' Product");		        
		        JLabel sl18 = new JLabel("Delivery Partner Sign-Up");
		        JLabel sl19 = new JLabel("airasia Card");
		        JLabel sl20 = new JLabel("Luggage delivery");
		        subPanel3.add(sl17);
		        subPanel3.add(sl18);
		        subPanel3.add(sl19);
		        subPanel3.add(sl20);
		    JPanel subPanel4 = new JPanel(new GridLayout(8,1,2,0));
		        JLabel sl25 = new JLabel("About Us");		        
		        JLabel sl26 = new JLabel("Ad space");
		        JLabel sl27 = new JLabel("AirAsia Foundation");
		        JLabel sl28 = new JLabel("Careers");
		        JLabel sl29 = new JLabel("Investor relations");
		        subPanel4.add(sl25);
		        subPanel4.add(sl26);
		        subPanel4.add(sl27);
		        subPanel4.add(sl28);
		        subPanel4.add(sl29);
		    panel4.add(subPanel1);
		    panel4.add(subPanel2);
		    panel4.add(subPanel3);
		    panel4.add(subPanel4);
		f.add(panel4);
		
		
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
    }
        
    public void card(){
        CardLayout card = new CardLayout();
    }
}
