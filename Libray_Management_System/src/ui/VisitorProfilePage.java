package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import domain.RegisteredUser;
import domain.Visitor;

public class VisitorProfilePage {

	private JFrame frame;
	private Visitor visitor;


	public VisitorProfilePage(Visitor visitor) {
		this.visitor = visitor;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/visitor_profile.jpeg");
	    Image img=background.getImage();
	    Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
	    background=new ImageIcon(temp);
	    
	    
	    ImageIcon booksearch_btn=new ImageIcon("Libray_Management_System/src/graphs/visitor_book_search_btn.png");
	    img=booksearch_btn.getImage();
	    temp=img.getScaledInstance(40,40,Image.SCALE_SMOOTH);
	    booksearch_btn=new ImageIcon(temp);
	    
		JButton searchBtn = new JButton(booksearch_btn);
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				VisitorSearchBookPage bookSearch = new VisitorSearchBookPage(visitor);
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
		
	    ImageIcon back_btn=new ImageIcon("Libray_Management_System/src/graphs/visitor_main_back.png");
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
				VisitorMainPage page = new VisitorMainPage(visitor);
				frame.dispose();
				page.getFrame().setVisible(true);
			}
		});
		backPageBtn.setBounds(210, 520, 80, 40);
		frame.getContentPane().add(backPageBtn);
		
	    ImageIcon profile_btn=new ImageIcon("Libray_Management_System/src/graphs/visitor_info_btn.png");
	    img=profile_btn.getImage();
	    temp=img.getScaledInstance(40,40,Image.SCALE_SMOOTH);
	    profile_btn=new ImageIcon(temp);
		JButton profileBtn = new JButton(profile_btn);
		profileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisitorProfilePage profile = new VisitorProfilePage(visitor);
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
		
		
	    ImageIcon logout_btn=new ImageIcon("Libray_Management_System/src/graphs/visitor_log_out_btn.png");
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
	    
	    

		
		JLabel nameLbl = new JLabel("Name");
		nameLbl.setForeground(new Color(103,20, 58));
		nameLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		nameLbl.setBounds(60, 200, 116, 16);
		frame.getContentPane().add(nameLbl);
				
		JLabel libIdLbl = new JLabel("Library ID");
		libIdLbl.setForeground(new Color(103,20, 58));
		libIdLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		libIdLbl.setBounds(60, 228, 116, 16);
		frame.getContentPane().add(libIdLbl);
		
		JLabel phoneLbl = new JLabel("Phone Number");
		phoneLbl.setForeground(new Color(103,20, 58));
		phoneLbl.setFont(new Font("Helvetica", Font.PLAIN, 14));
		phoneLbl.setBounds(60, 256, 116, 16);
		frame.getContentPane().add(phoneLbl);

	
		
		String name;
		if(visitor.getMinit()!=null) {
			name = visitor.getFname()+" "+visitor.getMinit()+" "+ visitor.getLname();
		}
		else {
			name = visitor.getFname()+" "+ visitor.getLname();
		}
		JLabel lblName = new JLabel(name);
		lblName.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblName.setBounds(193, 199, 260, 16);
		frame.getContentPane().add(lblName);
				
		JLabel lblLibId = new JLabel(visitor.getLibraryID());
		lblLibId.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblLibId.setBounds(193, 227, 260, 16);
		frame.getContentPane().add(lblLibId);
		
		JLabel lblPhone = new JLabel(visitor.getPhoneNumber());
		lblPhone.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblPhone.setBounds(193, 255, 260, 16);
		frame.getContentPane().add(lblPhone);
		

		
		JLabel back=new JLabel(background);
		back.setBounds(0,0,500,572);
		frame.getContentPane().add(back);

	}

	public JFrame getFrame() {
		return frame;
	}

	public Visitor getUser() {
		return visitor;
	}
	
}