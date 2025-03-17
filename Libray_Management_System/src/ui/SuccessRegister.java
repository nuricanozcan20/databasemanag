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

public class SuccessRegister {

	private JFrame frame;
	private String libID;


	public SuccessRegister(String id) {
		this.libID = id;
		initialize();
	}
		private void initialize() {
			frame = new JFrame();
			frame.setTitle("SUCCESS");
			frame.setType(Type.POPUP);
			frame.setBounds(500, 250, 450, 220);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("You successfully registered.");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(6, 70, 438, 16);
			frame.getContentPane().add(lblNewLabel);
			
			JButton okBtn = new JButton("OK");
			okBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					LoginPage login = new LoginPage();
					login.getFrame().setVisible(true);
				}
			});
			okBtn.setBounds(165, 157, 117, 29);
			frame.getContentPane().add(okBtn);
	        ImageIcon icon = new ImageIcon(new ImageIcon("Libray_Management_System/src/graphs/successImage.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));    
	        JLabel warningImg = new JLabel(icon);
	        warningImg.setBounds(134, 2, 168, 64);
	        frame.getContentPane().add(warningImg);
	        
	        JLabel lblNewLabel_1 = new JLabel("Please note your LIB ID below. You will be redirected to login page.");
	        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_1.setBounds(6, 98, 438, 16);
	        frame.getContentPane().add(lblNewLabel_1);
	        
	        JLabel lblNewLabel_2 = new JLabel("YOUR LIB ID:");
	        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_2.setBounds(6, 126, 117, 16);
	        frame.getContentPane().add(lblNewLabel_2);
	        
	        JLabel idLbl = new JLabel();
	        idLbl.setText(libID);
	        idLbl.setHorizontalAlignment(SwingConstants.LEFT);
	        idLbl.setBounds(135, 126, 309, 16);
	        frame.getContentPane().add(idLbl);
	        
		}

		public JFrame getFrame() {
			return frame;
		}
}
