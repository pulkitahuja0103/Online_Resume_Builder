package Online_Resume_Builder;
import java.sql.*;


import javax.swing.*;


import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Login_Page extends JFrame{

	JFrame frame1;

	public void close() {
		WindowEvent closeWindow=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page window = new Login_Page();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connection=null;
	
	
	
	
	private JTextField textFieldUN;
	private JPasswordField passwordField;
	
	public Login_Page() {
		
		initialize();
		
		connection=DataBaseConnectivity.dbconnector();
		
	}

	
	private void initialize() {
		

		
		
		frame1 = new JFrame();
		frame1.getContentPane().setBackground(new Color(202, 188, 181));
		frame1.setBackground(new Color(255, 255, 255));
//		frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame1.setBounds(100, 100, 938, 652);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setBounds(128, 188, 261, 75);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		frame1.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(128, 307, 261, 75);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		frame1.getContentPane().add(lblNewLabel_1);
		
		textFieldUN = new JTextField();
		textFieldUN.setBounds(397, 188, 354, 75);
		frame1.getContentPane().add(textFieldUN);
		textFieldUN.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(401, 307, 350, 75);
		frame1.getContentPane().add(passwordField);
		
		JButton btnlogin = new JButton("LOGIN");
		btnlogin.setBounds(382, 467, 96, 61);
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String query="select *from user_data where username=? and password=? ";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textFieldUN.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next()) {
						count++;
					}
					
					
					if(count==1) {
						JOptionPane.showMessageDialog(null, "CORRECT");
						
						Fill_Details fd=new Fill_Details();
						fd.frameFD.setVisible(true);
						frame1.dispose();
						
					}
					else if(count>1) {
						JOptionPane.showMessageDialog(null, "DUPLICATE");
					}
					else {
						JOptionPane.showMessageDialog(null, "INCORRECT");
					}
					rs.close();
					pst.close();
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		frame1.getContentPane().add(btnlogin);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBounds(806, 531, 85, 49);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Front_Page fp=new Front_Page();
				fp.frameFP.setVisible(true);
				frame1.dispose();
			}
		});
		frame1.getContentPane().add(btnNewButton);
	}
}
