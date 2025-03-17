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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import domain.Staff;

public class EmployeeAddDeskPage {

	private JFrame frame;
	private Staff staff;
	private JTextField deskNum;

	/**
	 * Create the application.
	 */
	public EmployeeAddDeskPage(Staff s) {
		this.staff =s;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/employee_add_book.jpeg");
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
		
	    ImageIcon add_desk_btn=new ImageIcon("Libray_Management_System/src/graphs/add_desk_btn.png");
	    img=add_desk_btn.getImage();
	    temp=img.getScaledInstance(175,175,Image.SCALE_SMOOTH);
	    add_desk_btn=new ImageIcon(temp);
		JButton addDeskBtn = new JButton(add_desk_btn);
		addDeskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    JOptionPane.showMessageDialog(frame, "You succesfully add the desk to the database");
			    EmployeeMainPage page = new EmployeeMainPage(staff);
				frame.dispose();
				page.getFrame().setVisible(true);				
			}
		});
		addDeskBtn.setOpaque(false);
		addDeskBtn.setContentAreaFilled(false);
		addDeskBtn.setBorderPainted(false);
		addDeskBtn.setFocusPainted(false);	
		addDeskBtn.setBounds(154, 454, 192, 36);
		frame.getContentPane().add(addDeskBtn);
		
		JLabel deskNumber = new JLabel("Desk Number");
		deskNumber.setForeground(new Color(177,76, 0));
		deskNumber.setFont(new Font("Helvetica", Font.BOLD, 14));
		deskNumber.setBounds(60, 215, 130, 16);
		frame.getContentPane().add(deskNumber);
		
		deskNum = new JTextField();
		deskNum.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		deskNum.setBounds(210, 209, 171, 26);
		frame.getContentPane().add(deskNum);
		deskNum.setColumns(10);	    
	    
	    
		JLabel back=new JLabel(background);
		back.setBounds(0,0,500,572);
		frame.getContentPane().add(back);
	}

	public JFrame getFrame() {
		return frame;
	}

	public Staff getStaff() {
		return staff;
	}
	
	

}
