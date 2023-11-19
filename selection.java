//package first;
import java.awt.*; 
//import java.awt.BorderLayout;
//import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.util.*;

public class selection{
	     selection(String source, String destination)  
	        {
	    	 
	    	 AirportInfo a = new AirportInfo();
	    	 ArrayList<String> information = a.Airport_info(source, destination);
	    	 	    	 
	        JFrame f= new JFrame("Panel Example"); 
	        JPanel panel=new JPanel();  
	        panel.setBounds(0,0,1600,50);    
	        panel.setBackground(Color.lightGray);  
	        JLabel la,la1;
	        la=new JLabel("AIM HIGH");
	        la.setBounds(800,0,500,50);
	        la1=new JLabel("FLY HIGH!!!");
	        la1.setBounds(800,15,500,50);
	        Border blackline7 = BorderFactory.createLineBorder(Color.black);
	        panel.setBorder(blackline7);
	        f.add(la);
	        f.add(la1);
	        f.add(panel);
	        
	    	 Toolkit k=Toolkit.getDefaultToolkit();
	    	 Dimension screenSize = k.getScreenSize();
	    	 f.setSize(screenSize.width,screenSize.height) ;
	    	 
	    	 
	        JPanel panel2=new JPanel();  
	        panel2.setBounds(0,50,300,1000);    
	        panel2.setBackground(Color.LIGHT_GRAY); 
	        Border blackline = BorderFactory.createLineBorder(Color.black);
	        panel2.setBorder(blackline );
	        JRadioButton b=new JRadioButton("STOP");
	        b.setBounds(30,120,150,35);
	        JRadioButton b1 =new JRadioButton("NOT STOP");
	        b1.setBounds(30,160,150,35);  
	        JLabel l,l1; 
	        l=new JLabel("STOPS");  
	        l.setBounds(130,80,500,30);
	        l1=new JLabel("--->FILTERS");  
	        l1.setBounds(20,50,500,30);
	        f.add(l1);
	        JLabel l3,l4,l5;
	        l3=new JLabel("CABINS");  
	        l3.setBounds(130,190,500,35);
	        JRadioButton b2=new JRadioButton("ECONOMY");
	        b2.setBounds(30,220,150,35);
	        JRadioButton b3 =new JRadioButton("PRE ECON");
	        b3.setBounds(30,260,150,35);
	        JRadioButton b4 =new JRadioButton("BUSINESS");
	        b4.setBounds(30,300,150,35);
	        JRadioButton b5 =new JRadioButton("MIXED");
	        b5.setBounds(30,340,150,35);
	        l4=new JLabel("AIRLINES");  
	        l4.setBounds(130,370,500,30);
	        JCheckBox checkBox1 = new JCheckBox("Emirates"); 
	        checkBox1.setBounds(30,400, 150,35);  
	        JCheckBox checkBox2 = new JCheckBox("Vistara");  
	        checkBox2.setBounds(30,440, 150,35);  
	        JCheckBox checkBox3 = new JCheckBox("Air India Express");  
	        checkBox3.setBounds(30,480, 150,35);  
	        JCheckBox checkBox4 = new JCheckBox("Philippine Airlines");  
	        checkBox4.setBounds(30,520, 150,35);  
	        JCheckBox checkBox5 = new JCheckBox("Middle East Airlines");  
	        checkBox5.setBounds(30,560, 150,35);  
	        JCheckBox checkBox6 = new JCheckBox("Air India");  
	        checkBox6.setBounds(30,600, 150,35);  
	        JCheckBox checkBox7 = new JCheckBox("Qatar Airways");  
	        checkBox7.setBounds(30,640, 150,35);  
	        JCheckBox checkBox8 = new JCheckBox("FlyOne");  
	        checkBox8.setBounds(30,680, 150,35);
	        l5=new JLabel("PRICE");  
	        l5.setBounds(130,720,500,30);
	        SpinnerModel value =  
	                new SpinnerNumberModel(100000, //initial value  
	                   5000, //minimum value  
	                   100000, //maximum value  
	                   3000); //step  
	       JSpinner spinner = new JSpinner(value);   
	       spinner.setBounds(30,750,150,35);    
	        f.add(spinner);    
	        f.add(checkBox1);  
	        f.add(checkBox2);  
	        f.add(checkBox3);  
	        f.add(checkBox4);  
	        f.add(checkBox5);  
	        f.add(checkBox6);  
	        f.add(checkBox7);  
	        f.add(checkBox8);  
	        
	        f.add(l);
	        f.add(l3);
	        f.add(l4);
	        f.add(l5);
	        f.add(b);
	        f.add(b1);
	        f.add(b2);
	        f.add(b3);
	        f.add(b4);
	        f.add(b5);
	        f.add(panel2); 
	        
	        JPanel panel1=new JPanel();  
	        panel1.setBounds(350,50,1700,150);    
	        panel1.setBackground(Color.gray);
	        
	        JButton bu = new JButton("CONFiRM"); 
	        bu.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	                payment p = new payment();
	            }
	        }); 
	        
	        bu.setBounds(1370,170,150,30); 
	        JLabel lab1,lab2,x1,x2;  
	        lab1=new JLabel("AIRLINE NAME -  ");  
	        lab1.setBounds(700,50,100,50);    
	        JTextArea area=new JTextArea();  
	        area.setText(information.get(2));
	        area.setBounds(800,60,200,30); 
	        x1=new JLabel("SOURCE:");
	        x1.setBounds(370,100,500,50);
	        JTextArea a1=new JTextArea();
	        a1.setText(information.get(0));
	        a1.setBounds(450,110,200,30);
	        x2=new JLabel("DESTINATION:");
	        x2.setBounds(350,145,500,50);
	        JTextArea a2=new JTextArea();
	        a2.setText(information.get(1));
	        a2.setBounds(450,160,200,30);
	        Border blackline1 = BorderFactory.createLineBorder(Color.black);
	        panel1.setBorder(blackline1 );
	        JLabel t1 = new JLabel(" DATE:");
	        t1.setBounds(940,100,500,50);
	        f.add(t1);
	        JTextArea aT=new JTextArea();
	        aT.setText(information.get(3));
	        aT.setBounds(990,110,200,30);
	        JLabel t2 = new JLabel("DAY:");
	        t2.setBounds(940,145,500,50);
	        JTextArea aT1=new JTextArea("sunday");
	        aT1.setBounds(990,160,200,30);
	        f.add(t2);
	        f.add(aT);
	        f.add(aT1);
	        f.add(a2);
	        f.add(x2); 
	        f.add(a1);
	        f.add(x1);
	        f.add(area);  
	        f.add(lab1);
	        f.add(bu);  
	        f.add(panel1);
	        
	        
	        JPanel panel3=new JPanel();   
	        panel3.setBounds(350,200,1700,150);    
	        panel3.setBackground(Color.LIGHT_GRAY);  
	        JButton bu1=new JButton("CONFiRM"); 
	        bu1.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	                payment p = new payment();
	            }
	        }); 
	        bu1.setBounds(1370,320,150,30);  
	        lab2=new JLabel("AIRLINE NAME -  ");  
	        lab2.setBounds(700,200,100,50); 
	        JTextArea area1=new JTextArea("");  
	        area1.setText(information.get(6));
	        area1.setBounds(820,215,200,30);
	        JLabel x3,x4;
	        x3=new JLabel("SOURCE:");
	        x3.setBounds(370,260,500,50);
	        JTextArea a3=new JTextArea("");
	        a3.setText(information.get(4));
	        a3.setText(information.get(2));
	        a3.setBounds(450,260,200,30);
	        x4=new JLabel("DESTINATION:");
	        x4.setBounds(350,310,500,50);
	        JTextArea a4=new JTextArea("");
	        a4.setText(information.get(5));
	        a4.setBounds(450,310,200,30);
	        Border blackline3= BorderFactory.createLineBorder(Color.black);
	        panel3.setBorder(blackline3 );
	        JLabel t3 = new JLabel(" DATE:");
	        t3.setBounds(940,260,500,50);
	        f.add(t3);
	        JTextArea aT2=new JTextArea("");
	        aT2.setText(information.get(7));
	        aT2.setBounds(990,260,200,30);
	        JLabel t4 = new JLabel("DAY:");
	        t4.setBounds(940,310,500,50);
	        JTextArea aT3=new JTextArea("tuesday");
	        aT3.setBounds(990,310,200,30);
	        f.add(t4);
	        f.add(aT3);
	        f.add(aT2);
	        f.add(a3);
	        f.add(a4);
	        f.add(x3); 
	        f.add(x4);
	        f.add(area1);
	        f.add(lab2);
	        f.add(bu1);  
	        f.add(panel3);
	        
	        	        
	        JPanel panel4=new JPanel();  
	        panel4.setBounds(350,350,1700,150);    
	        panel4.setBackground(Color.gray);
	        JButton bu2=new JButton("CONFiRM");  
	        bu2.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	                payment p = new payment();
	            }
	        }); 
	        bu2.setBounds(1370,470,150,30); 
	        JLabel lab3;
	        lab3=new JLabel("AIRLINE NAME -  ");  
	        lab3.setBounds(700,350,100,50); 
	        JTextArea area2=new JTextArea("");  
	        area2.setText(information.get(10));
	        area2.setBounds(820,360,200,30); 
	        JLabel x5,x6;
	        x5=new JLabel("SOURCE:");
	        x5.setBounds(370,410,500,50);
	        JTextArea a5=new JTextArea("");
	        a5.setText(information.get(8));
	        a5.setBounds(450,410,200,30);
	        x6=new JLabel("DESTINATION:");
	        x6.setBounds(350,460,500,50);
	        JTextArea a6=new JTextArea("");
	        a6.setText(information.get(9));
	        a6.setBounds(450,460,200,30);  
	        JLabel t5 = new JLabel(" DATE:");
	        t5.setBounds(930,410,500,50);
	        f.add(t5);
	        JTextArea aT6=new JTextArea("");
	        aT6.setText(information.get(11));
	        aT6.setBounds(990,410,200,30);
	        JLabel t6 = new JLabel("DAY:");
	        t6.setBounds(940,460,500,50);
	        JTextArea aT7=new JTextArea("monday");
	        aT7.setBounds(990,460,200,30);
	        Border blackline4 = BorderFactory.createLineBorder(Color.black);
	        panel4.setBorder(blackline4 );
	        f.add(t6);
	        f.add(aT6);
	        f.add(aT7);   
	        f.add(a5);
	        f.add(a6);
	        f.add(x5); 
	        f.add(x6);
	        f.add(area2);
	        f.add(lab3);
	        f.add(bu2);  
	        f.add(panel4);
	        
	        JPanel panel5=new JPanel();  
	        panel5.setBounds(350,500,1700,150);    
	        panel5.setBackground(Color.LIGHT_GRAY);
	        JButton bu3=new JButton("CONFiRM");  
	        bu3.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	                payment p = new payment();
	            }
	        }); 
	        bu3.setBounds(1370,620,150,30);  
	        JLabel lab4;
	        lab4=new JLabel("AIRLINE NAME -  ");  
	        lab4.setBounds(700,500,100,50); 
	        JTextArea area3=new JTextArea("");  
	        area3.setText(information.get(14));
	        area3.setBounds(820,515,200,30); 
	        JLabel x7,x8;
	        x7=new JLabel("SOURCE:");
	        x7.setBounds(370,550,500,50);
	        JTextArea a7=new JTextArea("");
	        a7.setText(information.get(12));
	        a7.setBounds(450,550,200,30);
	        x8=new JLabel("DESTINATION:");
	        x8.setBounds(350,600,500,50);
	        JTextArea a8=new JTextArea("");
	        a8.setText(information.get(13));
	        a8.setBounds(450,600,200,30);
	        JLabel t7 = new JLabel(" DATE:");
	        t7.setBounds(930,560,500,50);
	        f.add(t7);
	        JTextArea aT8=new JTextArea("");
	        aT8.setText(information.get(15));
	        aT8.setBounds(990,560,200,30);
	        JLabel t8 = new JLabel("DAY:");
	        t8.setBounds(940,600,500,50);
	        JTextArea aT9=new JTextArea("friday");
	        aT9.setBounds(990,600,200,30);
	        Border blackline5 = BorderFactory.createLineBorder(Color.black);
	        panel5.setBorder(blackline5 );
	        f.add(t8);
	        f.add(aT8);
	        f.add(aT9);
	        f.add(a7);
	        f.add(a8);
	        f.add(x7); 
	        f.add(x8);
	        f.add(area3);
	        f.add(lab4);
	        f.add(bu3);  
	        f.add(panel5);
	        
	        JPanel panel6=new JPanel();  
	        panel6.setBounds(350,650,1700,150);    
	        panel6.setBackground(Color.gray); 
	        JButton bu4=new JButton("CONFiRM");  
	        bu4.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	                payment p = new payment();
	            }
	        }); 
	        bu4.setBounds(1370,770,150,30);  
	        JLabel lab5;
	        lab5=new JLabel("AIRLINE NAME -  ");  
	        lab5.setBounds(700,650,100,50); 
	        JTextArea area4=new JTextArea("");  
	        area4.setText(information.get(18));
	        area4.setBounds(820,660,200,30); 
	        JLabel x9,x10;
	        x9=new JLabel("SOURCE:");
	        x9.setBounds(370,700,500,50);
	        JTextArea a9=new JTextArea("");
	        a9.setText(information.get(16));
	        a9.setBounds(450,700,200,30);
	        x10=new JLabel("DESTINATION:");
	        x10.setBounds(350,750,500,50);
	        JTextArea a10=new JTextArea("");
	        a10.setText(information.get(17));
	        a10.setBounds(450,750,200,30);
	        JLabel t9= new JLabel(" DATE:");
	        t9.setBounds(930,710,500,50);
	        f.add(t9);
	        JTextArea aT10=new JTextArea("");
	        aT10.setText(information.get(19));
	        aT10.setBounds(990,710,200,30);
	        JLabel t10 = new JLabel("DAY:");
	        t10.setBounds(930,750,500,50);
	        JTextArea aT11=new JTextArea("wednesday");
	        aT11.setBounds(990,750,200,30);
	        Border blackline6 = BorderFactory.createLineBorder(Color.black);
	        panel6.setBorder(blackline6);
	        f.add(t10);
	        f.add(aT10);
	        f.add(aT11);
	        f.add(a9);
	        f.add(a10);
	        f.add(x10); 
	        f.add(x9);
	        f.add(area4);
	        f.add(lab5);
	        f.add(bu4);  
	        f.add(panel6);
	        
	  
	        
	                //f.setSize(400,400);    
	                f.setLayout(null);    
	                f.setVisible(true);    
	        }   
}
