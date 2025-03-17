package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import system.UserFactory;

public class VisitorRegisterPage {

	private JFrame frame;
	private JLabel nameLbl;
	private JLabel lblM;
	private JLabel lblSurname;
	private JLabel lblPhoneNum;
	private JTextField firstnameTxt;
	private JTextField lnameTxt;
	private JFormattedTextField minitTxt;
	private JFormattedTextField phoneNumTxt;



	public VisitorRegisterPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/visitor_register_screen.jpeg");
	    Image img=background.getImage();
	    Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
	    background=new ImageIcon(temp);
	    
	    ImageIcon main_btn=new ImageIcon("Libray_Management_System/src/graphs/mainpage_btn.png");
		img = main_btn.getImage();
		temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		main_btn = new ImageIcon(temp);	   
		JButton mainBtn = new JButton(main_btn);
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
		
	    ImageIcon login_btn=new ImageIcon("Libray_Management_System/src/graphs/loginpage_btn.png");
		img = login_btn.getImage();
		temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		login_btn = new ImageIcon(temp);	   
		
		JButton loginBtn = new JButton(login_btn);
		loginBtn.setContentAreaFilled(false);
		loginBtn.setBorderPainted(false);
		loginBtn.setFocusPainted(false);	
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				VisitorLogin login = new VisitorLogin();
				login.getFrame().setVisible(true);
			}
		});
		loginBtn.setBounds(150, 21, 124, 29);
		frame.getContentPane().add(loginBtn);
		
		firstnameTxt = new JTextField();
		firstnameTxt.setFont(new Font("Helvetica", Font.PLAIN, 12));
		firstnameTxt.setHorizontalAlignment(SwingConstants.LEFT);
		firstnameTxt.setBounds(101, 293, 110, 26);
		firstnameTxt.setColumns(10);
		
        firstnameTxt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (firstnameTxt.getText().equals("First Name*")) {
                	firstnameTxt.setText("");
                	firstnameTxt.setForeground(Color.BLACK);
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (firstnameTxt.getText().isEmpty()) {
                	firstnameTxt.setForeground(Color.GRAY);
                	firstnameTxt.setText("First Name*");
                }
            }
        
	});
		frame.getContentPane().add(firstnameTxt);

		
		lnameTxt = new JTextField();
		lnameTxt.setFont(new Font("Helvetica", Font.PLAIN, 12));
		lnameTxt.setHorizontalAlignment(SwingConstants.LEFT);
		lnameTxt.setColumns(10);
		lnameTxt.setBounds(265, 293, 150, 26);
		
		lnameTxt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (lnameTxt.getText().equals("Surname*")) {
                	lnameTxt.setText("");
                	lnameTxt.setForeground(Color.BLACK);
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (lnameTxt.getText().isEmpty()) {
                	lnameTxt.setForeground(Color.GRAY);
                	lnameTxt.setText("Surname*");
                }
            }
        
	});
		frame.getContentPane().add(lnameTxt);

		
		
		minitTxt = new JFormattedTextField();
		minitTxt.setFont(new Font("Helvetica", Font.PLAIN, 12));
		minitTxt.setHorizontalAlignment(SwingConstants.CENTER);
		minitTxt.setColumns(10);
		minitTxt.setBounds(215, 293, 44, 26);
		
		minitTxt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (minitTxt.getText().equals("M.")) {
                	minitTxt.setText("");
                	minitTxt.setForeground(Color.BLACK);
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (minitTxt.getText().isEmpty()) {
                	minitTxt.setForeground(Color.GRAY);
                	minitTxt.setText("M.");
                }
            }
        
	});
		frame.getContentPane().add(minitTxt);
		
		phoneNumTxt = new JFormattedTextField();
		phoneNumTxt.setFont(new Font("Helvetica", Font.PLAIN, 12));
		phoneNumTxt.setBounds(101, 339, 152, 26);
		
		phoneNumTxt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (phoneNumTxt.getText().equals("Phone Num*")) {
                	phoneNumTxt.setText("");
                	phoneNumTxt.setForeground(Color.BLACK);
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (phoneNumTxt.getText().isEmpty()) {
                	phoneNumTxt.setForeground(Color.GRAY);
                	phoneNumTxt.setText("Phone Num*");
                }
            }
        
	});
		
		frame.getContentPane().add(phoneNumTxt);
		
		nameLbl = new JLabel("Name*");
		nameLbl.setForeground(new Color(32, 75, 121));
		nameLbl.setFont(new Font("Helvetica", Font.PLAIN, 11));
		nameLbl.setBounds(101, 280, 61, 16);
		frame.getContentPane().add(nameLbl);
		
		lblM = new JLabel("M.");
		lblM.setForeground(new Color(32, 75, 121));
		lblM.setFont(new Font("Helvetica", Font.PLAIN, 11));
		lblM.setBounds(215, 280, 44, 16);
		frame.getContentPane().add(lblM);
		
		lblSurname = new JLabel("Surname*");
		lblSurname.setForeground(new Color(32, 75, 121));
		lblSurname.setFont(new Font("Helvetica", Font.PLAIN, 11));
		lblSurname.setBounds(265, 280, 61, 16);
		frame.getContentPane().add(lblSurname);
		
		lblPhoneNum = new JLabel("Phone Num*");
		lblPhoneNum.setForeground(new Color(32, 75, 121));
		lblPhoneNum.setFont(new Font("Helvetica", Font.PLAIN, 11));
		lblPhoneNum.setBounds(101, 324, 105, 16);
		frame.getContentPane().add(lblPhoneNum);
		
	    ImageIcon get_id_btn=new ImageIcon("Libray_Management_System/src/graphs/get_id_btn.png");
		img = get_id_btn.getImage();
		temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		get_id_btn = new ImageIcon(temp);	  
		JButton getId = new JButton(get_id_btn);
		getId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstnameTxt.getText().equals("First Name*") || firstnameTxt.getText().equals("")|| lnameTxt.getText().equals("Surname*") || lnameTxt.getText().equals("") ||
						phoneNumTxt.getText().equals("Phone Number*") || phoneNumTxt.getText().equals("")) {
					WarningPage warning = new WarningPage();
					warning.getFrmWarning().setVisible(true);
			
				}
				else {
					String fname = firstnameTxt.getText();
					String lname = lnameTxt.getText();
					String minit;
					if (minitTxt.getText()!="M.") {
						minit = minitTxt.getText();
				}
					else {
					 minit = null;
					}
					String phoneNum = phoneNumTxt.getText();
					UserFactory factory = new UserFactory(fname,minit,lname,phoneNum);
					SuccessRegister success = new SuccessRegister(factory.getLibraryID());
					frame.setVisible(false);
					success.getFrame().setVisible(true);
					

					
				}
			}
		});
		getId.setContentAreaFilled(false);
		getId.setBorderPainted(false);
		getId.setFocusPainted(false);	
		
		getId.setBounds(186, 480, 117, 29);
		frame.getContentPane().add(getId);
	    
	    
	    
		JLabel back=new JLabel(background);
		back.setBounds(0,0,500,600);
		frame.getContentPane().add(back);
	}

	public JFrame getFrame() {
		return frame;
	}
	
	

}
