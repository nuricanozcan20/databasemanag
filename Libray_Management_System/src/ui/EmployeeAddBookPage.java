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

import domain.Staff;
import javax.swing.JTextField;

public class EmployeeAddBookPage {

	private JFrame frame;
	private Staff staff;
	private JTextField textField;
	private JTextField titleField;
	private JTextField authorField;
	private JTextField dateField;
	private JTextField publisherField;
	private JTextField langField;
	private JTextField genreField;
	private JTextField pagesField;
	private JTextField stockField;


	/**
	 * Create the application.
	 */
	public EmployeeAddBookPage(Staff s) {
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
		
	    ImageIcon add_book_btn=new ImageIcon("Libray_Management_System/src/graphs/add_book_btn.png");
	    img=add_book_btn.getImage();
	    temp=img.getScaledInstance(175,175,Image.SCALE_SMOOTH);
	    add_book_btn=new ImageIcon(temp);
		JButton addBookBtn = new JButton(add_book_btn);
		addBookBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    JOptionPane.showMessageDialog(frame, "You succesfully add the book to the database");
			    EmployeeMainPage page = new EmployeeMainPage(staff);
				frame.dispose();
				page.getFrame().setVisible(true);				
			}
		});
		addBookBtn.setOpaque(false);
		addBookBtn.setContentAreaFilled(false);
		addBookBtn.setBorderPainted(false);
		addBookBtn.setFocusPainted(false);	
		addBookBtn.setBounds(154, 454, 192, 36);
		frame.getContentPane().add(addBookBtn);
		
		JLabel titleLbl = new JLabel("Title");
		titleLbl.setForeground(new Color(177,76, 0));
		titleLbl.setFont(new Font("Helvetica", Font.BOLD, 14));
		titleLbl.setBounds(60, 120, 130, 16);
		frame.getContentPane().add(titleLbl);
				
		JLabel authorLbl = new JLabel("Author");
		authorLbl.setForeground(new Color(177,76, 0));
		authorLbl.setFont(new Font("Helvetica", Font.BOLD, 14));
		authorLbl.setBounds(60, 148, 130, 16);
		frame.getContentPane().add(authorLbl);
		
		JLabel publishDateLbl = new JLabel("Publish Date");
		publishDateLbl.setForeground(new Color(177,76, 0));
		publishDateLbl.setFont(new Font("Helvetica", Font.BOLD, 14));
		publishDateLbl.setBounds(60, 176, 130, 16);
		frame.getContentPane().add(publishDateLbl);
		
		JLabel publisherLbl = new JLabel("Publisher");
		publisherLbl.setForeground(new Color(177,76, 0));
		publisherLbl.setFont(new Font("Helvetica", Font.BOLD, 14));
		publisherLbl.setBounds(60, 204, 130, 16);
		frame.getContentPane().add(publisherLbl);
		
		JLabel langLbl = new JLabel("Language");
		langLbl.setForeground(new Color(177,76, 0));
		langLbl.setFont(new Font("Helvetica", Font.BOLD, 14));
		langLbl.setBounds(60, 232, 130, 16);
		frame.getContentPane().add(langLbl);
		
		JLabel genreLbl = new JLabel("Genre");
		genreLbl.setForeground(new Color(177,76, 0));
		genreLbl.setFont(new Font("Helvetica", Font.BOLD, 14));
		genreLbl.setBounds(60, 264, 130, 16);
		frame.getContentPane().add(genreLbl);
		
		JLabel pageLbl = new JLabel("Number of Pages");
		pageLbl.setForeground(new Color(177,76, 0));
		pageLbl.setFont(new Font("Helvetica", Font.BOLD, 14));
		pageLbl.setBounds(60, 292, 130, 16);
		frame.getContentPane().add(pageLbl);
		
		JLabel genderLbl = new JLabel("Stock");
		genderLbl.setForeground(new Color(177,76, 0));
		genderLbl.setFont(new Font("Helvetica", Font.BOLD, 14));
		genderLbl.setBounds(60, 320, 130, 16);
		frame.getContentPane().add(genderLbl);

		titleField = new JTextField();
		titleField.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		titleField.setBounds(210, 114, 171, 26);
		frame.getContentPane().add(titleField);
		titleField.setColumns(10);	    
	    
		authorField = new JTextField();
		authorField.setColumns(10);
		authorField.setBounds(210, 142, 171, 26);
		authorField.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		frame.getContentPane().add(authorField);
		
		dateField = new JTextField();
		dateField.setColumns(10);
		dateField.setBounds(210, 170, 171, 26);
		dateField.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		frame.getContentPane().add(dateField);
		
		publisherField = new JTextField();
		publisherField.setColumns(10);
		publisherField.setBounds(210, 198, 171, 26);
		publisherField.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		frame.getContentPane().add(publisherField);
		
		langField = new JTextField();
		langField.setColumns(10);
		langField.setBounds(210, 226, 171, 26);
		langField.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		frame.getContentPane().add(langField);
		
		genreField = new JTextField();
		genreField.setColumns(10);
		genreField.setBounds(210, 258, 171, 26);
		genreField.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		frame.getContentPane().add(genreField);
		
		pagesField = new JTextField();
		pagesField.setColumns(10);
		pagesField.setBounds(210, 286, 171, 26);
		pagesField.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		frame.getContentPane().add(pagesField);
		
		stockField = new JTextField();
		stockField.setColumns(10);
		stockField.setBounds(210, 314, 171, 26);
		stockField.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		frame.getContentPane().add(stockField);
		
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
