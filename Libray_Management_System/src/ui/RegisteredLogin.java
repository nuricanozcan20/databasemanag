package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

import domain.RegisteredUser;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class RegisteredLogin {

	private JFrame frame;
	private JTextField idTxt;
	private JPasswordField passTxt;

	/**
	 * Create the application.
	 */
	public RegisteredLogin() {
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
		
		
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/user_login_ekrani.jpeg");
	    Image img=background.getImage();
	    Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
	    background=new ImageIcon(temp);
		
		JLabel idLbl = new JLabel("LIB ID ");
		idLbl.setForeground(new Color(32, 75, 121));
		idLbl.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 13));
		idLbl.setBounds(144, 302, 66, 16);
		frame.getContentPane().add(idLbl);
		
		JLabel passLbl = new JLabel("PASSWORD");
		passLbl.setForeground(new Color(32, 75, 121));
		passLbl.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 13));
		passLbl.setBounds(144, 357, 82, 16);
		frame.getContentPane().add(passLbl);
		
	

		
		idTxt = new JTextField();
		idTxt.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		idTxt.setBounds(144, 319, 219, 26);
		frame.getContentPane().add(idTxt);
		idTxt.setColumns(10);
		
	    ImageIcon register_btn=new ImageIcon("Libray_Management_System/src/graphs/register_btn.png");
		img = register_btn.getImage();
		temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		register_btn = new ImageIcon(temp);	    
		JButton registerBtn = new JButton(register_btn);
		registerBtn.setOpaque(false);
		registerBtn.setContentAreaFilled(false);
		registerBtn.setBorderPainted(false);
		registerBtn.setFocusPainted(false);		
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				RegisteredRegister register = new RegisteredRegister();
				register.getFrame().setVisible(true);
			}
		});
		registerBtn.setBounds(181, 490, 117, 29);
		frame.getContentPane().add(registerBtn);
		
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
				String libid = idTxt.getText();
				String password = passTxt.getText();
				password = new String(password);
				try {
					if(RegisteredUser.authenticateUser(libid, password)) {
						RegisteredUser user = RegisteredUser.getUser(libid);
						UserMainPage main = new UserMainPage(user);
						frame.dispose();
						main.getFrame().setVisible(true);
					}
					else {
                        JOptionPane.showMessageDialog(frame, "Uncorrect username/password");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		loginBtn.setBounds(246, 414, 117, 29);
		frame.getContentPane().add(loginBtn);
		
		
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

	public JTextField getPassTxt() {
		return passTxt;
	}
}
