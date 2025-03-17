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
import domain.Visitor;

public class VisitorReservationsPage {

	private JFrame frame;
	private Visitor visitor;


	public VisitorReservationsPage(Visitor visitor) {
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
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/visitor_reservations_page.jpeg");
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
		
        //DESK RESERVATIONS
        
        DefaultTableModel tableModel1 = new DefaultTableModel();
        tableModel1.addColumn("DESK NUMBER");
        tableModel1.addColumn("RENTAL TIME");
        tableModel1.addColumn("DURATION");
        tableModel1.addColumn("CHECKOUT TIME");



        


        for (int i = 1; i <= 10; i++) {
            tableModel1.addRow(new Object[]{"Desk Number " + i, "Rental Time " + i,"Duration","Checkout Time"});
        }

        JTable table1 = new JTable(tableModel1);

        table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table1.setOpaque(false);
        ((JComponent) table1.getDefaultRenderer(Object.class)).setOpaque(false);

        table1.getColumnModel().getColumn(0).setPreferredWidth(100);
        table1.getColumnModel().getColumn(1).setPreferredWidth(100);
        table1.getColumnModel().getColumn(2).setPreferredWidth(100);
        table1.getColumnModel().getColumn(3).setPreferredWidth(100);

        table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 


        
        JScrollPane scrollPane1 = new JScrollPane(table1);

        
        scrollPane1.setOpaque(false);
        scrollPane1.getViewport().setOpaque(false);
        scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane1.setVisible(true);
        scrollPane1.setBounds(60, 150, 390, 320);
        frame.getContentPane().add(scrollPane1);
	    
	    
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