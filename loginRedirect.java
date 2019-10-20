import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class loginRedirect extends JFrame
implements ActionListener
{
	static String zNAME = login.emNAMEforDASHBOARD;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	JLabel l1,l2,l3,l4,l5;
	
	public void loginRedirectUI()
	{
		super.setBounds(350, 20, 600, 700);
		super.setTitle("Login-Redirect");
		super.setResizable(false);
		
		// JFrame color
			setLayout(new BorderLayout());
			setContentPane(new JLabel(new ImageIcon("E:\\eclipse-workspace\\BANKING\\wallpaper\\placed\\b8final1.jpg")));
			setLayout(new FlowLayout());
			
			
			// labels
			
			
			l1 = new JLabel("WELCOME : "+zNAME);
			l1.setBounds(30, 10, 200, 50);
			super.add(l1);
			l1.setForeground(Color.yellow);
			
			
			SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); Date y = new Date(); String z = x.format(y);
			l2 = new JLabel("LOGIN DATE & TIME : "+z);
			l2.setBounds(300, 10, 300, 50);
			super.add(l2);
			l2.setForeground(Color.yellow);
			
			
			
			
			
			
			
			
			
			
			// buttons
			
			b9 = new JButton("ACCOUNT INFO");
			b9.setBounds(30, 50, 100, 20);
			super.add(b9);
			b9.setBackground(Color.black);
			b9.setForeground(Color.cyan);
			b9.addActionListener(this);
			Font fb9 = new Font("",Font.TRUETYPE_FONT,8);
			b9.setFont(fb9);
			
			
			b1 = new JButton("OPEN  NEW  ACCOUNT");
			b1.setBounds(200, 80, 210, 40);
			super.add(b1);
			b1.setBackground(Color.green);
			b1.setForeground(Color.black);
			b1.addActionListener(this);
			
			b8 = new JButton("DEPOSIT");
			b8.setBounds(200, 150, 210, 40);
			super.add(b8);
			b8.setBackground(Color.green);
			b8.setForeground(Color.black);
			b8.addActionListener(this);
			
			b2 = new JButton("WITHDRAWL");
			b2.setBounds(200, 220, 210, 40);
			super.add(b2);
			b2.setBackground(Color.red);
			b2.setForeground(Color.black);
			b2.addActionListener(this);
			
			b3 = new JButton("CHECK BALANCE");
			b3.setBounds(200, 290, 210, 40);
			super.add(b3);
			b3.setBackground(Color.red);
			b3.setForeground(Color.black);
			b3.addActionListener(this);
			
			b4 = new JButton("STATEMENT");
			b4.setBounds(200, 360, 210, 40);
			super.add(b4);
			b4.setBackground(Color.red);
			b4.setForeground(Color.black);
			b4.addActionListener(this);
			
			b5 = new JButton("MONEY TRANSFER");
			b5.setBounds(200, 430, 210, 40);
			super.add(b5);
			b5.setBackground(Color.red);
			b5.setForeground(Color.black);
			b5.addActionListener(this);
			
			b6 = new JButton("ACCOUNT DEACTIVATE");
			b6.setBounds(200, 500, 210, 40);
			super.add(b6);
			b6.setBackground(Color.red);
			b6.setForeground(Color.black);
			b6.addActionListener(this);
			
			b7 = new JButton("ACCOUNT REACTIVATE");
			b7.setBounds(200, 570, 210, 40);
			super.add(b7);
			b7.setBackground(Color.red);
			b7.setForeground(Color.black);
			b7.addActionListener(this);
			
			b10 = new JButton("LOGOUT");
			b10.setBounds(50, 600, 100, 30);
			super.add(b10);
			b10.setBackground(Color.red);
			b10.setForeground(Color.black);
			b10.addActionListener(this);
			
			
			
			
		
		
		
		// 3rd last
		super.setLayout(null);
		// 2nd last
		super.setVisible(true);
		//last st
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		
		loginRedirect run = new loginRedirect();
		run.loginRedirectUI();
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		
		if(ae.getSource()==b1)
		{
			openAccount run1 = new openAccount();
			run1.openAccountUI1();
			super.dispose();
		}
		
		else if(ae.getSource()==b8)
		{
			deposit run2 = new deposit();
			run2.depositUI();
			super.dispose();
			
		}
		
		
		else if(ae.getSource()==b2)
		{
			deposit run3 = new deposit();
			//run3
			
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
		else if(ae.getSource()==b7)
		{
			
		}
		else if(ae.getSource()==b10)
		{
			JOptionPane.showMessageDialog(this, "THANKYOU MR./MRs. "+zNAME+" FOR BANKING WITH US" );
			super.dispose();
		}
		
	}

}
