import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class forgotAccountNo extends JFrame
implements ActionListener
{
	
	JTextField tf1,tf2,tf3;
	JLabel l1,l2,l3,l4;
	JButton b1;
	JComboBox cb1;
	
	public void forgotUI()
	{
		
		
		super.setBounds(400, 80, 500, 500);
		super.setTitle("FORGOT ACCOUNT NUMBER");
		super.setResizable(false);
		
		// labels
		Font f2=new Font("",Font.BOLD,15);
		
		l1 = new JLabel("BANK : ");
		l1.setBounds(30, 40, 130, 40);
		super.add(l1);
		l1.setFont(f2);
		
		l2 = new JLabel("EMAIL : ");
		l2.setBounds(30, 120, 130, 40);
		super.add(l2);
		l2.setFont(f2);
		
		l3 = new JLabel("NAME : ");
		l3.setBounds(30, 200, 130, 40);
		super.add(l3);
		l3.setFont(f2);
		
		l4 = new JLabel("***YOUR ACCOUNT NO***");
		l4.setBounds(150, 300, 200, 40);
		super.add(l4);
		l4.setFont(f2);
		
		
		
		
	        //  combo
			String[] list1 = {"AXISBANK","HDFCBANK","SBIBANK","PNBBANK"
					,"KOTAKBANK"};
			cb1=new JComboBox(list1);
			cb1.setBounds(180, 40, 200, 40);
			super.add(cb1);
			//cb1.setBackground(Color.black);
			//cb1.setForeground(Color.white);
			cb1.setEditable(false);
			
		
		
		
		tf1 = new JTextField();
		tf1.setBounds(180, 120, 200, 40);
		super.add(tf1);
		
		tf2 = new JTextField();
		tf2.setBounds(180, 200, 200, 40);
		super.add(tf2);
		
		tf3 = new JTextField();
		tf3.setBounds(145, 340, 200, 40);
		super.add(tf3);
		tf3.setEditable(false);
		
		// buttons
		
		b1 = new JButton("FETCH DETAIL");
		b1.setBounds(270, 270, 150, 30);
		super.add(b1);
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
			
			try {
				
				String scBANK = (String)cb1.getSelectedItem();
				
				String scEMAIL = tf1.getText();
				String scNAME = tf2.getText();
				
				System.out.println(scEMAIL);
				System.out.println(scBANK);
				System.out.println(scNAME);
				
				
				//step 1 loading driver file
				Class.forName("com.mysql.jdbc.Driver");
				
				//step 2 get connection
				Connection co= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankdb","root","root");
				
				//step 3 get statement
				Statement st1=co.createStatement();
				Statement st2=co.createStatement();
				
				//step 4 YEHI HAI AAPKA ASLI CODE
				
				ResultSet rs1 = st1.executeQuery("select * from "+scBANK+" ");
				
				while(rs1.next())
				{
					
					String gtEMAIL = rs1.getString("EMAIL");
					

		    		if(scEMAIL.equalsIgnoreCase(gtEMAIL))
					{
		    			
		    			System.out.println(scEMAIL+" worked");
		    			
		    			String gtNAME = rs1.getString("NAME");
		    			
		    			if(scNAME.equalsIgnoreCase(gtNAME))
		    			{
		    				
		    				System.out.println(scNAME+" verified");
		    				
		    			}
						
		    			
		    			
		    			
		    			
		    			
		    			
		    			
		    			
					}
					
		    		else
		    		{
		    			System.out.println("error");
		    			
		    		}
					
					
					
					
					
					
					
					
					
					
					
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	    		//step 5 closing the connection
				co.close();
				
				
				
				
				
				
		
				}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
			
			
			
			
			
			
			
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		forgotAccountNo runx = new forgotAccountNo();
		runx.forgotUI();
	}
	
	

}
