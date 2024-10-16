package Inventory;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.LineBorder;
public class Order extends JFrame {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
    JTable t1,t2,t3;
    JTextField tf1,tf2,tf3,tf4;
    JButton b1,b2,b3,b4,b5;
	public Order() {
		// TODO Auto-generated constructor stub
		l1=new JLabel("INVENTORY MANAGEMENT SYSTEM");
		l1.setBounds(500,7,800,50);
		l1.setFont(new Font("SEN_SERIF",Font.BOLD,30));
	  	add(l1);
	  	
	  	l2=new JLabel("MANAGE ORDERS");
		l2.setBounds(600,60,500,50);
		l2.setFont(new Font("SEN_SERIF",Font.BOLD,30));
	  	add(l2);
	  	
	  	l3=new JLabel("CUSTOMERS LIST");
		l3.setBounds(200,150,300,40);
		l3.setFont(new Font("SEN_SERIF",Font.BOLD,25));
	  	add(l3);
	  	
	  	t1=new JTable();
	  	t1.setBounds(10,250,500,300);
	  	add(t1);
	  	
	  	 l5=new JLabel("CustId");
		l5.setBounds(15,210,90,40);
		l5.setFont(new Font("SEN_SERIF",Font.BOLD,20));
		add(l5);
	  	
		l6=new JLabel("CustName");
		l6.setBounds(150,210,150,40);
		l6.setFont(new Font("SEN_SERIF",Font.BOLD,20));
		add(l6);
		
		l7=new JLabel("CustPhone");
		l7.setBounds(300,210,150,40);
		l7.setFont(new Font("SEN_SERIF",Font.BOLD,20));
		add(l7);
		
	  	l4=new JLabel("PRODUCT LIST");
		l4.setBounds(900,150,500,50);
		l4.setFont(new Font("SEN_SERIF",Font.BOLD,25));
	  	add(l4);
	  	
	  	t1=new JTable();
	  	t1.setBounds(650,250,850,300);
	  	add(t1);
	  	
	  	l8=new JLabel("ProdId");
		l8.setBounds(700,200,90,40);
		l8.setFont(new Font("SEN_SERIF",Font.BOLD,20));
		add(l8);
		
		l9=new JLabel("ProdName");
		l9.setBounds(850,200,150,40);
		l9.setFont(new Font("SEN_SERIF",Font.BOLD,20));
		add(l9);
		
		l10=new JLabel("ProdQty");
		l10.setBounds(1000,200,90,40);
		l10.setFont(new Font("SEN_SERIF",Font.BOLD,20));
		add(l10);
		
		l11=new JLabel("ProdDesc");
		l11.setBounds(1150,200,150,40);
		l11.setFont(new Font("SEN_SERIF",Font.BOLD,20));
		add(l11);
		
		l12=new JLabel("ProdCat");
		l12.setBounds(1350,200,90,40);
		l12.setFont(new Font("SEN_SERIF",Font.BOLD,20));
		add(l12);
		
		
	       
		l13=new JLabel("OrderId");
		l13.setBounds(20,590,90,80);
		l13.setFont(new Font("SEN_SERIF",Font.BOLD,25));
		add(l13);
		
		 tf1=new JTextField();
		    // tf1.setBackground(new Color(50,120,210,50));
		     tf1.setBounds(150,610,250,50);
		      //username.setOpaque(false);
		     tf1.setForeground(Color.WHITE);
		     add(tf1);
		
		l14=new JLabel("Price");
		l14.setBounds(450,590,90,80);
		l14.setFont(new Font("SEN_SERIF",Font.BOLD,25));
		add(l14);
		
		tf2=new JTextField();
	    // tf1.setBackground(new Color(50,120,210,50));
	     tf2.setBounds(540,610,250,50);
	      //username.setOpaque(false);
	     tf2.setForeground(Color.WHITE);
	     add(tf2);
		
		l10=new JLabel("Quantity");
		l10.setBounds(830,590,300,80);
		l10.setFont(new Font("SEN_SERIF",Font.BOLD,25));
		add(l10);
		
		tf3=new JTextField();
	    // tf1.setBackground(new Color(50,120,210,50));
	     tf3.setBounds(940,610,250,50);
	      //username.setOpaque(false);
	     tf3.setForeground(Color.WHITE);
	     add(tf3);
	     
	     b1=new JButton("AddtoOrder");
		   b1.setBackground(Color.black);
		   b1.setForeground(Color.white);
		   b1.setBorder(new LineBorder(Color.black));
		   b1.setFont(new Font("SAN_SERIF",Font.BOLD,18));
		   b1.setBounds(1250,610,200,50);
		   //b1.addActionListener(this);
		   add(b1);
		
		   l15=new JLabel("Customer Name");
			l15.setBounds(20,680,300,80);
			l15.setFont(new Font("SEN_SERIF",Font.BOLD,25));
			add(l15);
			
			l16=new JLabel("Date");
			l16.setBounds(20,750,90,80);
			l16.setFont(new Font("SEN_SERIF",Font.BOLD,25));
			add(l16);
			
			b2=new JButton("Add Orders");
			   b2.setBackground(Color.black);
			   b2.setForeground(Color.white);
			   b2.setBorder(new LineBorder(Color.black));
			   b2.setFont(new Font("SAN_SERIF",Font.BOLD,18));
			   b2.setBounds(50,820,200,50);
			   //b1.addActionListener(this);
			   add(b2);
			   
			   b3=new JButton("View Orders");
			   b3.setBackground(Color.black);
			   b3.setForeground(Color.white);
			   b3.setBorder(new LineBorder(Color.black));
			   b3.setFont(new Font("SAN_SERIF",Font.BOLD,18));
			   b3.setBounds(350,820,200,50);
			   //b1.addActionListener(this);
			   add(b3);
			   
			   b4=new JButton("Home");
			   b4.setBackground(Color.black);
			   b4.setForeground(Color.white);
			   b4.setBorder(new LineBorder(Color.black));
			   b4.setFont(new Font("SAN_SERIF",Font.BOLD,18));
			   b4.setBounds(200,900,200,50);
			   //b1.addActionListener(this);
			   add(b4);
			   
			   t3=new JTable();
			   t3.setBounds(650,720,750,200);
			   add(t3);
			   
			   l17=new JLabel("No.");
				l17.setBounds(680,670,90,40);
				l17.setFont(new Font("SEN_SERIF",Font.BOLD,20));
				add(l17);
				
				l18=new JLabel("Product");
				l18.setBounds(750,670,90,40);
				l18.setFont(new Font("SEN_SERIF",Font.BOLD,20));
				add(l18);
				
				l19=new JLabel("Quantity");
				l19.setBounds(900,670,90,40);
				l19.setFont(new Font("SEN_SERIF",Font.BOLD,20));
				add(l19);
				
				l20=new JLabel("Price");
				l20.setBounds(1100,670,90,40);
				l20.setFont(new Font("SEN_SERIF",Font.BOLD,20));
				add(l20);
				
				l21=new JLabel("Total");
				l21.setBounds(1250,670,90,40);
				l21.setFont(new Font("SEN_SERIF",Font.BOLD,20));
				add(l21);
				
				 b5=new JButton("Print");
				  b5.setBackground(Color.black);
				   b5.setForeground(Color.white);
				   b5.setBorder(new LineBorder(Color.black));
				   b5.setFont(new Font("SAN_SERIF",Font.BOLD,18));
				   b5.setBounds(1100,930,200,50);
				   //b1.addActionListener(this);
				   add(b5);
	  	
	  	setBounds(200,0,1600,1100);
	 	setLayout(null);
	 	setBackground(Color.RED);
	 	setForeground(Color.BLUE);
	 	setDefaultCloseOperation(EXIT_ON_CLOSE);
	 	setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new Order();
	}

}
