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
public class admin2 extends JFrame
implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7;
	
	public void adminUI2()
	{
		
		super.setBounds(350, 75, 600, 600);
		super.setTitle("ADMIN DASHBOARD");
		super.setResizable(false);
		
		b1 = new JButton("GET DETAIL OF ALL USERS");
		b1.setBounds(180, 80, 250, 40);
		super.add(b1);
		b1.setBackground(Color.green);
		b1.setForeground(Color.black);
		b1.addActionListener(this);
		
		
		b2 = new JButton("GET DETAIL OF AXIS BANK USERS");
		b2.setBounds(180, 150, 250, 40);
		super.add(b2);
		b2.setBackground(Color.green);
		b2.setForeground(Color.black);
		b2.addActionListener(this);
		
		
		b3 = new JButton("GET DETAIL OF HDFC BANK USERS");
		b3.setBounds(180, 220, 250, 40);
		super.add(b3);
		b3.setBackground(Color.green);
		b3.setForeground(Color.black);
		b3.addActionListener(this);
		
		b4 = new JButton("GET DETAIL OF SBI BANK USERS");
		b4.setBounds(180, 290, 250, 40);
		super.add(b4);
		b4.setBackground(Color.green);
		b4.setForeground(Color.black);
		b4.addActionListener(this);
		
		b5 = new JButton("GET DETAIL OF PNB BANK USERS");
		b5.setBounds(180, 360, 250, 40);
		super.add(b5);
		b5.setBackground(Color.green);
		b5.setForeground(Color.black);
		b5.addActionListener(this);
		
		b6 = new JButton("GET DETAIL OF KOTAKBANK USERS");
		b6.setBounds(180, 430, 250, 40);
		super.add(b6);
		b6.setBackground(Color.green);
		b6.setForeground(Color.black);
		b6.addActionListener(this);
		
		        // 3rd last
				super.setLayout(null);
				// 2nd last
				super.setVisible(true);
				//last st
				super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		
			
		if(ae.getSource()==b1)
		{
			admin_b1 run94 = new admin_b1();
			run94.admin_b1_UI();
			super.dispose();
		}
		else if(ae.getSource()==b2)
		{
			
		}
		else if(ae.getSource()==b3)
		{
			
		}
		else if(ae.getSource()==b4)
		{
			
		}
		else if(ae.getSource()==b5)
		{
			
		}
		else if(ae.getSource()==b6)
		{
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		admin2 run92 = new admin2();
		run92.adminUI2();
		
	}

}
