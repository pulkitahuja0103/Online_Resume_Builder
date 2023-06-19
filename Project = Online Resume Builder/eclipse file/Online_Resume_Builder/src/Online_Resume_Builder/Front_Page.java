package Online_Resume_Builder;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Image;
import javax.swing.SwingConstants;

public class Front_Page {

	 JFrame frameFP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Front_Page window = new Front_Page();
					window.frameFP.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Front_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameFP = new JFrame();
		frameFP.getContentPane().setBackground(new Color(202, 188, 181));
//		frameFP.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frameFP.setBounds(100, 100, 942, 647);
		frameFP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameFP.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login_Page lp=new Login_Page();
				lp.frame1.setVisible(true);
				frameFP.dispose();
				
			}
		});
		btnNewButton.setBounds(296, 499, 118, 56);
		frameFP.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sign_Up_Page sup=new Sign_Up_Page();
				sup.frameSP.setVisible(true);
				frameFP.dispose();
			}
		});
		btnNewButton_1.setBounds(483, 499, 118, 56);
		frameFP.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnNewButton_2.setBounds(763, 499, 106, 56);
		frameFP.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("ONLINE RESUME BUILDER");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 46));
		lblNewLabel.setBounds(103, 31, 722, 118);
		frameFP.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("___________________________________________________________________________________________________________________________________________________________");
		lblNewLabel_1.setBounds(52, 118, 876, 13);
		frameFP.getContentPane().add(lblNewLabel_1);
		
		JLabel img = new JLabel("");
		img.setBounds(52, 172, 350, 292);
		frameFP.getContentPane().add(img);
		Image image=new ImageIcon(this.getClass().getResource("/resume.png")).getImage();
		Image image1 = image.getScaledInstance(350, 350, Image.SCALE_DEFAULT);
		img.setIcon(new ImageIcon(image1));
		
		JLabel lblNewLabel_2 = new JLabel("<html> YOUR RESUME SAYS <B> A LOT </B> ABOUT <B> YOU , </B> IT <B> DETERMINES </B> WHETHER YOU WILL BE CALLED <B> IN </B> OR <B> NOT .</B></html>");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setBounds(457, 222, 318, 161);
		frameFP.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<HTML><B><U>BY- PULKIT AHUJA</U></B></HTML>");
		lblNewLabel_3.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(731, 565, 187, 36);
		frameFP.getContentPane().add(lblNewLabel_3);
	}
}
