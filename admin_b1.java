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

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class admin_b1 extends JFrame
implements ActionListener

{
	
	JTextField tf1;
	JButton b1,b2,b3;
	JLabel l1,l2;
	JScrollPane pane;
	JTextArea area;
	
	public void admin_b1_UI()
	{
		
		super.setBounds(100, 50, 1000, 600);
		super.setTitle("ALL USER INFO");
		super.setResizable(false);
		
		
		
		
		b1 = new JButton("ALL USERS");
		b1.setBounds(50, 80, 250, 40);
		super.add(b1);
		b1.setBackground(Color.green);
		b1.setForeground(Color.black);
		b1.addActionListener(this);
		
		
		b2 = new JButton("CRIETRIA");
		b2.setBounds(50, 150, 250, 40);
		super.add(b2);
		b2.setBackground(Color.green);
		b2.setForeground(Color.black);
		b2.addActionListener(this);
		
		b3 = new JButton("MODIFY DETAILS");
		b3.setBounds(50, 220, 250, 40);
		super.add(b3);
		b3.setBackground(Color.green);
		b3.setForeground(Color.black);
		b3.addActionListener(this);
		
		area = new JTextArea();
		pane = new JScrollPane(area);
		pane.setBounds(350, 50, 500, 500);
		super.add(pane);
		area.setEditable(false);
		
		 // 3rd last
		super.setLayout(null);
		// 2nd last
		super.setVisible(true);
		//last st
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		
try {
			
			//step 1 loading driver file
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 get connection
			Connection co= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankdb","root","root");
			
			//step 3 get statement
			Statement st1=co.createStatement();
			//Statement st2=co.createStatement();
			 
		
		if(ae.getSource()==b1)
		{

			ResultSet rs1 = st1.executeQuery("select * from userinfo");
			
			
			String name = null ;String mobile = null ;String email = null;String address = null;
			
			
			while(rs1.next())
			{
				name = rs1.getString("NAME");
				mobile = rs1.getString("MOBILE");
			    email = rs1.getString("email");
				address = rs1.getString("address");
				
		
				
				
				
				//System.out.printf("%-15s %-15s %-15s %-15s %n",name,email,mobile,address);
				
			//	String showA = (name+"     "+email+"    "+mobile+"      "+address);
				
				//JOptionPane.showMessageDialog(this, name);
				 //area.setText(showA);
				
				
					area.setText(name+email+mobile+address);
				
				
					
				
				
				
				
			}
			
			
			
			//step 5 closing
			co.close();
		}}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
System.out.println("******************************************************************************");
String a = "NAME";String b="EMAIL";String c="MOBILE";String d="ADDRESS";
System.out.printf("%-15s %-15s %-15s %-15s %n",a,b,c,d);
System.out.println("-----          -------       ----------        ---------");

		
	}
	
	
	public static void main(String[] args) 
	{

		admin_b1 runx = new admin_b1();
		runx.admin_b1_UI();
	}
	

}
