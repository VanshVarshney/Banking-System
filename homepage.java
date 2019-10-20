import java.awt.BorderLayout;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class homepage extends JFrame
implements ActionListener
{
	JTextField tf1;
	JLabel l1;
	JButton b1,b2,b3;
	JTextArea ta1;
	
		public void homeUI()
		{
			super.setBounds(300, 50, 700, 600);
			super.setTitle("HOMEPAGE");
			super.setResizable(false);
		
			setLayout(new BorderLayout());
			setContentPane(new JLabel(new ImageIcon("E:\\eclipse-workspace\\BANKING\\wallpaper\\placed\\home1.jpg")));
			setLayout(new FlowLayout());
			
			
			b1=new JButton("SIGN UP");
			b1.setBounds(200, 100, 290, 100);
			super.add(b1);
			ImageIcon i1 = new ImageIcon("E:\\eclipse-workspace\\BANKING\\wallpaper\\placed\\signup2.jpg");
			b1.setIcon(i1);
			b1.addActionListener(this);
		
			
			
			b2=new JButton("LOGIN");
			b2.setBounds(200, 300, 290, 100);
			super.add(b2);
			ImageIcon i2 = new ImageIcon("E:\\eclipse-workspace\\BANKING\\wallpaper\\placed\\login2.jpg");
			b2.setIcon(i2);
			b2.addActionListener(this);
			
			
			b3=new JButton("ADMIN");
			b3.setBounds(270, 450, 150, 50);
			super.add(b3);
			ImageIcon i3 = new ImageIcon("E:\\eclipse-workspace\\BANKING\\wallpaper\\badmin3.jpg");
		    b3.setIcon(i3);
			b3.addActionListener(this);
			
			
			// 3rd last
					super.setLayout(null);
					
			// 2nd last 
					super.setVisible(true);
					
		    // last 
					super.setDefaultCloseOperation
					(JFrame.EXIT_ON_CLOSE);
			
			
			
		}
	
		public static void main(String[] args) throws Exception 
		{
			homepage run=new homepage();
			run.homeUI();
			
		}
		        // lets override the AP method of 
				// action-listener interface
				public void actionPerformed(ActionEvent ae)
				{
					if(ae.getSource()==b1)
					{
						signup s=new signup();
						s.signupUI();
						super.dispose();
						
					}
					
					else if(ae.getSource()==b2)
					{
						login l = new login();
						l.loginUI();
						super.dispose();
						
					}
					else if(ae.getSource()==b3)
					{
						admin a = new admin();
						a.adminUI();
						super.dispose();
					}
				}
				
}
		
		
