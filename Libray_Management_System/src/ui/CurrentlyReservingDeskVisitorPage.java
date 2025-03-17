package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import domain.Desk;
import domain.RegisteredUser;
import domain.Visitor;

import javax.swing.JTextField;

public class CurrentlyReservingDeskVisitorPage {

	private JFrame frame;
	private Visitor user;
	private Desk desk;
	private JTextField hoursField;

	public CurrentlyReservingDeskVisitorPage(Visitor user, Desk desk) {
		this.user = user;
		this.desk = desk;
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/visitor_currently_desk.jpeg");
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
				VisitorSearchBookPage bookSearch = new VisitorSearchBookPage(user);
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
				VisitorMainPage page = new VisitorMainPage(user);
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
				VisitorProfilePage profile = new VisitorProfilePage(user);
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
		
		ImageIcon reserve_btn=new ImageIcon("Libray_Management_System/src/graphs/visitor_reserve_btn.png");
	    img=reserve_btn.getImage();
	    temp=img.getScaledInstance(100,100,Image.SCALE_SMOOTH);
	    reserve_btn=new ImageIcon(temp);
		JButton reserveBtn = new JButton(reserve_btn);
		reserveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    JOptionPane.showMessageDialog(frame, "You succesfully reserved the desk");
			    VisitorMainPage page = new VisitorMainPage(user);
				frame.dispose();
				page.getFrame().setVisible(true);

			}
		});
		reserveBtn.setOpaque(false);
		reserveBtn.setContentAreaFilled(false);
		reserveBtn.setBorderPainted(false);
		reserveBtn.setFocusPainted(false);	
		reserveBtn.setBounds(192, 450, 103, 26);
		frame.getContentPane().add(reserveBtn);
		
		hoursField = new JTextField();
		hoursField.setBounds(170, 420, 180, 26);
		frame.getContentPane().add(hoursField);
		hoursField.setColumns(10);
		hoursField.setOpaque(false);
        hoursField.setBackground(new Color(0, 0, 0, 0));
        hoursField.setForeground(Color.BLACK); // Set text color for visibility
        hoursField.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	    
		JLabel back=new JLabel(background);
		back.setBounds(0,0,500,572);
		frame.getContentPane().add(back);
		

	}

	public JFrame getFrame() {
		return frame;
	}

	public Visitor getUser() {
		return user;
	}

	public Desk getDesk() {
		return desk;
	}
	
}