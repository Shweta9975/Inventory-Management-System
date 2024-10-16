package Inventory;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;


    
public class Menu extends JFrame implements ActionListener {
	JButton b1,b2,b3,b4,b5,b6;
	public Menu() {
		// TODO Auto-generated constructor stub
		b1=new JButton("Products");
		   b1.setBackground(Color.black);
		   b1.setForeground(Color.white);
		   b1.setBorder(new LineBorder(Color.black));
		   b1.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
		   b1.setBounds(20,30,200,50);
		   b1.addActionListener(this);
		   add(b1);
		   
		   b2=new JButton("User");
		   b2.setBackground(Color.black);
		   b2.setForeground(Color.white);
		   b2.setBorder(new LineBorder(Color.black));
		   b2.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
		   b2.setBounds(20,90,200,50);
		   b2.addActionListener(this);
		   add(b2);
		   
		   b3=new JButton("Category");
		   b3.setBackground(Color.black);
		   b3.setForeground(Color.white);
		   b3.setBorder(new LineBorder(Color.black));
		   b3.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
		   b3.setBounds(20,160,200,50);
		   b3.addActionListener(this);
		   add(b3);
		   
		   b4=new JButton("Customer");
		   b4.setBackground(Color.black);
		   b4.setForeground(Color.white);
		   b4.setBorder(new LineBorder(Color.black));
		   b4.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
		   b4.setBounds(20,230,200,50);
		   b4.addActionListener(this);
		   add(b4);
		   
		   b5=new JButton("Order");
		   b5.setBackground(Color.black);
		   b5.setForeground(Color.white);
		   b5.setBorder(new LineBorder(Color.black));
		   b5.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
		   b5.setBounds(20,300,200,50);
		   b5.addActionListener(this);
		   add(b5);
		   
		   ImageIcon img=new ImageIcon(getClass().getResource("/icons/img1.jpg"));
	   	   JLabel l=new JLabel(img);
		   l.setBounds(250,0,520,530);
	    	add(l);
	    	
	    	 setLayout(null);
			   setBounds(500,200,800,600);
			   getContentPane().setBackground(Color.white);
			   setVisible(true);
	}
	    	public void actionPerformed(ActionEvent ae) {
	    		  if(ae.getSource()==b1) {
	    			 new Product().setVisible(true);
	    			 this.setVisible(false);
	    		  }else if(ae.getSource()==b2) {
	    			  new User().setVisible(true);
	    			  this.setVisible(false);
	    		  }else if(ae.getSource()==b3) {
	    			  new Category().setVisible(true);
	    			  this.setVisible(false);
	    		  }else if(ae.getSource()==b4) {
	    			 new Customer().setVisible(true);
	    			 this.setVisible(false);
	    		  }else if(ae.getSource()==b5) {
	    			  new Order().setVisible(true);
	    				this.setVisible(false);
	    		  }//else if(ae.getSource()==b12) {
	    			// setVisible(false); 
	    		  }
		  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new Menu();
	}

}
