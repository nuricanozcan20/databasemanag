package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Window.Type;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class StaffLogin {

	private JFrame frame;
	private JTextField idTxt;
	private JPasswordField passTxt;



	/**
	 * Create the application.
	 */
	public StaffLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/employee_login_page.jpeg");
	    Image img=background.getImage();
	    Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
	    background=new ImageIcon(temp);
	    
	    ImageIcon main_btn=new ImageIcon("Libray_Management_System/src/graphs/mainpage_btn.png");
		img = main_btn.getImage();
		temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		main_btn = new ImageIcon(temp);	
		
		JButton mainBtn = new JButton(main_btn);
		mainBtn.setOpaque(false);
		mainBtn.setContentAreaFilled(false);
		mainBtn.setBorderPainted(false);
		mainBtn.setFocusPainted(false);
		mainBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				LoginPage login = new LoginPage();
				login.getFrame().setVisible(true);
			}
		});
		mainBtn.setBounds(21, 21, 117, 29);
		frame.getContentPane().add(mainBtn);
		
		JLabel idLbl = new JLabel("ID ");
		idLbl.setForeground(new Color(32, 75, 121));
		idLbl.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 13));
		idLbl.setBounds(144, 302, 66, 16);
		frame.getContentPane().add(idLbl);
		
		idTxt = new JTextField();
		idTxt.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		idTxt.setBounds(144, 319, 219, 26);
		frame.getContentPane().add(idTxt);
		idTxt.setColumns(10);
		
		JLabel passLbl = new JLabel("PASSWORD");
		passLbl.setForeground(new Color(32, 75, 121));
		passLbl.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 13));
		passLbl.setBounds(144, 357, 82, 16);
		frame.getContentPane().add(passLbl);
		
		passTxt = new JPasswordField();
		passTxt.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		passTxt.setBounds(144, 376, 219, 26);
		frame.getContentPane().add(passTxt);
		
		
	    ImageIcon login_btn=new ImageIcon("Libray_Management_System/src/graphs/login_tusu.png");
		img = login_btn.getImage();
		temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		login_btn = new ImageIcon(temp);
		JButton loginBtn = new JButton(login_btn);
		loginBtn.setOpaque(false);
		loginBtn.setContentAreaFilled(false);
		loginBtn.setBorderPainted(false);
		loginBtn.setFocusPainted(false);		
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeMainPage main = new EmployeeMainPage(null);
				frame.dispose();
				main.getFrame().setVisible(true);
			}
		});
		loginBtn.setBounds(246, 414, 117, 29);
		frame.getContentPane().add(loginBtn);
		
		
		JLabel back=new JLabel(background);
		back.setBounds(0,0,500,600);
		frame.getContentPane().add(back);
	    
	    
		
		

	}

	public JFrame getFrame() {
		return frame;
	}

	public JTextField getIdTxt() {
		return idTxt;
	}

	public JPasswordField getPassTxt() {
		return passTxt;
	}
	
}
