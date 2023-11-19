import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border; 
public class Ticket {
	@SuppressWarnings("unchecked")
	Ticket(String TicketID) 
	{
		
		
		TicketInfo t = new TicketInfo();
		ArrayList<String> info = t.get_info(TicketID);
		
	 JFrame f= new JFrame("Panel Example");    
	 Toolkit tk = Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
		Dimension screenSize1 = tk.getScreenSize(); //Get the Screen resolution of our device.
		f.setSize(screenSize1.width,screenSize1.height); 
     JPanel panel=new JPanel();  
     panel.setBounds(200,200,800,300);    
     panel.setBackground(Color.gray);
     JLabel l1,l2,l3,l4;  
     l1=new JLabel("NAME OF PASSENGER:");  
     l1.setBounds(270,200, 200,30);  
     l2=new JLabel("CLASS:");  
     l2.setBounds(270,270, 200,30);  
     l3=new JLabel("SOURCE");  
     l3.setBounds(270,340, 200,30); 
     l4=new JLabel("DESTINATION:");  
     l4.setBounds(270,410, 200,30); 
     JTextField t1,t2,t3,t4;  
     t1=new JTextField();  
     t1.setText(info.get(2));
     t1.setBounds(270,230,200,30);  
     t2=new JTextField();  
     t2.setText("economy");
     t2.setBounds(270,300,200,30);  
     t3=new JTextField(); 
     t3.setText(info.get(0));
     t3.setBounds(270,370,200,30);  
     t4=new JTextField(); 
     t4.setText(info.get(1));
     t4.setBounds(270,440,200,30);  
     f.add(t2);
     f.add(t3);
     f.add(t4);
     f.add(t1);
     f.add(l1); 
     f.add(l2);
     f.add(l3);
     f.add(l4);
     JLabel l5,l6,l7;  
     l5=new JLabel("DATE:");  
     l5.setBounds(550,250, 200,30);  
     l6=new JLabel("TIME:");  
     l6.setBounds(550,320, 200,30);  
     l7=new JLabel("TERMINAL:");  
     l7.setBounds(550,390, 200,30); 
     JLabel l8,l9;  
     l8=new JLabel("SEAT NO:");  
     l8.setBounds(840,220, 200,30);  
     l9=new JLabel("FLIGHT ID:");  
     l9.setBounds(840,300, 200,30);  
     JTextField t8,t9; 
     t8=new JTextField();  
     t8.setText("32");
     t8.setBounds(820,250,150,30);  
     t9=new JTextField();
     t9.setText("A123");
     t9.setBounds(820,330,150,30);

     JTextField t5,t6,t7 ; 
     t5=new JTextField();  
     t5.setText(info.get(4));
     t5.setBounds(550,285,200,30);  
     t6=new JTextField();  
     t6.setText(info.get(5));
     t6.setBounds(550,355,200,30);  
     t7=new JTextField();  
     t7.setText("3");
     t7.setBounds(550,420,200,30);  
     
       
     
     f.add(t5);
     f.add(t6);
     f.add(t7);
     f.add(t8);
     f.add(t9);
     f.add(t1);
     f.add(l5); 
     f.add(l6);
     f.add(l7);
     f.add(l8);
     f.add(l9);
    
     JPanel panel3=new JPanel();  
     panel3.setBounds(200,150,800,50);    
     panel3.setBackground(Color.LIGHT_GRAY);
     JLabel l18;
     l18=new JLabel("PLANE TICKET");  
     l18.setBounds(590,140,200,70);
     f.add(l18);

     
     JPanel panel2=new JPanel();
     panel2.setBounds(850,200,550,300);    
     panel2.setBackground(Color.gray);      
     JLabel l10,l11,l12,l13,l14,l15,l16,l17;  
     l10=new JLabel("NAME:");  
     l10.setBounds(1050,220,200,30); 
     l11=new JLabel("SOURCE:");  
     l11.setBounds(1050,260,200,30); 
     l12=new JLabel("DESTINATION:");  
     l12.setBounds(1050,300,200,30); 
     l13=new JLabel("DATE:");  
     l13.setBounds(1050,340,200,30); 
     l14=new JLabel("TIME:");  
     l14.setBounds(1200,340,200,30);
     l15=new JLabel("TERMINAL:");  
     l15.setBounds(1050,380,200,30); 
     l16=new JLabel("SEAT NO:");  
     l16.setBounds(1050,420,200,30);
     l17=new JLabel("FLIGHT ID:");  
     l17.setBounds(1050,460,200,30); 
     f.add(l10);
     f.add(l17);
     f.add(l16);
     f.add(l15);
     f.add(l14);
     f.add(l13);
     f.add(l11);
     f.add(l12);
     
     JTextField t10,t11,t12,t13,t14,t15,t16,t17; 
     t10=new JTextField();  
     t10.setText(info.get(2));
     t10.setBounds(1150,220,150,30);
     t11=new JTextField();  
     t11.setText(info.get(0));
     t11.setBounds(1150,260,150,30);
     t12=new JTextField();  
     t12.setText(info.get(1));
     t12.setBounds(1150,300,150,30);
     t13=new JTextField();  
     t13.setText(info.get(4));
     t13.setBounds(1100,340,80,30);
     t14=new JTextField();  
     t14.setText(info.get(5));
     t14.setBounds(1250,340,80,30);
     t15=new JTextField();  
     t15.setText("3");
     t15.setBounds(1150,380,150,30);
     t16=new JTextField();  
     t16.setText("32");
     t16.setBounds(1150,420,150,30);
     t17=new JTextField();  
     t17.setText("A123");
     t17.setBounds(1150,460,150,30);
     f.add(t17);
     f.add(t10);
     f.add(t11);
     f.add(t12);
     f.add(t13);
     f.add(t14);
     f.add(t15);
     f.add(t16);
     
     
     JPanel panel4=new JPanel();  
     panel4.setBounds(1000,150,400,50);    
     panel4.setBackground(Color.LIGHT_GRAY);
   
     JLabel l19;
     l19=new JLabel("BOARDING PASS");  
     l19.setBounds(1150,140,200,70);
     f.add(l19);

	 Toolkit k=Toolkit.getDefaultToolkit();
	 Dimension screenSize = k.getScreenSize();
	 f.setSize(screenSize.width,screenSize.height) ;
	 Border blackline1= BorderFactory.createLineBorder(Color.black);
     panel2.setBorder(blackline1 );
     Border blackline = BorderFactory.createLineBorder(Color.black);
     panel.setBorder(blackline );
     Border blackline3 = BorderFactory.createLineBorder(Color.BLACK);
     panel3.setBorder(blackline3 );
     Border blackline2 = BorderFactory.createLineBorder(Color.BLACK);
     panel4.setBorder(blackline2 );
     
	 
     f.add(panel);
     f.add(panel2);
     f.add(panel3);
     f.add(panel4);
             
             f.setLayout(null);    
             f.setVisible(true);    
             
      }
 }
