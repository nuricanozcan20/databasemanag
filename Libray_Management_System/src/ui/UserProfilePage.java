package ui;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import domain.RegisteredUser;
import java.awt.Font;
import java.awt.Color;

public class UserProfilePage {

	private JFrame frame;
	private RegisteredUser user;
	

	/**
	 * Create the application.
	 */
	public UserProfilePage(RegisteredUser user) {
		this.user = user;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/user_profile.jpeg");
	    Image img=background.getImage();
	    Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
	    background=new ImageIcon(temp);
	    
	    
	    ImageIcon booksearch_btn=new ImageIcon("Libray_Management_System/src/graphs/book_search_btn.png");
	    img=booksearch_btn.getImage();
	    temp=img.getScaledInstance(40,40,Image.SCALE_SMOOTH);
	    booksearch_btn=new ImageIcon(temp);
	    
		JButton searchBtn = new JButton(booksearch_btn);
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UserSearchBookPage bookSearch = new UserSearchBookPage(user);
				bookSearch.getFrame().setVisible(true);
			}
		});
		frame.getContentPane().setLayout(null);
		searchBtn.setOpaque(false);
		searchBtn.setContentAreaFilled(false);
		searchBtn.setBorderPainted(false);
		searchBtn.setFocusPainted(false);	
		searchBtn.setBounds(60, 520, 80, 40);
		frame.getContentPane().add(searchBtn);
		
	    ImageIcon back_btn=new ImageIcon("Libray_Management_System/src/graphs/user_main_back.png");
	    img=back_btn.getImage();
	    temp=img.getScaledInstance(40,40,Image.SCALE_SMOOTH);
	    back_btn=new ImageIcon(temp);
		
		JButton backPageBtn = new JButton(back_btn);
		backPageBtn.setOpaque(false);
		backPageBtn.setContentAreaFilled(false);
		backPageBtn.setBorderPainted(false);
		backPageBtn.setFocusPainted(false);	
		backPageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMainPage page = new UserMainPage(user);
				frame.dispose();
				page.getFrame().setVisible(true);
			}
		});
		backPageBtn.setBounds(210, 520, 80, 40);
		frame.getContentPane().add(backPageBtn);
		
	    ImageIcon profile_btn=new ImageIcon("Libray_Management_System/src/graphs/info_btn.png");
	    img=profile_btn.getImage();
	    temp=img.getScaledInstance(40,40,Image.SCALE_SMOOTH);
	    profile_btn=new ImageIcon(temp);
		JButton profileBtn = new JButton(profile_btn);
		profileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserProfilePage profile = new UserProfilePage((RegisteredUser) user);
				frame.dispose();
				profile.getFrame().setVisible(true);
			}
		});
		profileBtn.setOpaque(false);
		profileBtn.setContentAreaFilled(false);
		profileBtn.setBorderPainted(false);
		profileBtn.setFocusPainted(false);	
		profileBtn.setBounds(355, 520, 80, 40);
		frame.getContentPane().add(profileBtn);
		
		
	    ImageIcon logout_btn=new ImageIcon("Libray_Management_System/src/graphs/log_out_btn.png");
	    img=logout_btn.getImage();
	    temp=img.getScaledInstance(100,100,Image.SCALE_SMOOTH);
	    logout_btn=new ImageIcon(temp);		
		JButton logoutBtn = new JButton(logout_btn);
		logoutBtn.setOpaque(false);
		logoutBtn.setContentAreaFilled(false);
		logoutBtn.setBorderPainted(false);
		logoutBtn.setFocusPainted(false);	
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage login = new LoginPage();
				frame.dispose();
				login.getFrame().setVisible(true);
			}
		});
		logoutBtn.setBounds(193, 453, 116, 40);
		frame.getContentPane().add(logoutBtn);
	    
	    

		String name;
		if(user.getMinit()!=null) {
			name = user.getFname()+" "+user.getMinit()+" "+ user.getLname();
		}
		else {
			name = user.getFname()+" "+ user.getLname();
		}
		JLabel nameLbl = new JLabel("Name:");
		nameLbl.setForeground(new Color(29,115, 74));
		nameLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		nameLbl.setBounds(60, 200, 116, 16);
		frame.getContentPane().add(nameLbl);
				
		JLabel libIdLbl = new JLabel("Library ID");
		libIdLbl.setForeground(new Color(29, 115, 74));
		libIdLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		libIdLbl.setBounds(60, 228, 116, 16);
		frame.getContentPane().add(libIdLbl);
		
		JLabel phoneLbl = new JLabel("Phone Number");
		phoneLbl.setForeground(new Color(29, 115, 74));
		phoneLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		phoneLbl.setBounds(60, 256, 116, 16);
		frame.getContentPane().add(phoneLbl);
		
		JLabel mailLbl = new JLabel("Mail");
		mailLbl.setForeground(new Color(29, 115, 74));
		mailLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		mailLbl.setBounds(60, 284, 116, 16);
		frame.getContentPane().add(mailLbl);
		
		JLabel birthDateLbl = new JLabel("Birthdate");
		birthDateLbl.setForeground(new Color(29, 115, 74));
		birthDateLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		birthDateLbl.setBounds(60, 312, 116, 16);
		frame.getContentPane().add(birthDateLbl);
		
		JLabel citizenLbl = new JLabel("Citizen ID");
		citizenLbl.setForeground(new Color(29, 115, 74));
		citizenLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		citizenLbl.setBounds(60, 340, 116, 16);
		frame.getContentPane().add(citizenLbl);
		
		JLabel addressLbl = new JLabel("Address");
		addressLbl.setForeground(new Color(29, 115, 74));
		addressLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		addressLbl.setBounds(60, 368, 116, 16);
		frame.getContentPane().add(addressLbl);
		
		JLabel genderLbl = new JLabel("Gender");
		genderLbl.setForeground(new Color(29, 115, 74));
		genderLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		genderLbl.setBounds(60, 396, 116, 16);
		frame.getContentPane().add(genderLbl);
		
		JLabel regDateLbl = new JLabel("Registration Date");
		regDateLbl.setForeground(new Color(29, 115, 74));
		regDateLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		regDateLbl.setBounds(60, 424, 116, 16);
		frame.getContentPane().add(regDateLbl);
	
		
		JLabel lblName = new JLabel(name);
		lblName.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblName.setBounds(193, 199, 260, 16);
		frame.getContentPane().add(lblName);
				
		JLabel lblLibId = new JLabel(user.getLibraryID());
		lblLibId.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblLibId.setBounds(193, 227, 260, 16);
		frame.getContentPane().add(lblLibId);
		
		JLabel lblPhone = new JLabel(user.getPhoneNumber());
		lblPhone.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblPhone.setBounds(193, 255, 260, 16);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblMail = new JLabel(user.getEmails());
		lblMail.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblMail.setBounds(193, 283, 260, 16);
		frame.getContentPane().add(lblMail);
		
		JLabel lblBirth = new JLabel(user.getDateOfBirth());
		lblBirth.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblBirth.setBounds(193, 311, 260, 16);
		frame.getContentPane().add(lblBirth);
		
		JLabel lblCitizen = new JLabel(user.getIdentificationNumber());
		lblCitizen.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblCitizen.setBounds(193, 339, 260, 16);
		frame.getContentPane().add(lblCitizen);
		
		JLabel lblAddress = new JLabel(user.getAddress());
		lblAddress.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblAddress.setBounds(193, 367, 260, 16);
		frame.getContentPane().add(lblAddress);
		
		String g;
		if(user.getGender()==Gender.MALE) {
			 g = "MALE";
		}
		else {
			 g = "FEMALE";
		}
		JLabel lblGender = new JLabel(g);
		lblGender.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblGender.setBounds(193, 395, 260, 16);
		frame.getContentPane().add(lblGender);
		
		JLabel lblRegistrationDate = new JLabel(user.getRegistrationDate());
		lblRegistrationDate.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblRegistrationDate.setBounds(193, 423, 260, 16);
		frame.getContentPane().add(lblRegistrationDate);
		
		JLabel back=new JLabel(background);
		back.setBounds(0,0,500,572);
		frame.getContentPane().add(back);

	}

	public JFrame getFrame() {
		return frame;
	}

	public RegisteredUser getUser() {
		return user;
	}
	
	

}
