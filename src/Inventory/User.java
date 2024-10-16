package Inventory;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;
import net.proteanit.sql.*;

public class User extends JFrame implements ActionListener{
         
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextField t1,t2,t3,t4;
	JComboBox cb;
	JTable t5;
	JButton b1,b2,b3,b4,b5;
	public User() {
		// TODO Auto-generated constructor stub
		
		JPanel user=new JPanel();
		user.setLayout(null);
		user.setBounds(30,30,700,700);
		user.setBackground(new Color(0,0,0,80));
		
		 l1=new JLabel("UName");
		 l1.setBounds(50,50,250,50);
		 l1.setForeground(Color.WHITE);
		 l1.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		 user.add(l1);
		  
		 t1=new JTextField();
	     t1.setBackground(new Color(0,0,210,50));
	     t1.setBounds(250,50,300,50);
	      //username.setOpaque(false);
	     t1.setForeground(Color.WHITE);
	     user.add(t1);
	       
	       l2=new JLabel("Password");
			  l2.setBounds(50,120,250,50);
			  l2.setForeground(Color.WHITE);
			  l2.setFont(new Font("SAN_SERIF",Font.BOLD,20));
			  user.add(l2);
			  
			  t2=new JTextField();
		       t2.setBackground(new Color(50,120,210,50));
		       t2.setBounds(250,120,300,50);
		      //username.setOpaque(false);
		       t2.setForeground(Color.WHITE);
		       user.add(t2);
		       
		       l3=new JLabel("Phone");
				  l3.setBounds(50,190,250,50);
				  l3.setForeground(Color.WHITE);
				  l3.setFont(new Font("SAN_SERIF",Font.BOLD,20));
				  user.add(l3);
				  
				  t3=new JTextField();
			       t3.setBackground(new Color(50,120,210,50));
			       t3.setBounds(250,190,300,50);
			      //username.setOpaque(false);
			       t3.setForeground(Color.WHITE);
			       user.add(t3);
			       
			       /*l4=new JLabel("Description");
					  l4.setBounds(50,260,250,50);
					  l4.setForeground(Color.WHITE);
					  l4.setFont(new Font("SAN_SERIF",Font.BOLD,20));
					  customer.add(l4);
					  
					  t4=new JTextField();
				       t4.setBackground(new Color(50,120,210,50));
				       t4.setBounds(250,260,300,50);
				      //username.setOpaque(false);
				       t4.setForeground(Color.WHITE);
				       customer.add(t4);
				       
					  
					  l5=new JLabel("Category");
					  l5.setBounds(50,330,250,50);
					  l5.setForeground(Color.WHITE);
					  l5.setFont(new Font("SAN_SERIF",Font.BOLD,20));
					  customer.add(l5);
					  
					  cb=new JComboBox(new String[] {"Single Bed","Double Bed"});
					  cb.setBounds(280,360,280,50);
					  cb.setBackground(new Color(50,120,210,50));
					  add(cb);*/
					  
					  b1=new JButton("ADD");
					  b1.setBounds(50,500,120,40);
					  b1.setBackground(Color.black);
					  b1.setForeground(Color.white);
						b1.setFont(new Font("SAN_SERIF",Font.BOLD,15));
						b1.setBorder(new LineBorder(Color.black));
						b1.addActionListener(this);
						user.add(b1);
						
						 b2=new JButton("EDIT");
							b2.setBounds(250,500,120,40);
							b2.setBackground(Color.black);
							b2.setForeground(Color.white);
							b2.setFont(new Font("SAN_SERIF",Font.BOLD,15));
							b2.setBorder(new LineBorder(Color.black));
							b2.addActionListener(this);
							user.add(b2);
							
							 b3=new JButton("DELETE");
							 b3.setBounds(450,500,120,40);
							 b3.setBackground(Color.black);
						   	b3.setForeground(Color.white);
							b3.setFont(new Font("SAN_SERIF",Font.BOLD,15));
							b3.setBorder(new LineBorder(Color.black));
						    b3.addActionListener(this);
							user.add(b3);
								
							b4=new JButton("HOME");
									b4.setBounds(250,600,120,40);
									b4.setBackground(Color.black);
									b4.setForeground(Color.white);
									b4.setFont(new Font("SAN_SERIF",Font.BOLD,15));
									b4.setBorder(new LineBorder(Color.black));
									b4.addActionListener(this);
									user.add(b4);
									
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
		  	  Image temp_img=img1.getScaledInstance(800,700,Image.SCALE_SMOOTH);//for resize image
		  	  img=new ImageIcon(temp_img);
		  	  JLabel l6=new JLabel("",img,JLabel.CENTER);
		  	  l6.add(user);
		  	  l6.setBounds(0,100,800,700);
		  	  add(l6);
		  	 
		  	  l13=new JLabel("USER LIST");
		  	  l13.setBounds(1000, 90, 400, 50);
		  	l13.setFont(new Font("SEN_SERIF",Font.BOLD,25));
	    	l13.setForeground(Color.RED);
	    	//l13.setBackground(Color.BLACK);
		  	  add(l13);
		 
		  	t5=new JTable();
		  	t5.setBounds(810,200,950,600);
		  	add(t5);
		  	
		  	 l8=new JLabel("UName");
			l8.setBounds(880,150,90,40);
			l8.setFont(new Font("SEN_SERIF",Font.BOLD,20));
			add(l8);
			
			 l9=new JLabel("Password");
			l9.setBounds(1100,150,110,40);
			l9.setFont(new Font("SEN_SERIF",Font.BOLD,20));
			add(l9);
			
			 l10=new JLabel("Phone");
			l10.setBounds(1320,150,100,40);
			l10.setFont(new Font("SEN_SERIF",Font.BOLD,20));
			add(l10);
			
			l11=new JLabel("MANAGE USERS");
			l11.setBounds(600,7,500,60);
			l11.setFont(new Font("SEN_SERIF",Font.BOLD,40));
		  	add(l11);
		  	
		    
			setBounds(100,100,1500,900);
		 	setLayout(null);
		 	setDefaultCloseOperation(EXIT_ON_CLOSE);
		 	setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			String Uname=t1.getText(); //'',""//'Admin'
			//String name=t2.getText();
		    String Password=t2.getText();
			//String security=c1.getSelectedItem();
		    String Phone=t3.getText();
		    
		    
		    
		    try {
		    	Database db=new Database();
		    	String query="insert into user values('"+Uname+"','"+Password+"','"+Phone+"')";
		    	db.stmt.executeUpdate(query);
		      String query1="Select * from user";
		    	ResultSet rs=db.stmt.executeQuery(query1);
	    		  
	    		  t5.setModel(DbUtils.resultSetToTableModel(rs));
		    	JOptionPane.showMessageDialog(null, "User added Successfully");
		    	
		    	this.setVisible(true);
		    	//new Log_in().setVisible(true);
		    }catch(Exception ex) {
		    	
		    }
		}
		else if(ae.getSource()==b2) {
			String Uname=t1.getText(); 
			String Password=t2.getText();
			String Phone=t3.getText();
			String query1="update user set Uname='"+Uname+"',Password='"+Password+"',Phone='"+Phone+'"';
			try {
				Database db=new Database();
		    	db.stmt.executeUpdate(query1);
		    	JOptionPane.showMessageDialog(null, "User Updated Successfully");
		    	this.setVisible(true);
			}catch(Exception ex) {
				
			}
			//this.setVisible(false);
			//new Log_in().setVisible(true);
			
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new User();
	}

}
