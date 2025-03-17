package ui;

import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

public class WarningPage {

	private JFrame frmWarning;


	public WarningPage() {
		initialize();
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
		
		JLabel lblNewLabel = new JLabel("* marked fields cannot be left empty. Please check again.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 70, 438, 16);
		frmWarning.getContentPane().add(lblNewLabel);
		
		JButton okBtn = new JButton("OK");
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWarning.dispose();
			}
		});
		okBtn.setBounds(165, 98, 117, 29);
		frmWarning.getContentPane().add(okBtn);
        ImageIcon icon = new ImageIcon(new ImageIcon("Libray_Management_System/src/graphs/warningImage.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));    
        JLabel warningImg = new JLabel(icon);
        warningImg.setBounds(134, 2, 168, 64);
        frmWarning.getContentPane().add(warningImg);
        
	}

	public JFrame getFrmWarning() {
		return frmWarning;
	}
	

}
