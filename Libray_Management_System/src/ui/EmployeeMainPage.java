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
import domain.Staff;

public class EmployeeMainPage {

	private JFrame frame;
	private Staff staff;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeMainPage window = new EmployeeMainPage(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EmployeeMainPage(Staff s) {
		this.staff = s;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/employee_main_page.jpeg");
	    Image img=background.getImage();
	    Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
	    background=new ImageIcon(temp);
	    
		frame.getContentPane().setLayout(null);
		
	    ImageIcon booksearch_btn=new ImageIcon("Libray_Management_System/src/graphs/employee_book_search_btn.png");
	    img=booksearch_btn.getImage();
	    temp=img.getScaledInstance(40,40,Image.SCALE_SMOOTH);
	    booksearch_btn=new ImageIcon(temp);
	    
		JButton searchBtn = new JButton(booksearch_btn);
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				EmployeeSearchBookPage bookSearch = new EmployeeSearchBookPage(staff);
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
		
	    ImageIcon back_btn=new ImageIcon("Libray_Management_System/src/graphs/employee_main_back.png");
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
				EmployeeMainPage page = new EmployeeMainPage(staff);
				frame.dispose();
				page.getFrame().setVisible(true);
			}
		});
		backPageBtn.setBounds(210, 520, 80, 40);
		frame.getContentPane().add(backPageBtn);
		
	    ImageIcon profile_btn=new ImageIcon("Libray_Management_System/src/graphs/employee_info_btn.png");
	    img=profile_btn.getImage();
	    temp=img.getScaledInstance(40,40,Image.SCALE_SMOOTH);
	    profile_btn=new ImageIcon(temp);
		JButton profileBtn = new JButton(profile_btn);
		profileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeProfilePage profile = new EmployeeProfilePage(staff);
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
		
	    ImageIcon add_book_Btn=new ImageIcon("Libray_Management_System/src/graphs/employee_add_book.png");
	    img=add_book_Btn.getImage();
	    temp=img.getScaledInstance(200,200,Image.SCALE_SMOOTH);
	    add_book_Btn=new ImageIcon(temp);
		JButton bookBtn = new JButton(add_book_Btn);
		bookBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeAddBookPage page = new EmployeeAddBookPage(staff);
				frame.dispose();
				page.getFrame().setVisible(true);

			}
		});
		bookBtn.setOpaque(false);
		bookBtn.setContentAreaFilled(false);
		bookBtn.setBorderPainted(false);
		bookBtn.setFocusPainted(false);	
		bookBtn.setBounds(14, 163, 231, 76);
		frame.getContentPane().add(bookBtn);
		
	    ImageIcon delete_book=new ImageIcon("Libray_Management_System/src/graphs/employee_delete_book.png");
	    img=delete_book.getImage();
	    temp=img.getScaledInstance(200,200,Image.SCALE_SMOOTH);
	    delete_book=new ImageIcon(temp);
		JButton delete_book_btn = new JButton(delete_book);
		delete_book_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeDeleteBookPage page = new EmployeeDeleteBookPage(staff);
				frame.dispose();
				page.getFrame().setVisible(true);
			}
		});
		delete_book_btn.setOpaque(false);
		delete_book_btn.setContentAreaFilled(false);
		delete_book_btn.setBorderPainted(false);
		delete_book_btn.setFocusPainted(false);	
		delete_book_btn.setBounds(254, 163, 231, 76);
		frame.getContentPane().add(delete_book_btn);	
		
	    ImageIcon delete_visitor=new ImageIcon("Libray_Management_System/src/graphs/employee_delete_visitor.png");
	    img=delete_visitor.getImage();
	    temp=img.getScaledInstance(200,200,Image.SCALE_SMOOTH);
	    delete_visitor=new ImageIcon(temp);
		JButton delete_visitor_btn = new JButton(delete_visitor);
		delete_visitor_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeDeleteVisitorPage page = new EmployeeDeleteVisitorPage(staff);
				frame.dispose();
				page.getFrame().setVisible(true);

			}
		});
		delete_visitor_btn.setOpaque(false);
		delete_visitor_btn.setContentAreaFilled(false);
		delete_visitor_btn.setBorderPainted(false);
		delete_visitor_btn.setFocusPainted(false);	
		delete_visitor_btn.setBounds(14, 262, 231, 76);
		frame.getContentPane().add(delete_visitor_btn);		

	    ImageIcon delete_user=new ImageIcon("Libray_Management_System/src/graphs/employee_delete_user.png");
	    img=delete_user.getImage();
	    temp=img.getScaledInstance(200,200,Image.SCALE_SMOOTH);
	    delete_user=new ImageIcon(temp);
		JButton delete_user_btn = new JButton(delete_user);
		delete_user_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeDeleteUserPage page = new EmployeeDeleteUserPage(staff);
				frame.dispose();
				page.getFrame().setVisible(true);

			}
		});
		delete_user_btn.setOpaque(false);
		delete_user_btn.setContentAreaFilled(false);
		delete_user_btn.setBorderPainted(false);
		delete_user_btn.setFocusPainted(false);	
		delete_user_btn.setBounds(254, 262, 231, 76);
		frame.getContentPane().add(delete_user_btn);			

	    ImageIcon add_desk=new ImageIcon("Libray_Management_System/src/graphs/employee_add_desk.png");
	    img=add_desk.getImage();
	    temp=img.getScaledInstance(200,200,Image.SCALE_SMOOTH);
	    add_desk=new ImageIcon(temp);
		JButton add_desk_btn = new JButton(add_desk);
		add_desk_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeAddDeskPage page = new EmployeeAddDeskPage(staff);
				frame.dispose();
				page.getFrame().setVisible(true);
				

			}
		});
		add_desk_btn.setOpaque(false);
		add_desk_btn.setContentAreaFilled(false);
		add_desk_btn.setBorderPainted(false);
		add_desk_btn.setFocusPainted(false);	
		add_desk_btn.setBounds(14, 361, 231, 76);
		frame.getContentPane().add(add_desk_btn);
		
	    ImageIcon delete_desk=new ImageIcon("Libray_Management_System/src/graphs/employee_delete_desk.png");
	    img=delete_desk.getImage();
	    temp=img.getScaledInstance(200,200,Image.SCALE_SMOOTH);
	    delete_desk=new ImageIcon(temp);
		JButton delete_desk_btn = new JButton(delete_desk);
		delete_desk_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeDeleteDeskPage page = new EmployeeDeleteDeskPage(staff);
				frame.dispose();
				page.getFrame().setVisible(true);

			}
		});
		delete_desk_btn.setOpaque(false);
		delete_desk_btn.setContentAreaFilled(false);
		delete_desk_btn.setBorderPainted(false);
		delete_desk_btn.setFocusPainted(false);	
		delete_desk_btn.setBounds(254, 361, 231, 76);
		frame.getContentPane().add(delete_desk_btn);		    
		JLabel back=new JLabel(background);
		
		back.setBounds(0,0,500,572);
		frame.getContentPane().add(back);
	}

	public JFrame getFrame() {
		return frame;
	}
	
	

}
