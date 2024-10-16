package Inventory;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

import Hotel.Log_in;

import java.awt.*;

public class Product extends JFrame implements ActionListener{
  
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextField t1,t2,t3,t4;
	JComboBox cb;
	JTable t5;
	JButton b1,b2,b3,b4,b5;
	public Product() {
		// TODO Auto-generated constructor stub
		 
		JPanel product=new JPanel();
		product.setLayout(null);
		product.setBounds(30,30,700,700);
		product.setBackground(new Color(0,0,0,80));
		
		 l1=new JLabel("Prodid");
		 l1.setBounds(50,50,250,50);
		 l1.setForeground(Color.WHITE);
		 l1.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		 product.add(l1);
		  
		 t1=new JTextField();
	     t1.setBackground(new Color(0,0,210,50));
	     t1.setBounds(250,50,300,50);
	      //username.setOpaque(false);
	     t1.setForeground(Color.WHITE);
	     product.add(t1);
	       
	       l2=new JLabel("Name");
			  l2.setBounds(50,120,250,50);
			  l2.setForeground(Color.WHITE);
			  l2.setFont(new Font("SAN_SERIF",Font.BOLD,20));
			  product.add(l2);
			  
			  t2=new JTextField();
		       t2.setBackground(new Color(50,120,210,50));
		       t2.setBounds(250,120,300,50);
		      //username.setOpaque(false);
		       t2.setForeground(Color.WHITE);
		       product.add(t2);
		       
		       l3=new JLabel("Quantity");
				  l3.setBounds(50,190,250,50);
				  l3.setForeground(Color.WHITE);
				  l3.setFont(new Font("SAN_SERIF",Font.BOLD,20));
				  product.add(l3);
				  
				  t3=new JTextField();
			       t3.setBackground(new Color(50,120,210,50));
			       t3.setBounds(250,190,300,50);
			      //username.setOpaque(false);
			       t3.setForeground(Color.WHITE);
			       product.add(t3);
			       
			       l4=new JLabel("Description");
					  l4.setBounds(50,260,250,50);
					  l4.setForeground(Color.WHITE);
					  l4.setFont(new Font("SAN_SERIF",Font.BOLD,20));
					  product.add(l4);
					  
					  t4=new JTextField();
				       t4.setBackground(new Color(50,120,210,50));
				       t4.setBounds(250,260,300,50);
				      //username.setOpaque(false);
				       t4.setForeground(Color.WHITE);
				       product.add(t4);
				       
					  
					  l5=new JLabel("Category");
					  l5.setBounds(50,330,250,50);
					  l5.setForeground(Color.WHITE);
					  l5.setFont(new Font("SAN_SERIF",Font.BOLD,20));
					  product.add(l5);
					  
					  cb=new JComboBox(new String[] {"Single Bed","Double Bed"});
					  cb.setBounds(280,360,280,50);
					  cb.setBackground(new Color(50,120,210,50));
					  add(cb);
					  
					  b1=new JButton("ADD");
					  b1.setBounds(50,500,120,40);
					  b1.setBackground(Color.black);
					  b1.setForeground(Color.white);
						b1.setFont(new Font("SAN_SERIF",Font.BOLD,15));
						b1.setBorder(new LineBorder(Color.black));
						//b1.addActionListener(this);
						product.add(b1);
						
						 b2=new JButton("DELETE");
							b2.setBounds(250,500,120,40);
							b2.setBackground(Color.black);
							b2.setForeground(Color.white);
							b2.setFont(new Font("SAN_SERIF",Font.BOLD,15));
							b2.setBorder(new LineBorder(Color.black));
							//b2.addActionListener(this);
							product.add(b2);
							
							 b3=new JButton("UPDATE");
							 b3.setBounds(450,500,120,40);
							 b3.setBackground(Color.black);
						   	b3.setForeground(Color.white);
							b3.setFont(new Font("SAN_SERIF",Font.BOLD,15));
							b3.setBorder(new LineBorder(Color.black));
								//b3.addActionListener(this);
								product.add(b3);
								
							b4=new JButton("HOME");
									b4.setBounds(250,600,120,40);
									b4.setBackground(Color.black);
									b4.setForeground(Color.white);
									b4.setFont(new Font("SAN_SERIF",Font.BOLD,15));
									b4.setBorder(new LineBorder(Color.black));
									//b4.addActionListener(this);
									product.add(b4);
									
									/* b5=new JButton("ADD");
										b5.setBounds(290,600,120,40);
										b5.setBackground(Color.black);
										b5.setForeground(Color.white);
										b5.setFont(new Font("SAN_SERIF",Font.BOLD,15));
										b5.setBorder(new LineBorder(Color.black));
										//b5.addActionListener(this);
										product.add(b5);*/
		       
	          ImageIcon img=new ImageIcon(getClass().getResource("/icons/product.png"));
		  	  Image img1=img.getImage();
		  	  Image temp_img=img1.getScaledInstance(800,800,Image.SCALE_SMOOTH);//for resize image
		  	  img=new ImageIcon(temp_img);
		  	  JLabel l6=new JLabel("",img,JLabel.CENTER);
		  	  l6.add(product);
		  	  l6.setBounds(0,100,800,800);
		  	  add(l6);
		  	  
		  	  //JLabel l7=new JLabel("",JLabel.CENTER);
		  	  //l7.add(product);
		  	 // l7.setBounds(900, 0, 400, 800);
		  	  //l7.setBackground(Color.BLACK);
		  	 // add(l7);
		  	  
		  	  l13=new JLabel("PRODUCT LIST");
		  	  l13.setBounds(1200, 100, 400, 50);
		  	l13.setFont(new Font("SEN_SERIF",Font.BOLD,25));
	    	l13.setForeground(Color.RED);
	    	//l13.setBackground(Color.BLACK);
		  	  add(l13);
		 
		  	t5=new JTable();
		  	t5.setBounds(810,250,950,600);
		  	add(t5);
		  	
		  	 l8=new JLabel("Prodid");
			l8.setBounds(830,200,90,40);
			l8.setFont(new Font("SEN_SERIF",Font.BOLD,20));
			add(l8);
			
			
			 l9=new JLabel("Name");
			l9.setBounds(1000,200,110,40);
			l9.setFont(new Font("SEN_SERIF",Font.BOLD,20));
			add(l9);
			
			 l10=new JLabel("Quantity");
			l10.setBounds(1170,200,100,40);
			l10.setFont(new Font("SEN_SERIF",Font.BOLD,20));
			add(l10);
			
			 l11=new JLabel("Description");
			l11.setBounds(1360,200,200,40);
			l11.setFont(new Font("SEN_SERIF",Font.BOLD,20));
			add(l11);
			
			 l12=new JLabel("Category");
			l12.setBounds(1560,200,140,40);
			l12.setFont(new Font("SEN_SERIF",Font.BOLD,20));
			add(l12);
		  	
			l13=new JLabel("MANAGE PRODUCT");
			 l13.setBounds(700,7,500,50);
			 l13.setForeground(Color.BLACK);
			 l13.setFont(new Font("SAN_SERIF",Font.BOLD,40));
			add(l13);
		    
			setBounds(100,100,1800,900);
		 	setLayout(null);
		 	setDefaultCloseOperation(EXIT_ON_CLOSE);
		 	setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		   new Log_in().setVisible(true);
		   this.setVisible(false);
	   }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Product();
	}

}
