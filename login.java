import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame
implements ActionListener
{
	// all in one static variable for email;
	
	static String emVERIFIED,emNAMEforDASHBOARD;
	
	
	
	JTextField tf1;
	JPasswordField pf1;
	JLabel l1,l2,l3;
	JButton b1,b2;
	
	public void loginUI()
	{
		super.setBounds(450, 150, 400, 350);
		super.setTitle("LOGIN PAGE");
		super.setResizable(false);
            //	     JFrame COLOR
			setLayout(new BorderLayout());
			setContentPane(new JLabel(new ImageIcon
					("E:\\eclipse-workspace\\BANKING\\wallpaper\\placed\\bg3final.jpg")));
			setLayout(new FlowLayout());
			
		
		// label
			Font f2=new Font("",Font.BOLD,15);
			
		l1 = new JLabel("EMAIL  ID : ");
		l1.setBounds(40, 30, 100, 50);
		super.add(l1);
		l1.setForeground(Color.white);
		l1.setFont(f2);
		
		
		l2 = new JLabel("PASSWORD : ");
		l2.setBounds(20, 80, 130, 80);
		super.add(l2);
		l2.setForeground(Color.white);
		l2.setFont(f2);
		
		l3 = new JLabel("DESIGNED & DEVELOPED BY VANSH VARSHNEY (vsq coders)");
		l3.setBounds(28, 290, 350, 10);
		super.add(l3);
		Font f1=new Font("",Font.ITALIC,10);
		l3.setFont(f1);
		l3.setForeground(Color.black);
		
		
		
		// text field
		tf1 =new JTextField();
		tf1.setBounds(140, 35, 200, 35);
		super.add(tf1);
		tf1.setBackground(Color.black);
		tf1.setForeground(Color.orange);
		
		// pass field
		pf1 = new JPasswordField();
		pf1.setBounds(140, 105, 200, 35);
		super.add(pf1);
		pf1.setBackground(Color.black);
		pf1.setForeground(Color.orange);
		
		// button
		b1=new JButton("LOGIN");
		b1.setBounds(120, 200, 150, 40);
		super.add(b1);
		b1.setBackground(Color.black);
		b1.setForeground(Color.green);
		b1.addActionListener(this);
		
		
		b2=new JButton();
		b2.setBounds(40, 260, 70, 20);
		super.add(b2);
	    ImageIcon i3 = new ImageIcon("E:\\eclipse-workspace\\BANKING\\wallpaper\\placed\\back3.jpg");
		b2.setIcon(i3);
		b2.addActionListener(this);
		
		
		
		
		
		
		
		        // 3rd last
				super.setLayout(null);
				// 2nd last
				super.setVisible(true);
				//last st
				super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{

		String semaillogin= tf1.getText();
		char[] spasslogin = pf1.getPassword();
		String spasslogin2 = String.copyValueOf(spasslogin);
		//System.out.println(spasslogin2);
		
		if(ae.getSource()==b1)
		{
		      
			            // user authentication
						try
						{
							
							
							int work=1;
							
							if(semaillogin.isEmpty())
							{
								JOptionPane.showMessageDialog(this, "EMAIL CANNOT BE EMPTY !!!");
								work=0;
							}
							else if(spasslogin2.isEmpty())
							{
								JOptionPane.showMessageDialog(this, "PASSWORD CANNOT BE EMPTY !!!");
								work=0;
								
							}
							
							
							
							
							
							
							
							
							
							
							if(work==1)
							{
								
							
							
							
						 //step 1 loading driver file
						Class.forName("com.mysql.jdbc.Driver");
						
						//step 2 get connection
						Connection co= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankdb","root","root");
						
						//step 3 get statement
						Statement st1=co.createStatement();
						Statement st2=co.createStatement();
						
						
						//step 4 YEHI HAI  ASLI CODE
						
						ResultSet rs1 = st1.executeQuery("select * from userinfo");
						
						
						int r=0;
						int r99=0;
						int r98=0;
						
						
					    while(rs1.next())
						{
							String sEmail = rs1.getString("EMAIL");
							
							if(semaillogin.equalsIgnoreCase(sEmail))
							{
								
								boolean z1= semaillogin.equalsIgnoreCase(sEmail);
								if(z1==true)
								{
										
										//System.out.println("hello found");
										
										String QueryPass = "Select name,email,password from userinfo where password = sha1('"+spasslogin2+"')";
										
										ResultSet rs2 = st2.executeQuery(QueryPass);
										
										
										while(rs2.next())
										{
											
											String sEmailConfirmLogin = rs2.getString("EMAIL");
											
										        //	System.out.println(sEmailConfirmLogin);
											
											
											if(sEmailConfirmLogin.equalsIgnoreCase(semaillogin))
											{
												
												// System.out.println("email & pass verified hello found it");
												
												String sName = rs2.getString("NAME");
												JOptionPane.showMessageDialog(this,"\t\tLOGIN SUCCESFULL ! \nWELCOME "+sName+"");
												
										     	loginRedirect runx= new loginRedirect();
												runx.loginRedirectUI();
												super.dispose();
												
												r99++;
												
												emVERIFIED = sEmailConfirmLogin;
												emNAMEforDASHBOARD = sName;
												
											}
											
											
											
											r++;
										}
										
										while(r==0)
										{
											JOptionPane.showMessageDialog(this,"SORRY! \n ***PASSWORD*** IS WRONG \nPLEASE CHECK CREDENTIALS!");
											JOptionPane.showMessageDialog(this,"WE ARE REDIRECTING U TO HOMEPAGE");
											homepage h = new homepage();
											h.homeUI();
											super.dispose();
											
											break;
											
										}
								
									
										
									}
								else if(z1==false)
								{
									JOptionPane.showMessageDialog(this,"SORRY! baba email if not found in data \nEMAIL or PASSWORD IS WRONG \nPLEASE CHECK CREDENTIALS!");
									JOptionPane.showMessageDialog(this,"WE ARE REDIRECTING U TO HOMEPAGE");
									homepage h = new homepage();
									h.homeUI();
									super.dispose();

								}
								r99++;
							}
							
							
				
							
						
							
						}
					    
					    

						// is email is incorrect then here
						if(r99==0)
						{
							JOptionPane.showMessageDialog(this,"SORRY!  \n***EMAIL*** NOT FOUND IN OUR DATABASE\nPLEASE CHECK CREDENTIALS!");
						
						    JOptionPane.showMessageDialog(this,"WE ARE REDIRECTING U TO HOMEPAGE");
						    homepage h = new homepage();
						    h.homeUI();
						    super.dispose();
					
							
						}
							
						
						
						
						
						
						//step 5 closing the connection
						co.close();
					}
						}
						catch(Exception ex)
						{
							ex.printStackTrace();
						}
						
			
		}
		else if(ae.getSource()==b2)
		{
			homepage run92= new homepage();
			run92.homeUI();
			super.dispose();
		}
		
		
	}
	
	
	

	public static void main(String[] args) 
	{
		login run = new login();
		run.loginUI();
		
		
		
	}
	

}
