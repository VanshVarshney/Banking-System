import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class deposit extends JFrame
implements ActionListener
{
	JTextField tf1,tf2,tf3,tf4;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1,b2,b3;
	JComboBox cb1,cb2,cb3;
	
	static String axisdepo,hdfcdepo;
	
	
	
	
	public void depositUI()
	{
		int ax = 0,hd= 0,sb= 0,pn= 0,km= 0;
		String ax1 = null,hd1= null,sb1= null,pn1= null,km1= null;
		
		
		super.setBounds(300, 50, 700, 600);
		super.setTitle("DEPOSIT WINDOW");
		super.setResizable(false);
		
		// line 
		tf1 = new JTextField();
		tf1.setBounds(348, 1, 5, 600);
		super.add(tf1);
		tf1.setBackground(Color.black);
		tf1.setEditable(false);
		
		
		// left side
		l1 = new JLabel("DEPOSIT IN YOUR ACCOUNT ASSOCIATED");
		l1.setBounds(50, 10, 300, 100);
		super.add(l1);
		l2 = new JLabel("WITH YOUR EMAIL ID");
		l2.setBounds(100, 40, 300, 100);
		super.add(l2);
		
		
		l4 = new JLabel("BANK : ");
		l4.setBounds(50, 120, 300, 100);
		super.add(l4);
		
		l5 = new JLabel("ACCOUNT NO : ");
		l5.setBounds(50, 200, 300, 100);
		super.add(l5);
		
		l6 = new JLabel("AMOUNT : ");
		l6.setBounds(50, 280, 300, 100);
		super.add(l6);
		
		//*************************************************************************************************
		String cEMAIL = login.emVERIFIED;
		System.out.println(cEMAIL);
		
		
		try {
			//step 1 loading driver file
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 get connection
			Connection co= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankdb","root","root");
			
			//step 3 get statement
			Statement st1=co.createStatement();
			Statement st2=co.createStatement();
			Statement st3=co.createStatement();
			Statement st4=co.createStatement();
			Statement st5=co.createStatement();
			
			Statement st6=co.createStatement();
			Statement st7=co.createStatement();
			Statement st8=co.createStatement();
			Statement st9=co.createStatement();
			Statement st10=co.createStatement();
			
			
			
			
		//***************************************************************************************************************bank name in combobox
		
		
		
		
		// step 4
		
		String query1 = "select * from axisbank";
		
		ResultSet rs1 = st1.executeQuery(query1);
		
		while(rs1.next())
		{
			String scemail = rs1.getString("email");
			//System.out.println("axis "+scemail);
			
			if(scemail.equalsIgnoreCase(cEMAIL))
			{
				System.out.println("axis "+scemail);
				ax = 1;
			}
		}
		
       String query2 = "select * from hdfcbank";
		
		ResultSet rs2 = st2.executeQuery(query2);
		
		while(rs2.next())
		{
			String scemail = rs2.getString("email");
			//System.out.println("hdfc "+scemail);
			
			if(scemail.equalsIgnoreCase(cEMAIL))
			{
				System.out.println("hdfc "+scemail);
				hd = 1;
			}
		}
		
       String query3 = "select * from sbibank";
		
		ResultSet rs3 = st3.executeQuery(query3);
		
		while(rs3.next())
		{
			String scemail = rs3.getString("email");
			//System.out.println("sbi "+scemail);
			
			if(scemail.equalsIgnoreCase(cEMAIL))
			{
				System.out.println("sbi "+scemail);
				sb = 1;
			}
		}
		
       String query4 = "select * from pnbbank";
		
		ResultSet rs4 = st4.executeQuery(query4);
		
		while(rs4.next())
		{
			String scemail = rs4.getString("email");
			//System.out.println("pnb "+scemail);
			
			if(scemail.equalsIgnoreCase(cEMAIL))
			{
				System.out.println("pnb "+scemail);
				pn= 1;
			}
		}
		
       String query5 = "select * from kotakbank";
		
		ResultSet rs5 = st5.executeQuery(query5);
		
		while(rs5.next())
		{
			String scemail = rs5.getString("email");
			//System.out.println("kotak "+scemail);
			
			if(scemail.equalsIgnoreCase(cEMAIL))
			{
				System.out.println("kotak "+scemail);
				km = 1;
			}
		}
		
		
		
		
		
		if(ax==1)
		{
			ax1 = "AXIS BANK";
			
		}
		if(hd==1)
		{
			hd1 = "HDFC BANK";
		}
		if(sb==1)
		{
			sb1 = "SBI BANK";
		}
		if(pn==1)
		{
			pn1 = "PNB BANK";
		}
		if(km==1)
		{
			km1 = "KOTAK BANK";
		}
		
		//***************************************************************************************************************** account no. in combo box
		
		String query6 = "select ";
		
		
		
		
		
		
                                    //****************************
		//step 5 closing the connection
		co.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		//********************************************************************************************************************************************
		String[] haveAcc =  { ax1,hd1,sb1,pn1,km1};
		
		cb1=new JComboBox(haveAcc);
		cb1.setBounds(150, 150, 170, 30);
		super.add(cb1);
		cb1.setEditable(false);
		//cb1.setBackground(Color.black);
		//cb1.setForeground(Color.white);
		
		
		cb2=new JComboBox();
		cb2.setBounds(150, 235, 170, 30);
		super.add(cb2);
		cb1.setEditable(false);
		
		
		tf2 = new JTextField();
		tf2.setBounds(150, 315, 170, 30);
		super.add(tf2);
		
		
		b1 = new JButton("DEPOSIT");
		b1.setBounds(120, 400, 125, 30);
		super.add(b1);
		b1.addActionListener(this);
		
		
		
		
		
		
		// right side
		l3 = new JLabel("DEPOSIT IN OTHER ACCOUNT ");
		l3.setBounds(400, 10, 300, 100);
		super.add(l3);
		
		
		
		l4 = new JLabel("BANK : ");
		l4.setBounds(370, 120, 300, 100);
		super.add(l4);
		
		l5 = new JLabel("ACCOUNT NO : ");
		l5.setBounds(370, 200, 300, 100);
		super.add(l5);
		
		l6 = new JLabel("AMOUNT : ");
		l6.setBounds(370, 280, 300, 100);
		super.add(l6);
		
		String[] list1 = {"AXIS BANK","HDFC BANK","SBI BANK","PNB BANK"
				,"KOTAK MAHINDRA BANK"};
		
		cb3=new JComboBox(list1);
		cb3.setBounds(480, 150, 170, 30);
		super.add(cb3);
		cb3.setEditable(false);
		
		tf3 = new JTextField();
		tf3.setBounds(480, 235, 170, 30);
		super.add(tf3);
		
		
		tf4 = new JTextField();
		tf4.setBounds(480, 315, 170, 30);
		super.add(tf4);
		
		
		b2 = new JButton("DEPOSIT");
		b2.setBounds(450, 400, 125, 30);
		super.add(b2);
		b2.addActionListener(this);
		
		
		
		
		
		
		//
		
		
		
		
		// 3rd last
		super.setLayout(null);
		
        // 2nd last 
		super.setVisible(true);
		
        // last 
		super.setDefaultCloseOperation
		(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		
		
		
		
		if(ae.getSource()==b1)
		{
			
		}
		
		
		else if(ae.getSource()==b2)
		{
			
		}
		
		
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		deposit runX = new deposit();
		runX.depositUI();
		
		
		
	}

}
