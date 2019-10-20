import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class openAccount extends JFrame
implements ActionListener
{
	
	
	// UI1
	JLabel l1,l2,l3;
	JButton b1;
	JComboBox cb1;
	
	static String emBANK;
	
	
	
	public void  openAccountUI1()
	{
		super.setBounds(450, 150, 400, 350);
		super.setTitle("OPEN-ACCOUNT");
		super.setResizable(false);
		 //	     JFrame COLOR
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon
				("E:\\eclipse-workspace\\BANKING\\wallpaper\\bb2.jpg")));
		setLayout(new FlowLayout());
		
		
		
		Font f1=new Font("",Font.TRUETYPE_FONT,20);
		l1 = new JLabel("IN WHICH BANK YOU WANT ");
		l1.setBounds(50, -10, 300, 100);
		super.add(l1);
		l1.setFont(f1);
		l1.setForeground(Color.white);
		
		l2 = new JLabel("TO OPEN A BANK ACCOUNT ? ");
		l2.setBounds(40, 20, 300, 100);
		super.add(l2);
		l2.setFont(f1);
		l2.setForeground(Color.white);
		
		
		
		//  combo
		String[] list1 = {"AXIS BANK","HDFC BANK","SBI BANK","PNB BANK"
				,"KOTAK MAHINDRA BANK"};
		cb1=new JComboBox(list1);
		cb1.setBounds(80, 150, 200, 50);
		super.add(cb1);
		cb1.setBackground(Color.black);
		cb1.setForeground(Color.white);
		cb1.setEditable(false);
		
		
		
		// button
		b1=new JButton("PROCEED");
		b1.setBounds(250, 220, 80, 30);
		super.add(b1);
		b1.addActionListener(this);
		Font f2 = new Font("",Font.ITALIC,8);
		b1.setFont(f2);
		b1.setBackground(Color.green);
		b1.setForeground(Color.black);
		
		
		
		
		
		// 3rd last
		super.setLayout(null);
		// 2nd last
		super.setVisible(true);
		//last st
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) 
	{
		openAccount run= new openAccount();
		run.openAccountUI1();
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		      
					
			if(ae.getSource()==b1) 
			{
				String item = (String)cb1.getSelectedItem();
				//System.out.println(item);
				//System.out.println(login.emVERIFIED);
				emBANK = item;
				
				
					
				openAccount2 run98= new openAccount2();
				run98.openAccountUI2();
				super.dispose();
				
			} 
						
         
				
	}
				
		
	}


