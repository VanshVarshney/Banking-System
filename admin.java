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

public class admin extends JFrame
implements ActionListener
{
	
	
	JTextField tf1;
	JPasswordField pf1;
	JLabel l1,l2,l3;
	JButton b1;
	
	public void adminUI()
	{
		
		super.setBounds(400, 100, 500, 500);
		super.setTitle("ADMIN LOGIN");
		super.setResizable(false);
            //	     JFrame COLOR
			setLayout(new BorderLayout());
			setContentPane(new JLabel(new ImageIcon
					("E:\\eclipse-workspace\\BANKING\\wallpaper\\placed\\bg4final.jpg")));
			setLayout(new FlowLayout());
		
		//..
			// label
						//Font f2=new Font("",Font.BOLD,15);
						
					l1 = new JLabel("ADMIN EMAIL: ");
					l1.setBounds(40, 40, 300, 50);
					super.add(l1);
					l1.setForeground(Color.white);
					//l1.setFont(f2);
					
					
					l2 = new JLabel("ADMIN PASSWORD: ");
					l2.setBounds(40, 120, 300, 50);
					super.add(l2);
					l2.setForeground(Color.white);
					//l2.setFont(f2);
					
					
					tf1 =new JTextField();
					tf1.setBounds(250, 50, 200, 35);
					super.add(tf1);
					tf1.setBackground(Color.black);
					tf1.setForeground(Color.orange);
					
					// pass field
					pf1 = new JPasswordField();
					pf1.setBounds(250, 130, 200, 35);
					super.add(pf1);
					pf1.setBackground(Color.black);
					pf1.setForeground(Color.orange);
					
					// button
					b1=new JButton("LOGIN");
					b1.setBounds(170, 270, 150, 40);
					super.add(b1);
					b1.setBackground(Color.black);
					b1.setForeground(Color.green);
					b1.addActionListener(this);
		
		
		
		
		
		
		
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
			String adNAME = tf1.getText();
			char[] adpass1 = pf1.getPassword();
			String adPASS = String.copyValueOf(adpass1);
			
			
			// check authentication
			 String adCNAME = "admin@admin.com";
			 String adCPASS = "admin";
			
			
			if(adNAME.equalsIgnoreCase(adCNAME) && adCPASS.equalsIgnoreCase(adCPASS))
			{
				
				admin2 run93 = new admin2();
				run93.adminUI2();
				super.dispose();
				
			}
			else
			{
				JOptionPane.showMessageDialog(this, "ADMIN EMAIL OR PASS IS INCORRECT !");
			}
			
			
			
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		admin run91 = new admin();
		run91.adminUI();
		
	}
	
	

}
