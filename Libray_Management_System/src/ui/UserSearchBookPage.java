package ui;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import domain.RegisteredUser;
import domain.Staff;
import domain.User;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

public class UserSearchBookPage {

	private JFrame frame;
	private User user;
	private JTextField searchField;

	/**
	 * Create the application.
	 */
	public UserSearchBookPage(User user) {
		initialize();
		this.user = user;
	}
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/user_search_book.jpeg");
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
        scrollPane.setVisible(false);
        scrollPane.setBounds(60, 150, 390, 340);
        frame.getContentPane().add(scrollPane);
        
		searchField = new JTextField();
		searchField.setForeground(new Color(29, 115, 74));
		Border border = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		searchField.setBorder(border);
		searchField.setFont(new Font("Helvetica", Font.ITALIC, 16));
		searchField.setBounds(60, 80, 343, 50);
		frame.getContentPane().add(searchField);
		searchField.setColumns(10);
		
		
	    ImageIcon search_field=new ImageIcon("Libray_Management_System/src/graphs/book_search_btn.png");
	    img=search_field.getImage();
	    temp=img.getScaledInstance(40,40,Image.SCALE_SMOOTH);
	    search_field=new ImageIcon(temp);
		JButton sBtn = new JButton(search_field);
		sBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                tableModel.setRowCount(0); 
                for (int i = 1; i <= 40; i++) {
                    tableModel.addRow(new Object[]{searchField.getText() + i, "More Searched Data " + i, "Extra Searched Data " + i,"Test","Tesfsssst"});
                }

                scrollPane.setVisible(true);
                frame.revalidate(); 
                frame.repaint(); 
            }
		});
		
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) { 
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) { 
                        String rowData = (String) table.getValueAt(selectedRow, 0); 
                        JOptionPane.showMessageDialog(frame, "You are redirected to reservation page");
                        // Your code to proceed with the selected row
                        BookInfoPage info = new BookInfoPage((RegisteredUser)user,null);
                        frame.dispose();
                        info.getFrame().setVisible(true);
                    }
                }
            }
        });
		sBtn.setOpaque(false);
		sBtn.setContentAreaFilled(false);
		sBtn.setBorderPainted(false);
		sBtn.setFocusPainted(false);
		sBtn.setBounds(401, 80, 60, 50);
		frame.getContentPane().add(sBtn);

		
        
		JLabel back=new JLabel(background);
		back.setBounds(0,0,500,572);
		frame.getContentPane().add(back);

		

	}

	public JFrame getFrame() {
		return frame;
	}
}
