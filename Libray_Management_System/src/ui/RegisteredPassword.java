package ui;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import domain.User;
import system.UserFactory;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class RegisteredPassword {

	private JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordFieldCheck;
	private String password;
	private UserFactory factory;
	private JLabel lblReenterPassword;

	public RegisteredPassword(UserFactory factory) {
		initialize();
		this.factory = factory;
	}


	private void initialize() {
		frame = new JFrame();
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/password_screen.jpeg");
	    Image img=background.getImage();
	    Image temp=img.getScaledInstance(320,220,Image.SCALE_SMOOTH);
	    background=new ImageIcon(temp);
		frame.setBounds(500, 100, 320, 220);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Helvetica", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(60, 33, 212, 16);
		frame.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Helvetica", Font.PLAIN, 12));
		passwordField.setBounds(60, 48, 212, 26);
		frame.getContentPane().add(passwordField);
		
		passwordFieldCheck = new JPasswordField();
		passwordFieldCheck.setFont(new Font("Helvetica", Font.PLAIN, 12));
		passwordFieldCheck.setBounds(60, 101, 212, 26);
		frame.getContentPane().add(passwordFieldCheck);
		
	    ImageIcon register_btn=new ImageIcon("Libray_Management_System/src/graphs/register_btn.png");
		img = register_btn.getImage();
		temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		register_btn = new ImageIcon(temp);	  
		
		JButton okBtn = new JButton(register_btn);
		okBtn.setOpaque(false);
		okBtn.setContentAreaFilled(false);
		okBtn.setBorderPainted(false);
		okBtn.setFocusPainted(false);
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(passwordField.getText().equals(passwordFieldCheck.getText())) {
					password= new String(passwordField.getPassword());
					factory.setPassword(password);
					User user=factory.createRegisteredUser();
					frame.dispose();
					SuccessRegister success = new SuccessRegister(user.getLibraryID());
					success.getFrame().setVisible(true);

				}
				else {
					frame.dispose();
					UnmatchedPassword warning = new UnmatchedPassword(factory);
					warning.getFrame().setVisible(true);
				}
			}
		});
		okBtn.setBounds(100, 139, 117, 29);
		frame.getContentPane().add(okBtn);
		
		lblReenterPassword = new JLabel("Re-enter Password");
		lblReenterPassword.setFont(new Font("Helvetica", Font.PLAIN, 12));
		lblReenterPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblReenterPassword.setBounds(60, 87, 212, 16);
		frame.getContentPane().add(lblReenterPassword);
		
		JLabel back=new JLabel(background);
		back.setBounds(0,0,320,220);
		frame.getContentPane().add(back);
		
	}


	public JFrame getFrame() {
		return frame;
	}
	
	public String getPassword() {
		return password;
	}
}
