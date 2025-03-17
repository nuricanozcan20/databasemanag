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
import domain.User;
import domain.Visitor;

public class VisitorMainPage {

	private JFrame frame;
	private Visitor visitor;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisitorMainPage window = new VisitorMainPage(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VisitorMainPage(Visitor visitor) {
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
		
		ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/visitor_main.jpeg");
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
		
		
	    ImageIcon desk_Btn=new ImageIcon("Libray_Management_System/src/graphs/visitor_reserve_desk_btn.png");
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
				VisitorReserveDeskPage reservePage = new VisitorReserveDeskPage(visitor);
				frame.dispose();
				reservePage.getFrame().setVisible(true);
			}
		});
		deskBtn.setBounds(80, 200, 350, 75);
		frame.getContentPane().add(deskBtn);
		
	    ImageIcon reservation_btn=new ImageIcon("Libray_Management_System/src/graphs/visitor_reservations_btn.png");
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
				VisitorReservationsPage reservations = new VisitorReservationsPage(visitor);
				frame.dispose();
				reservations.getFrame().setVisible(true);
				
			}
		});
		reservationBtn.setBounds(80, 320, 350, 75);
		frame.getContentPane().add(reservationBtn);
		
		JLabel back=new JLabel(background);
		back.setBounds(0,0,500,572);
		frame.getContentPane().add(back);
	}

	public JFrame getFrame() {
		return frame;
	}

	public User getUser() {
		return visitor;
	}
}