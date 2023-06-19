package Online_Resume_Builder;

import java.awt.EventQueue;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Sign_Up_Page {

	JFrame frameSP;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign_Up_Page window = new Sign_Up_Page();
					window.frameSP.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public Sign_Up_Page() {
		initialize();
	}

	
	
	Connection connection=null;
	private void initialize() {
		frameSP = new JFrame();
		frameSP.getContentPane().setBackground(new Color(202, 188, 181));
//		frameSP.setExtendedState(JFrame.NORMAL);
		frameSP.setBounds(100, 100, 976, 649);
		frameSP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		connection=DataBaseConnectivity.dbconnector();

		frameSP.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(211, 163, 241, 61);
		frameSP.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1.setBounds(211, 232, 241, 61);
		frameSP.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_2.setBounds(211, 303, 241, 57);
		frameSP.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_3.setBounds(211, 370, 241, 53);
		frameSP.getContentPane().add(lblNewLabel_3);
		
		textField1 = new JTextField();
		textField1.setBounds(482, 163, 252, 64);
		frameSP.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(482, 235, 252, 61);
		frameSP.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(482, 303, 252, 60);
		frameSP.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBounds(482, 369, 252, 57);
		frameSP.getContentPane().add(textField4);
		textField4.setColumns(10);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String query="insert into user_data (firstname,lastname,username,password) values (?,?,?,?)";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1,textField1.getText());
					pst.setString(2,textField2.getText());
					pst.setString(3,textField3.getText());
					pst.setString(4,textField4.getText());
					
					pst.execute();
					JOptionPane.showMessageDialog(null, "DATA SAVED");
					
					pst.close(); 
					
					Front_Page fp=new Front_Page();
					fp.frameFP.setVisible(true);
					frameSP.dispose();
					
					
					
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
					
				
				}
				
				
			}
		});
		btnNewButton.setBounds(422, 484, 124, 61);
		frameSP.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Front_Page fp=new Front_Page();
					fp.frameFP.setVisible(true);
					frameSP.dispose();
			
			}
		});
		btnNewButton_1.setBounds(838, 527, 96, 61);
		frameSP.getContentPane().add(btnNewButton_1);
	}
	}


