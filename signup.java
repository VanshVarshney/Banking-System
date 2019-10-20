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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Popup;

import java.sql.*;

public class signup extends JFrame
implements ActionListener
{
	String sname,smobile,semail,saddress;
	char[] pass ,cpass;
	
	
	JTextField tf1,tf2,tf3;
	JPasswordField pf1,pf2;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3;
	JTextArea ta1;
	JScrollPane p1;
	JTextArea a1;
	
	public void signupUI()
	{
		//     JFrame Boundary
		super.setBounds(300, 20, 700, 650);
		super.setTitle("SIGNUP PAGE");
		super.setResizable(false);
		
		//     JFrame COLOR
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon
				("E:\\eclipse-workspace\\BANKING\\wallpaper\\placed\\b1final.jpg")));
		setLayout(new FlowLayout());
		
		//     all labels 
		Font font = new Font("",Font.BOLD,25);
		l1 = new JLabel("NAME : ");
		l1.setBounds(100, 20, 150, 50);
		super.add(l1);
		//l1.setFont(font);
		l1.setForeground(Color.green);
		
		l2 = new JLabel("MOBILE NUMBER : ");
		l2.setBounds(100, 100, 200, 50);
		super.add(l2);
		l2.setForeground(Color.green);
		
		l3 = new JLabel("EMAIL ID : ");
		l3.setBounds(100, 180, 300, 50);
		super.add(l3);
		l3.setForeground(Color.green);
		
		l4 = new JLabel("PASSWORD : ");
		l4.setBounds(100, 260, 300, 50);
		super.add(l4);
		l4.setForeground(Color.green);
		
		l5 = new JLabel("CONFIRM PASSWORD : ");
		l5.setBounds(100, 340, 300, 50);
		super.add(l5);
		l5.setForeground(Color.green);
		
		l6 = new JLabel("ADDRESS : ");
		l6.setBounds(100,420 , 300, 50);
		super.add(l6);
		l6.setForeground(Color.green);
		
		l7 = new JLabel("DESIGNED & DEVELOPED BY VANSH VARSHNEY (vsq coders)");
		l7.setBounds(320, 590, 350, 10);
		super.add(l7);
		Font f1=new Font("",Font.ITALIC,10);
		l7.setFont(f1);
		l7.setForeground(Color.green);
		
		
		// text fields
		
		tf1 = new JTextField();
		tf1.setBounds(300, 20, 300, 40);
		super.add(tf1);
		tf1.setBackground(Color.black);
		tf1.setForeground(Color.white);
		
		tf2 = new JTextField();
		tf2.setBounds(300, 100, 300, 40);
		super.add(tf2);
		tf2.setBackground(Color.black);
		tf2.setForeground(Color.white);
		
		tf3 = new JTextField();
		tf3.setBounds(300, 180, 300, 40);
		super.add(tf3);
		tf3.setBackground(Color.black);
		tf3.setForeground(Color.white);
		
		// password field 
		
		pf1 = new JPasswordField();
		pf1.setBounds(300, 260, 300, 40);
		super.add(pf1);
		pf1.setBackground(Color.black);
		pf1.setForeground(Color.cyan);
		
		pf2 = new JPasswordField();
		pf2.setBounds(300, 340, 300, 40);
		super.add(pf2);
		pf2.setBackground(Color.black);
		pf2.setForeground(Color.cyan);
		
		// area field
		
		a1 = new JTextArea();
		p1 = new JScrollPane(a1);
		p1.setBounds(300, 420 , 300, 80);
		super.add(p1);
		a1.setBackground(Color.black);
		a1.setForeground(Color.white);
		
		
		// adding buttons
		
		b1 = new JButton(" REGISTER ! ");
		b1.setBounds(100, 540, 200, 40);
		super.add(b1);
		b1.setBackground(Color.DARK_GRAY);
		b1.setForeground(Color.green);
		b1.addActionListener(this);
		
		
		b2 =  new JButton(" RESET ");
		b2.setBounds(400, 540, 200, 40);
		super.add(b2);
		b2.setBackground(Color.DARK_GRAY);
		b2.setForeground(Color.red);
		b2.addActionListener(this);
		
		b3=new JButton();
		b3.setBounds(15, 20, 70, 20);
		super.add(b3);
	    ImageIcon i3 = new ImageIcon("E:\\eclipse-workspace\\BANKING\\wallpaper\\placed\\back3.jpg");
		b3.setIcon(i3);
		b3.addActionListener(this);
		
		
		
		
		// 3rd last
		super.setLayout(null);
		// 2nd last
		super.setVisible(true);
		//last st
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public void runSignup() throws Exception
	{
		
	}
	
	
	public static void main(String[] args) 
	{
		signup run=new signup();
		run.signupUI();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		// other entries
		sname = tf1.getText();
		smobile = tf2.getText();
		semail = tf3.getText();
		saddress = a1.getText();
		
		// pass
		pass= pf1.getPassword();
		cpass = pf2.getPassword();
		
		
		
		
		if(ae.getSource()==b1)
		{
			
			
			
			
			try
			{
			// checking all entries
			int work=1;
			
			
			//step 1 loading driver file
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 get connection
			Connection co= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankdb","root","root");
			
			//step 3 get statement
			Statement st=co.createStatement();
			Statement st1=co.createStatement();
		//	Statement st2=co.createStatement();
	
			
			
			
			
			
			
			
			if(sname.isEmpty())
			{
				JOptionPane.showMessageDialog(this, "NAME CANNOT BE EMPTY !!!");
				work=0;
			}
			else if(smobile.isEmpty())
			{
				JOptionPane.showMessageDialog(this, "MOBILE CANNOT BE EMPTY !!!");
				work=0;
				
			}
			else if(semail.isEmpty())
			{
				JOptionPane.showMessageDialog(this, "EMAIL CANNOT BE EMPTY !!!");
				work=0;
			}
			else if(new String(pass,0,pass.length).isEmpty())
			{
				JOptionPane.showMessageDialog(this, "PASS CANNOT BE EMPTY !!!");
				work=0;
			}
			else if(new String(cpass,0,cpass.length).isEmpty())
			{
				JOptionPane.showMessageDialog(this, "CONFIRM PASS CANNOT BE EMPTY !!!");
				work=0;
			}
			else if(saddress.isEmpty())
			{
				JOptionPane.showMessageDialog(this, "ADDRESS CANNOT BE EMPTY !!!");
				work=0;
			}
			if(!Arrays.equals(pass,cpass))
			{
				JOptionPane.showMessageDialog
				(this, "Password and confirm password does not match");
				work = 0;
			}
			
			
			

			ResultSet rs1 = st1.executeQuery("select email,mobile from userinfo");
			     
			while(rs1.next())
			{
				String checkEmailAllreadyExist = rs1.getString("EMAIL");
				
				if(semail.equalsIgnoreCase(checkEmailAllreadyExist))
				{
					JOptionPane.showMessageDialog(this, "EMAIL ID ALREADY EXIST !!! \n PLEASE TRY WITH DIFFERENT EMAIL");
					work=0;
					
				}
			
			
			
			}
			/*ResultSet rs2 = st2.executeQuery("select mobile from userinfo");
			
			while(rs2.next())
			{
				String checkMobileAllreadyExist = rs2.getString("MOBILE");
				
				int im1 = Integer.parseInt(checkMobileAllreadyExist);
				int im2 = Integer.parseInt(smobile);
				
				
				if(smobile==checkMobileAllreadyExist)
				{
					JOptionPane.showMessageDialog(this, "Mobile Number ALREADY EXIST !!! \n PLEASE TRY WITH DIFFERENT MOBILE NUMBER");
					work=0;
					
				}
			
			
			
			}
			
			*/
			
			
			if(work==1)
			{
				
		
					
					//step 4 YEHI HAI  ASLI CODE
					
					st.executeUpdate(
							"insert into userinfo values('"+sname+"','"+semail+"','"+smobile+"','"+saddress+"',sha1('"+(new String(pass,0,pass.length))+"'))");
					
			        
				    JOptionPane.showMessageDialog
							(this, "\t\tHello "+sname+" Your Data Has Been Recorded"
									+ "\n\nWe Are Redirecting You To The HOME PAGE");
				    
				    homepage h = new homepage();
					h.homeUI();
					super.dispose();
			}
			
			
					//step 5 closing the connection
					co.close();
						
			
			
			
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		}
		else if(ae.getSource()==b2)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			pf1.setText("");
			pf2.setText("");
			a1.setText("");
		}
		
		else if(ae.getSource()==b3)
		{
			homepage h = new homepage();
			h.homeUI();
			super.dispose();
		}
	}

}
