import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class openAccount2 extends JFrame
implements ActionListener
{
	
	
	
	

	//UI2
	JTextField tf1,tf2;
	JLabel l4,l5,l6,l7,l8;
	JButton b2;
	JList list99;
	
	
	
	public void openAccountUI2()
	{
		super.setBounds(450, 150, 400, 400);
		super.setTitle("-BANK APPLICATION FORM");
		super.setResizable(false);
		 //	     JFrame COLOR
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon
				("E:\\eclipse-workspace\\BANKING\\wallpaper\\bfinal4.jpg")));
		setLayout(new FlowLayout());
		
		
		l4 = new JLabel("BANK - ");
		l4.setBounds(20, 50, 200, 40);
		super.add(l4);
		l4.setForeground(Color.white);
		
		l5 = new JLabel("ACCOUNT OPENING AMOUNT - ");
		l5.setBounds(20, 100, 200, 40);
		super.add(l5);
		l5.setForeground(Color.white);
		
		l6 = new JLabel("MINIMUM ACCOUNT OPENING BALANCE : ");
		l6.setBounds(20, 150, 250, 40);
		super.add(l6);
		l6.setForeground(Color.white);
		
		l7 = new JLabel(" NOTE : YOUR DETAILS FOR OPENING A ACCOUNT IS FETCHED");
		l7.setBounds(20, 2, 400, 40);
		super.add(l7);
		l7.setForeground(Color.white);
		Font f99 = new Font("",Font.BOLD,10);
		l7.setFont(f99);
		l8 = new JLabel("    BY OUR DATABASE WHICH IS USED AT THE TIME OF SIGNUP");
		l8.setBounds(20, 20, 400, 40);
		super.add(l8);
		l8.setForeground(Color.white);
		l8.setFont(f99);
		
		// minimum amounts
		
		String bankAmount[]= {"AXIS BANK - Rs 5,000","HDFC BANK - Rs 10,000"
				,"SBI BANK - Rs 3,000","PNB BANK - Rs 1,000","KOTAK BANK - Rs 0"};
		list99 = new JList(bankAmount);
		list99.setSelectedIndex(2);
		list99.setBounds(20, 180, 250, 100);
	    super.add(list99);
		
	    
	    
	    // text field
	    
	    tf1 = new JTextField();
	    tf1.setBounds(230, 50, 150, 30);
	    super.add(tf1);
	    tf1.setEditable(false);
	    
	     tf1.setText(openAccount.emBANK);
	    
	    tf2 = new JTextField();
	    tf2.setBounds(230, 100, 150, 30);
	    super.add(tf2);
	   
	    
	    // buttons
	    b2 =new JButton("OPEN ACCOUNT");
	    b2.setBounds(250, 300, 100, 30);
	    super.add(b2);
	    Font f3 = new Font("",Font.ITALIC,8);
	    b2.setFont(f3);
	    b2.setBackground(Color.green);
	    b2.setForeground(Color.black);
	    b2.addActionListener(this);
	    
		        // 3rd last
				super.setLayout(null);
				// 2nd last
				super.setVisible(true);
				//last st
				super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
		
	public static void main(String[] args) 
	{
		openAccount2 run97 = new openAccount2();
		run97.openAccountUI2();
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==b2)
		{
			
			
			
			String initialAMOUNT = tf2.getText();
			int initialAMOUNT1 = Integer.parseInt(initialAMOUNT);
			
			// emVERIFIED      ****** email id of person
	        //emBANK           ****** bank name chosen
			//initialAMOUNT    ****** initial amount for opening a bank account
			
			

			try {
				
				int working = 0;
				
				String emBANK1 = openAccount.emBANK;
				String emVERIFIED1 = login.emVERIFIED;

				//step 1 loading driver file
				Class.forName("com.mysql.jdbc.Driver");
				
				//step 2 get connection
				Connection co= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankdb","root","root");
				
				//step 3 get statement
				Statement st1=co.createStatement();
				Statement st2=co.createStatement();
				
				
				
			//	if()
				{
					
				}
				
				
				
				
				// check minimun amount required
				if(emBANK1.equalsIgnoreCase("AXIS BANK"))
				{
					
					if(initialAMOUNT1 >= 5000)
					{
						int emSTATUS = 1;
						 // creating account number 
						SimpleDateFormat x = new SimpleDateFormat("YYMMdd"); Date y = new Date(); String z = x.format(y);
						Random rano = new Random();int rano1 = rano.nextInt(100);
						String emAccount = ("AXIS"+z+rano1);
					    //step 4 YEHI HAI AAPKA ASLI CODE
						
						// **************************************************************************************parked for random no verification
						String query1 = " select * from userinfo where email = '"+emVERIFIED1+"' ";
						
						ResultSet rs1 = st1.executeQuery(query1);
						while(rs1.next())
						{
							String emNAME1 = rs1.getString("NAME");
							String emMOBILE1 = rs1.getString("MOBILE");
							String emADDRESS1 = rs1.getString("ADDRESS");
							
							String query2 = "insert into axisbank values('"+emAccount+"','"+emNAME1+"','"+emVERIFIED1+"','"+emMOBILE1+"','"+emADDRESS1+"','"+initialAMOUNT1+"','"+emSTATUS+"')";
							
							st2.executeUpdate(query2);
						
							JOptionPane.showMessageDialog(this, "YOUR ACCOUNT IS SUCCESFULLY CREATED \n Kindly Read Next Message Carefully ");
							JOptionPane.showMessageDialog(this, "WELCOME TO "+emBANK1+" ! \n KINDLY NOTE ' "+emAccount+" ' THIS ACCOUNT NUMBER \n\n THANKYOU FOR CHOOSING");
						
						}
						
						//step 5 closing the connection
						co.close();	
						JOptionPane.showMessageDialog(this, "NOW YOU ARE REDIRECTING ON BANK MENU !!!");
						
						loginRedirect runx1 = new loginRedirect();
						runx1.loginRedirectUI();
						
						super.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(this, "YOU CANNOT ENTER MONEY LESS THEN BANK MINIMUM AMOUNT \nPLEASE CHECK AXIS BANK CONDITIONS");
						working++;
					}
				}
				else if(emBANK1.equalsIgnoreCase("HDFC BANK"))
				{
					
					if(initialAMOUNT1 >= 10000)
					{
						int emSTATUS = 1;
						 // creating account number 
						SimpleDateFormat x = new SimpleDateFormat("YYMMdd"); Date y = new Date(); String z = x.format(y);
						Random rano = new Random();int rano1 = rano.nextInt(100);
						String emAccount = ("HDFC"+z+rano1);
					    //step 4 YEHI HAI AAPKA ASLI CODE
						
						String query1 = " select * from userinfo where email = '"+emVERIFIED1+"' ";
						
						ResultSet rs1 = st1.executeQuery(query1);
						while(rs1.next())
						{
							String emNAME1 = rs1.getString("NAME");
							String emMOBILE1 = rs1.getString("MOBILE");
							String emADDRESS1 = rs1.getString("ADDRESS");
							
							String query2 = "insert into hdfcbank values('"+emAccount+"','"+emNAME1+"','"+emVERIFIED1+"','"+emMOBILE1+"','"+emADDRESS1+"','"+initialAMOUNT1+"','"+emSTATUS+"')";
							
							st2.executeUpdate(query2);
						
							JOptionPane.showMessageDialog(this, "YOUR ACCOUNT IS SUCCESFULLY CREATED \n Kindly Read Next Message Carefully ");
							JOptionPane.showMessageDialog(this, "WELCOME TO "+emBANK1+" ! \n KINDLY NOTE ' "+emAccount+" ' THIS ACCOUNT NUMBER \n\n THANKYOU FOR CHOOSING");
							
						}
						
						//step 5 closing the connection
						co.close();
                        JOptionPane.showMessageDialog(this, "NOW YOU ARE REDIRECTING ON BANK MENU !!!");
					    loginRedirect runx1 = new loginRedirect();
						runx1.loginRedirectUI();
						super.dispose();
									
					}
					else
					{
						JOptionPane.showMessageDialog(this, "YOU CANNOT ENTER MONEY LESS THEN BANK MINIMUM AMOUNT \nPLEASE CHECK HDFC BANK CONDITIONS");
						working++;
					}
				}
				else if(emBANK1.equalsIgnoreCase("SBI BANK"))
				{
					
					if(initialAMOUNT1 >= 3000)
					{
						
						int emSTATUS = 1;
						 // creating account number 
						SimpleDateFormat x = new SimpleDateFormat("YYMMdd"); Date y = new Date(); String z = x.format(y);
						Random rano = new Random();int rano1 = rano.nextInt(100);
						String emAccount = ("SBI"+z+rano1);
					    //step 4 YEHI HAI AAPKA ASLI CODE
						
						String query1 = " select * from userinfo where email = '"+emVERIFIED1+"' ";
						
						ResultSet rs1 = st1.executeQuery(query1);
						while(rs1.next())
						{
							String emNAME1 = rs1.getString("NAME");
							String emMOBILE1 = rs1.getString("MOBILE");
							String emADDRESS1 = rs1.getString("ADDRESS");
							
							String query2 = "insert into sbibank values('"+emAccount+"','"+emNAME1+"','"+emVERIFIED1+"','"+emMOBILE1+"','"+emADDRESS1+"','"+initialAMOUNT1+"','"+emSTATUS+"')";
							
							st2.executeUpdate(query2);
						
							JOptionPane.showMessageDialog(this, "YOUR ACCOUNT IS SUCCESFULLY CREATED \n Kindly Read Next Message Carefully ");
							JOptionPane.showMessageDialog(this, "WELCOME TO "+emBANK1+" ! \n KINDLY NOTE ' "+emAccount+" ' THIS ACCOUNT NUMBER \n\n THANKYOU FOR CHOOSING");
							
						}
						
						//step 5 closing the connection
						co.close();
						JOptionPane.showMessageDialog(this, "NOW YOU ARE REDIRECTING ON BANK MENU !!!");
					    loginRedirect runx1 = new loginRedirect();
						runx1.loginRedirectUI();
						super.dispose();
						
						
					}
					else
					{
						JOptionPane.showMessageDialog(this, "YOU CANNOT ENTER MONEY LESS THEN BANK MINIMUM AMOUNT \nPLEASE CHECK SBI BANK CONDITIONS");
						working++;
					}
				}
					
				else if(emBANK1.equalsIgnoreCase("PNB BANK"))
				{
					
					if(initialAMOUNT1 >= 1000)
					{
						
						
						int emSTATUS = 1;
						 // creating account number 
						SimpleDateFormat x = new SimpleDateFormat("YYMMdd"); Date y = new Date(); String z = x.format(y);
						Random rano = new Random();int rano1 = rano.nextInt(100);
						String emAccount = ("PNB"+z+rano1);
					    //step 4 YEHI HAI AAPKA ASLI CODE
						
						String query1 = " select * from userinfo where email = '"+emVERIFIED1+"' ";
						
						ResultSet rs1 = st1.executeQuery(query1);
						while(rs1.next())
						{
							String emNAME1 = rs1.getString("NAME");
							String emMOBILE1 = rs1.getString("MOBILE");
							String emADDRESS1 = rs1.getString("ADDRESS");
							
							String query2 = "insert into pnbbank values('"+emAccount+"','"+emNAME1+"','"+emVERIFIED1+"','"+emMOBILE1+"','"+emADDRESS1+"','"+initialAMOUNT1+"','"+emSTATUS+"')";
							
							st2.executeUpdate(query2);
						
							JOptionPane.showMessageDialog(this, "YOUR ACCOUNT IS SUCCESFULLY CREATED \n Kindly Read Next Message Carefully ");
							JOptionPane.showMessageDialog(this, "WELCOME TO "+emBANK1+" ! \n KINDLY NOTE ' "+emAccount+" ' THIS ACCOUNT NUMBER \n\n THANKYOU FOR CHOOSING");
							
						}
						
						//step 5 closing the connection
						co.close();
						JOptionPane.showMessageDialog(this, "NOW YOU ARE REDIRECTING ON BANK MENU !!!");
					    loginRedirect runx1 = new loginRedirect();
						runx1.loginRedirectUI();
						super.dispose();
						
					}
					else
					{
						JOptionPane.showMessageDialog(this, "YOU CANNOT ENTER MONEY LESS THEN BANK MINIMUM AMOUNT \nPLEASE CHECK PNB BANK CONDITIONS");
						working++;
					}
				}
				
				else if(emBANK1.equalsIgnoreCase("KOTAK MAHINDRA BANK"))
				{
					
					if(initialAMOUNT1 >= 0)
					{
						
						int emSTATUS = 1;
						 // creating account number 
						SimpleDateFormat x = new SimpleDateFormat("YYMMdd"); Date y = new Date(); String z = x.format(y);
						Random rano = new Random();int rano1 = rano.nextInt(100);
						String emAccount = ("KOTAK"+z+rano1);
					    //step 4 YEHI HAI AAPKA ASLI CODE
						
						String query1 = " select * from userinfo where email = '"+emVERIFIED1+"' ";
						
						ResultSet rs1 = st1.executeQuery(query1);
						while(rs1.next())
						{
							String emNAME1 = rs1.getString("NAME");
							String emMOBILE1 = rs1.getString("MOBILE");
							String emADDRESS1 = rs1.getString("ADDRESS");
							
						    String query2 = "insert into kotakbank values('"+emAccount+"','"+emNAME1+"','"+emVERIFIED1+"','"+emMOBILE1+"','"+emADDRESS1+"','"+initialAMOUNT1+"','"+emSTATUS+"')";
							
							st2.executeUpdate(query2);
						
							JOptionPane.showMessageDialog(this, "YOUR ACCOUNT IS SUCCESFULLY CREATED \n Kindly Read Next Message Carefully ");
							JOptionPane.showMessageDialog(this, "WELCOME TO "+emBANK1+" ! \n KINDLY NOTE ' "+emAccount+" ' THIS ACCOUNT NUMBER \n\n THANKYOU FOR CHOOSING");
							
						}
						
						//step 5 closing the connection
						co.close();
						JOptionPane.showMessageDialog(this, "NOW YOU ARE REDIRECTING ON BANK MENU !!!");
					    loginRedirect runx1 = new loginRedirect();
						runx1.loginRedirectUI();
						
						super.dispose();
						
					}
					else
					{
						JOptionPane.showMessageDialog(this, "YOU CANNOT ENTER MONEY LESS THEN BANK MINIMUM AMOUNT \nPLEASE CHECK KOTAK MAHINDRA BANK CONDITIONS");
						working++;
					}
				}
				
				
			
			}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			
		}
		
		
		
		
	}
	

}

