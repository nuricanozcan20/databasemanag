package ui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import system.UserFactory;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisteredRegister {

	private JFrame frmRegisterPage;
	private JTextField firstnameTxt;
	private JTextField lnameTxt;
	private JFormattedTextField minitTxt;
	private JTextField txtEmail;
	private JFormattedTextField phoneNumTxt;
	private JTextField idText;
	private JComboBox month_comboBox;
	private JComboBox year_comboBox;
	private JLabel genderLbl;
	private JComboBox gender_comboBox;
	private JTextField addressTxt;
	private JLabel nameLbl;
	private JLabel lblM;
	private JLabel lblSurname;
	private JLabel lblPhoneNum;
	private JLabel lblCitizenId;
	private JLabel lblEmail;
	private JLabel lblAddress;
	


	/**
	 * Create the application.
	 */
	public RegisteredRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegisterPage = new JFrame();
		frmRegisterPage.setResizable(false);
		frmRegisterPage.setTitle("REGISTER PAGE");
		frmRegisterPage.setBounds(500, 100, 500, 600);
		frmRegisterPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegisterPage.getContentPane().setLayout(null);
		
	    ImageIcon background=new ImageIcon("Libray_Management_System/src/graphs/user_register_screen.jpeg");
	    Image img=background.getImage();
	    Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
	    background=new ImageIcon(temp);
		
		firstnameTxt = new JTextField();
		firstnameTxt.setFont(new Font("Helvetica", Font.PLAIN, 12));
		firstnameTxt.setHorizontalAlignment(SwingConstants.LEFT);
		firstnameTxt.setBounds(101, 293, 110, 26);
		firstnameTxt.setColumns(10);
		
        firstnameTxt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (firstnameTxt.getText().equals("First Name*")) {
                	firstnameTxt.setText("");
                	firstnameTxt.setForeground(Color.BLACK);
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (firstnameTxt.getText().isEmpty()) {
                	firstnameTxt.setForeground(Color.GRAY);
                	firstnameTxt.setText("First Name*");
                }
            }
        
	});
		frmRegisterPage.getContentPane().add(firstnameTxt);

		
		lnameTxt = new JTextField();
		lnameTxt.setFont(new Font("Helvetica", Font.PLAIN, 12));
		lnameTxt.setHorizontalAlignment(SwingConstants.LEFT);
		lnameTxt.setColumns(10);
		lnameTxt.setBounds(265, 293, 150, 26);
		
		lnameTxt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (lnameTxt.getText().equals("Surname*")) {
                	lnameTxt.setText("");
                	lnameTxt.setForeground(Color.BLACK);
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (lnameTxt.getText().isEmpty()) {
                	lnameTxt.setForeground(Color.GRAY);
                	lnameTxt.setText("Surname*");
                }
            }
        
	});
		frmRegisterPage.getContentPane().add(lnameTxt);

		
		
		minitTxt = new JFormattedTextField();
		minitTxt.setFont(new Font("Helvetica", Font.PLAIN, 12));
		minitTxt.setHorizontalAlignment(SwingConstants.CENTER);
		minitTxt.setColumns(10);
		minitTxt.setBounds(215, 293, 44, 26);
		
		minitTxt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (minitTxt.getText().equals("M.")) {
                	minitTxt.setText("");
                	minitTxt.setForeground(Color.BLACK);
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (minitTxt.getText().isEmpty()) {
                	minitTxt.setForeground(Color.GRAY);
                	minitTxt.setText("M.");
                }
            }
        
	});
		frmRegisterPage.getContentPane().add(minitTxt);

		
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Helvetica", Font.PLAIN, 12));
		txtEmail.setToolTipText("You can add additional emails later on.");
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setColumns(10);
		txtEmail.setBounds(101, 444, 175, 26);
		
		txtEmail.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtEmail.getText().equals("E-mail*")) {
                	txtEmail.setText("");
                	txtEmail.setForeground(Color.BLACK);
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (txtEmail.getText().isEmpty()) {
                	txtEmail.setForeground(Color.GRAY);
                	txtEmail.setText("E-mail*");
                }
            }
        
	});
		
		frmRegisterPage.getContentPane().add(txtEmail);
		
		phoneNumTxt = new JFormattedTextField();
		phoneNumTxt.setFont(new Font("Helvetica", Font.PLAIN, 12));
		phoneNumTxt.setBounds(101, 339, 152, 26);
		
		phoneNumTxt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (phoneNumTxt.getText().equals("Phone Num*")) {
                	phoneNumTxt.setText("");
                	phoneNumTxt.setForeground(Color.BLACK);
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (phoneNumTxt.getText().isEmpty()) {
                	phoneNumTxt.setForeground(Color.GRAY);
                	phoneNumTxt.setText("Phone Num*");
                }
            }
        
	});
		
		frmRegisterPage.getContentPane().add(phoneNumTxt);
		
		idText = new JTextField();
		idText.setFont(new Font("Helvetica", Font.PLAIN, 12));
		idText.setToolTipText("");
		idText.setHorizontalAlignment(SwingConstants.LEFT);
		idText.setColumns(10);
		idText.setBounds(265, 339, 152, 26);
		
		idText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (idText.getText().equals("Citizen ID*")) {
                	idText.setText("");
                	idText.setForeground(Color.BLACK);
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (idText.getText().isEmpty()) {
                	idText.setForeground(Color.GRAY);
                	idText.setText("Citizen ID*");
                }
            }
        
	});
		
		
		frmRegisterPage.getContentPane().add(idText);
		
		JLabel birthLabel = new JLabel("Date of Birth*");
		birthLabel.setForeground(new Color(32, 75, 121));
		birthLabel.setFont(new Font("Helvetica", Font.PLAIN, 11));
		birthLabel.setBounds(101, 372, 98, 16);
		frmRegisterPage.getContentPane().add(birthLabel);
		
		JComboBox day_comboBox = new JComboBox();
		day_comboBox.setFont(new Font("Helvetica", Font.ITALIC, 11));
		day_comboBox.setModel(new DefaultComboBoxModel(new String[] {"DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		day_comboBox.setBounds(101, 390, 73, 27);
		frmRegisterPage.getContentPane().add(day_comboBox);
		
		month_comboBox = new JComboBox();
		month_comboBox.setFont(new Font("Helvetica", Font.ITALIC, 11));
		month_comboBox.setModel(new DefaultComboBoxModel(new String[] {"MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		month_comboBox.setBounds(171, 390, 73, 27);
		frmRegisterPage.getContentPane().add(month_comboBox);
		
		year_comboBox = new JComboBox();
		year_comboBox.setFont(new Font("Helvetica", Font.ITALIC, 11));
		year_comboBox.setModel(new DefaultComboBoxModel(new String[] {"YYYY", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024"}));
		year_comboBox.setBounds(238, 390, 83, 27);
		frmRegisterPage.getContentPane().add(year_comboBox);
		
		genderLbl = new JLabel("Gender");
		genderLbl.setForeground(new Color(32, 75, 121));
		genderLbl.setFont(new Font("Helvetica", Font.PLAIN, 11));
		genderLbl.setBounds(293, 425, 89, 16);
		frmRegisterPage.getContentPane().add(genderLbl);
		
		gender_comboBox = new JComboBox();
		gender_comboBox.setFont(new Font("Helvetica", Font.ITALIC, 11));
		gender_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gender", "Male", "Female"}));
		gender_comboBox.setBounds(293, 440, 122, 27);
		frmRegisterPage.getContentPane().add(gender_comboBox);
		
		addressTxt = new JTextField();
		addressTxt.setFont(new Font("Helvetica", Font.PLAIN, 12));
		addressTxt.setBounds(101, 485, 320, 26);
		
		addressTxt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (addressTxt.getText().equals("Address")) {
                	addressTxt.setText("");
                	addressTxt.setForeground(Color.BLACK);
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (addressTxt.getText().isEmpty()) {
                	addressTxt.setForeground(Color.GRAY);
                	addressTxt.setText("Address");
                }
            }
        
	});
		
		
		
		frmRegisterPage.getContentPane().add(addressTxt);
		addressTxt.setColumns(10);
		
	    ImageIcon next_btn=new ImageIcon("Libray_Management_System/src/graphs/register_btn.png");
		img = next_btn.getImage();
		temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		next_btn = new ImageIcon(temp);	  
		JButton nextBtn = new JButton(next_btn);
		nextBtn.setContentAreaFilled(false);
		nextBtn.setBorderPainted(false);
		nextBtn.setFocusPainted(false);	
		nextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstnameTxt.getText().equals("First Name*") || firstnameTxt.getText().equals("")|| lnameTxt.getText().equals("Surname*") || lnameTxt.getText().equals("") || txtEmail.getText().equals("E-mail*") || txtEmail.getText().equals("") ||
						phoneNumTxt.getText().equals("Phone Number*") || phoneNumTxt.getText().equals("") || idText.getText().equals("Identification Number*") || idText.getText().equals("") || month_comboBox.getSelectedIndex()==0
						|| day_comboBox.getSelectedIndex()==0 || year_comboBox.getSelectedIndex()==0) {
					WarningPage warning = new WarningPage();
					warning.getFrmWarning().setVisible(true);
			
				}
				else {
					
					String fname = firstnameTxt.getText();
					String lname = lnameTxt.getText();
					String email = txtEmail.getText();
					String phoneNum = phoneNumTxt.getText();
					String id = idText.getText();
					String day = day_comboBox.getSelectedItem().toString();
					String month = month_comboBox.getSelectedItem().toString();
					String year = year_comboBox.getSelectedItem().toString();
					
					String date = day+"/"+month+"/"+year;
					String minit;
					Gender gender;
					String address;
					if (minitTxt.getText()!="M.") {
							minit = minitTxt.getText();
					}
					else {
						 minit = null;
					}
					if(gender_comboBox.getSelectedIndex()!=0) {
						 gender = Gender.MALE;
					}
					else if(gender_comboBox.getSelectedIndex()!=1) {
						 gender = Gender.FEMALE;
					}
					else {
						 gender = null;
					}
					
					if(addressTxt.getSelectedText()!="Address") {
						 address = addressTxt.getSelectedText();
					}
					else {
						 address = null;
					}					
					
					frmRegisterPage.dispose();
					UserFactory factory = new UserFactory(fname,minit,lname,phoneNum,id,date,gender,email,address);
					RegisteredPassword passwordPage = new RegisteredPassword(factory);
					passwordPage.getFrame().setVisible(true);
					
					
				}
					
			}
		});
		nextBtn.setBounds(186, 512, 117, 29);
		frmRegisterPage.getContentPane().add(nextBtn);
		
	    ImageIcon main_btn=new ImageIcon("Libray_Management_System/src/graphs/mainpage_btn.png");
		img = main_btn.getImage();
		temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		main_btn = new ImageIcon(temp);	   
		JButton mainBtn = new JButton(main_btn);
		mainBtn.setContentAreaFilled(false);
		mainBtn.setBorderPainted(false);
		mainBtn.setFocusPainted(false);		
		mainBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRegisterPage.dispose();
				LoginPage login = new LoginPage();
				login.getFrame().setVisible(true);
				
			}
		});
		mainBtn.setBounds(21, 21, 117, 29);
		frmRegisterPage.getContentPane().add(mainBtn);
		
		nameLbl = new JLabel("Name*");
		nameLbl.setForeground(new Color(32, 75, 121));
		nameLbl.setFont(new Font("Helvetica", Font.PLAIN, 11));
		nameLbl.setBounds(101, 280, 61, 16);
		frmRegisterPage.getContentPane().add(nameLbl);
		
		lblM = new JLabel("M.");
		lblM.setForeground(new Color(32, 75, 121));
		lblM.setFont(new Font("Helvetica", Font.PLAIN, 11));
		lblM.setBounds(215, 280, 44, 16);
		frmRegisterPage.getContentPane().add(lblM);
		
		lblSurname = new JLabel("Surname*");
		lblSurname.setForeground(new Color(32, 75, 121));
		lblSurname.setFont(new Font("Helvetica", Font.PLAIN, 11));
		lblSurname.setBounds(265, 280, 61, 16);
		frmRegisterPage.getContentPane().add(lblSurname);
		
		lblPhoneNum = new JLabel("Phone Num*");
		lblPhoneNum.setForeground(new Color(32, 75, 121));
		lblPhoneNum.setFont(new Font("Helvetica", Font.PLAIN, 11));
		lblPhoneNum.setBounds(101, 324, 105, 16);
		frmRegisterPage.getContentPane().add(lblPhoneNum);
		
		lblCitizenId = new JLabel("Citizen ID*");
		lblCitizenId.setForeground(new Color(32, 75, 121));
		lblCitizenId.setFont(new Font("Helvetica", Font.PLAIN, 11));		
		lblCitizenId.setBounds(265, 324, 89, 16);
		frmRegisterPage.getContentPane().add(lblCitizenId);
		
		lblEmail = new JLabel("E-mail*");
		lblEmail.setForeground(new Color(32, 75, 121));
		lblEmail.setFont(new Font("Helvetica", Font.PLAIN, 11));
		lblEmail.setBounds(101, 425, 61, 16);
		frmRegisterPage.getContentPane().add(lblEmail);
		
		lblAddress = new JLabel("Address");
		lblAddress.setForeground(new Color(32, 75, 121));
		lblAddress.setFont(new Font("Helvetica", Font.PLAIN, 11));
		lblAddress.setBounds(101, 472, 61, 16);
		frmRegisterPage.getContentPane().add(lblAddress);
		
	    ImageIcon login_btn=new ImageIcon("Libray_Management_System/src/graphs/loginpage_btn.png");
		img = login_btn.getImage();
		temp = img.getScaledInstance(124, 121, Image.SCALE_SMOOTH);
		login_btn = new ImageIcon(temp);	   
		
		JButton loginBtn = new JButton(login_btn);
		loginBtn.setContentAreaFilled(false);
		loginBtn.setBorderPainted(false);
		loginBtn.setFocusPainted(false);	
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRegisterPage.dispose();
				RegisteredLogin login = new RegisteredLogin();
				login.getFrame().setVisible(true);
			}
		});
		loginBtn.setBounds(150, 21, 124, 29);
		frmRegisterPage.getContentPane().add(loginBtn);
		
		JLabel back=new JLabel(background);
		back.setBounds(0,0,500,600);
		frmRegisterPage.getContentPane().add(back);
		
		
		
	}
	
	

	public JFrame getFrame() {
		return frmRegisterPage;
	}
}
