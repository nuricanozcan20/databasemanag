package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import domain.RegisteredUser;
import domain.Visitor;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;

public class VisitorLogin {

	private JFrame frame;
	private JTextField idTxt;


	/**
	 * Create the application.
	 */
	public VisitorLogin() {
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
		
		
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/visitor_login_page.jpeg");
	    Image img=background.getImage();
	    Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
	    background=new ImageIcon(temp);
		
		idTxt = new JTextField();
		idTxt.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		idTxt.setBounds(178, 323, 143, 18);
		frame.getContentPane().add(idTxt);
		idTxt.setColumns(10);

		
		JLabel idLbl = new JLabel("LIB ID");
		idLbl.setForeground(new Color(32, 75, 121));
		idLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		idLbl.setBounds(179, 295, 61, 16);
		frame.getContentPane().add(idLbl);
		
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
				try {
					if(Visitor.authenticateVisitor(libid)) {
						Visitor user = Visitor.getVisitor(libid);
						VisitorMainPage main = new VisitorMainPage(user);
						frame.dispose();
						main.getFrame().setVisible(true);
					}
					else {
                        JOptionPane.showMessageDialog(frame, "Uncorrect libid");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		loginBtn.setBounds(246, 400, 117, 29);
		frame.getContentPane().add(loginBtn);
		
	    ImageIcon register_btn=new ImageIcon("Libray_Management_System/src/graphs/get_id_btn.png");
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
				VisitorRegisterPage register = new VisitorRegisterPage();
				register.getFrame().setVisible(true);
			}
		});
		registerBtn.setBounds(181, 490, 117, 29);
		frame.getContentPane().add(registerBtn);
		
		
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
}
