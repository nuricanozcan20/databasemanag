package ui;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import domain.Staff;

public class EmployeeDeleteBookPage {

	private JFrame frame;
	private Staff staff;




	/**
	 * Create the application.
	 */
	public EmployeeDeleteBookPage(Staff s) {
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
		
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/employee_delete_book.jpeg");
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
		
	    ImageIcon delete_book_btn=new ImageIcon("Libray_Management_System/src/graphs/delete_book_btn.png");
	    img=delete_book_btn.getImage();
	    temp=img.getScaledInstance(175,175,Image.SCALE_SMOOTH);
	    delete_book_btn=new ImageIcon(temp);
		JButton deleteBookBtn = new JButton(delete_book_btn);
		deleteBookBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    JOptionPane.showMessageDialog(frame, "You succesfully deleted the book to the database");
			    EmployeeMainPage page = new EmployeeMainPage(staff);
				frame.dispose();
				page.getFrame().setVisible(true);				
			}
		});
		deleteBookBtn.setOpaque(false);
		deleteBookBtn.setContentAreaFilled(false);
		deleteBookBtn.setBorderPainted(false);
		deleteBookBtn.setFocusPainted(false);	
		deleteBookBtn.setBounds(154, 454, 192, 36);
		frame.getContentPane().add(deleteBookBtn);

	       DefaultTableModel tableModel = new DefaultTableModel();
	        tableModel.addColumn("NAME");
	        tableModel.addColumn("AUTHOR");
	        tableModel.addColumn("PUBLISHER");
	        tableModel.addColumn("LANGUAGE");
	        tableModel.addColumn("PUBLISH DATE");
	        tableModel.addColumn("GENRE");

	        


	        for (int i = 1; i <= 10; i++) {
	            tableModel.addRow(new Object[]{"Book Name " + i, "Author " + i, "Publisher " + i,"Language","Publish Date"});
	        }

	        JTable table = new JTable(tableModel);

	        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	        table.setOpaque(false);
	        ((JComponent) table.getDefaultRenderer(Object.class)).setOpaque(false);

	        table.getColumnModel().getColumn(0).setPreferredWidth(100);
	        table.getColumnModel().getColumn(1).setPreferredWidth(100);
	        table.getColumnModel().getColumn(2).setPreferredWidth(100);
	        table.getColumnModel().getColumn(3).setPreferredWidth(100);
	        table.getColumnModel().getColumn(4).setPreferredWidth(100);
	        table.getColumnModel().getColumn(5).setPreferredWidth(100);
	        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 


	        
	        JScrollPane scrollPane = new JScrollPane(table);

	        
	        scrollPane.setOpaque(false);
	        scrollPane.getViewport().setOpaque(false);
	        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scrollPane.setVisible(true);
	        scrollPane.setBounds(60, 120, 390, 320);
	        frame.getContentPane().add(scrollPane);		
		
		
		
		
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
