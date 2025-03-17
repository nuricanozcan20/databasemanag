package ui;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import domain.RegisteredUser;
import domain.User;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserMainPage {

	private JFrame frame;
	private User user;

	
	public UserMainPage(User user) {
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
		
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/user_main.jpeg");
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
		
	    ImageIcon book_Btn=new ImageIcon("Libray_Management_System/src/graphs/reserve_book_btn.png");
	    img=book_Btn.getImage();
	    temp=img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
	    book_Btn=new ImageIcon(temp);
		JButton bookBtn = new JButton(book_Btn);
		bookBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ReserveBookPage reserveBook = new ReserveBookPage((RegisteredUser) user);
				reserveBook.getFrame().setVisible(true);
			}
		});
		bookBtn.setOpaque(false);
		bookBtn.setContentAreaFilled(false);
		bookBtn.setBorderPainted(false);
		bookBtn.setFocusPainted(false);	
		bookBtn.setBounds(80, 150, 350, 75);
		frame.getContentPane().add(bookBtn);
		
	    ImageIcon desk_Btn=new ImageIcon("Libray_Management_System/src/graphs/reserve_desk_btn.png");
	    img=desk_Btn.getImage();
	    temp=img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
	    desk_Btn=new ImageIcon(temp);
		JButton deskBtn = new JButton(desk_Btn);
		deskBtn.setOpaque(false);
		deskBtn.setContentAreaFilled(false);
		deskBtn.setBorderPainted(false);
		deskBtn.setFocusPainted(false);	
		deskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserReserveDeskPage reservePage = new UserReserveDeskPage(user);
				frame.dispose();
				reservePage.getFrame().setVisible(true);
			}
		});
		deskBtn.setBounds(80, 263, 350, 75);
		frame.getContentPane().add(deskBtn);
		
	    ImageIcon reservation_btn=new ImageIcon("Libray_Management_System/src/graphs/reservations_btn.png");
	    img=reservation_btn.getImage();
	    temp=img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
	    reservation_btn=new ImageIcon(temp);
		JButton reservationBtn = new JButton(reservation_btn);
		reservationBtn.setOpaque(false);
		reservationBtn.setContentAreaFilled(false);
		reservationBtn.setBorderPainted(false);
		reservationBtn.setFocusPainted(false);	
		reservationBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserReservationsPage reservations = new UserReservationsPage((RegisteredUser) user);
				frame.dispose();
				reservations.getFrame().setVisible(true);
				
			}
		});
		reservationBtn.setBounds(80, 381, 350, 75);
		frame.getContentPane().add(reservationBtn);
		
		JLabel back=new JLabel(background);
		back.setBounds(0,0,500,572);
		frame.getContentPane().add(back);
	}

	public JFrame getFrame() {
		return frame;
	}

	public User getUser() {
		return user;
	}
	
	

}
