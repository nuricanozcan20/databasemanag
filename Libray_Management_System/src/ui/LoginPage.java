package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(500, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/login_empty.jpeg");
	    ImageIcon user_img=new ImageIcon("Libray_Management_System/src/graphs/user_tusu.png");
	    ImageIcon visitor_img=new ImageIcon("Libray_Management_System/src/graphs/visitor_tusu.png");
	    ImageIcon employee_img=new ImageIcon("Libray_Management_System/src/graphs/employee_tusu.png");
	    
	    Image img=background.getImage();
	    Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
	    background=new ImageIcon(temp);
	    
		 img = user_img.getImage();
		 temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		user_img = new ImageIcon(temp);	
		JButton registeredBtn = new JButton(user_img);
		registeredBtn.setOpaque(false);
		registeredBtn.setContentAreaFilled(false);
		registeredBtn.setBorderPainted(false);
		registeredBtn.setFocusPainted(false);
		registeredBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				RegisteredLogin registered = new RegisteredLogin();
				registered.getFrame().setVisible(true);
			}
		});
		registeredBtn.setBounds(189, 314, 124, 121);
		frame.getContentPane().add(registeredBtn);
		
		img = visitor_img.getImage();
		temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		visitor_img = new ImageIcon(temp);
		JButton visitorBtn = new JButton(visitor_img);
		visitorBtn.setOpaque(false);
		visitorBtn.setContentAreaFilled(false);
		visitorBtn.setBorderPainted(false);
		visitorBtn.setFocusPainted(false);			
		visitorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				VisitorLogin visitor = new VisitorLogin();
				visitor.getFrame().setVisible(true);
			}
		});
		visitorBtn.setBounds(37, 314, 124, 121);
		frame.getContentPane().add(visitorBtn);
		
		img = employee_img.getImage();
		temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		employee_img = new ImageIcon(temp);
		JButton staffBtn = new JButton(employee_img);
		staffBtn.setOpaque(false);
		staffBtn.setContentAreaFilled(false);
		staffBtn.setBorderPainted(false);
		staffBtn.setFocusPainted(false);			
		staffBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StaffLogin staff = new StaffLogin();
				staff.getFrame().setVisible(true);
			}
		});
		staffBtn.setBounds(342, 314, 124, 121);
		frame.getContentPane().add(staffBtn);
		JLabel back=new JLabel(background);
		back.setBounds(0,0,500,600);
		frame.getContentPane().add(back);
	}

	public JFrame getFrame() {
		return frame;
	}
}
