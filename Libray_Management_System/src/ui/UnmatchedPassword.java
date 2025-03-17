package ui;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import system.UserFactory;

public class UnmatchedPassword {

	private JFrame frmWarning;
	private UserFactory factory;


	public UnmatchedPassword(UserFactory factory) {
		initialize();
		this.factory = factory;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWarning = new JFrame();
		frmWarning.setTitle("WARNING");
		frmWarning.setType(Type.POPUP);
		frmWarning.setBounds(500, 250, 450, 170);
		frmWarning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWarning.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Passwords do not match. Please enter your password again");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 70, 438, 16);
		frmWarning.getContentPane().add(lblNewLabel);
		
		JButton okBtn = new JButton("OK");
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWarning.dispose();
				RegisteredPassword register = new RegisteredPassword(factory);
				register.getFrame().setVisible(true);
			}
		});
		okBtn.setBounds(165, 98, 117, 29);
		frmWarning.getContentPane().add(okBtn);
        ImageIcon icon = new ImageIcon(new ImageIcon("Libray_Management_System/src/graphs/warningImage.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));    
        JLabel warningImg = new JLabel(icon);
        warningImg.setBounds(134, 2, 168, 64);
        frmWarning.getContentPane().add(warningImg);
        
	}

	public JFrame getFrame() {
		return frmWarning;
	}

}
