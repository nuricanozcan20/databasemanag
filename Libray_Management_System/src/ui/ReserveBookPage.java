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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import domain.RegisteredUser;

public class ReserveBookPage {

	private JFrame frame;
	private RegisteredUser user;


	/**
	 * Create the application.
	 */
	public ReserveBookPage(RegisteredUser user) {
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
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/reserve_book.jpeg");
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
				UserSearchBookPage bookSearch = new UserSearchBookPage(user);
				frame.dispose();
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
        scrollPane.setBounds(60, 170, 390, 320);
        frame.getContentPane().add(scrollPane);		
		
	    ImageIcon reserve_btn=new ImageIcon("Libray_Management_System/src/graphs/reserve_btn.png");
	    img=reserve_btn.getImage();
	    temp=img.getScaledInstance(100,100,Image.SCALE_SMOOTH);
	    reserve_btn=new ImageIcon(temp);
		JButton reserveBtn = new JButton(reserve_btn);
		reserveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(table.getValueAt(table.getSelectedRow(), 0));
				CurrentlyReservingBookPage bookPage = new CurrentlyReservingBookPage(user, null);
				frame.dispose();
				bookPage.getFrame().setVisible(true);
			}
		});
		reserveBtn.setOpaque(false);
		reserveBtn.setContentAreaFilled(false);
		reserveBtn.setBorderPainted(false);
		reserveBtn.setFocusPainted(false);	
		reserveBtn.setBounds(60, 135, 103, 26);
		frame.getContentPane().add(reserveBtn);
		
		
	    ImageIcon info_btn=new ImageIcon("Libray_Management_System/src/graphs/book_info_btn.png");
	    img=info_btn.getImage();
	    temp=img.getScaledInstance(100,100,Image.SCALE_SMOOTH);
	    info_btn=new ImageIcon(temp);
		JButton infoBtn = new JButton(info_btn);
		infoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(table.getValueAt(table.getSelectedRow(), 0));
				BookInfoPage bookInfo = new BookInfoPage(user,null);
				frame.dispose();
				bookInfo.getFrame().setVisible(true);
				
			}
		});
		infoBtn.setOpaque(false);
		infoBtn.setContentAreaFilled(false);
		infoBtn.setBorderPainted(false);
		infoBtn.setFocusPainted(false);	
		infoBtn.setBounds(169, 135, 70, 26);
		frame.getContentPane().add(infoBtn);
		
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
