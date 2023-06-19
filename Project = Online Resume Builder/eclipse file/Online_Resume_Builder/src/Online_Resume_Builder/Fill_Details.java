package Online_Resume_Builder;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Fill_Details {

	 JFrame frameFD;
	 public static JTextField TF1;
	 public static JTextField TF2;
	 public static JTextField TF3;
	 public static JTextField TF4;
	 public static JTextField TF5;
	 public static JTextField TF6;
	 public static JTextField TF7;
	 public static JTextField TF8;
	 public static JTextField TF9;
	 public static JTextField TF10;
	 public static JTextField TF11;
	 public static JTextField TF12;
	 public static JTextField TF13;
	 public static JTextField TF14;
	 public static JTextField TF15;
	 public static JTextField TF17;
	 public static JTextField TF16;
	 public static JTextField TF18;
	 public static JTextField TF19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fill_Details window = new Fill_Details();
					window.frameFD.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection connection=null;
	public Fill_Details() {
		connection=DataBaseConnectivity.dbconnector();
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameFD = new JFrame();
		frameFD.getContentPane().setBackground(new Color(202, 188, 181));
//		frameFD.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frameFD.setBounds(100, 100, 1034, 631);
		frameFD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameFD.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html><u><b>Fill Details Of Your Resume</b></u></html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(319, 10, 392, 58);
		frameFD.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FIRST NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(44, 117, 96, 25);
		frameFD.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SURNAME");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(44, 152, 96, 23);
		frameFD.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("DOB");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(44, 185, 96, 22);
		frameFD.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("GENDER");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(44, 217, 96, 20);
		frameFD.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("ADDRESS");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(44, 247, 95, 22);
		frameFD.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("MARITAL STATUS");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_5.setBounds(360, 117, 145, 13);
		frameFD.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("NATIONALITY");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_6.setBounds(360, 152, 145, 13);
		frameFD.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_8 = new JLabel("CONTACT");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_8.setBounds(360, 217, 145, 13);
		frameFD.getContentPane().add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("EMAIL");
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_9.setBounds(360, 247, 145, 13);
		frameFD.getContentPane().add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("LANGUAGE KNOWN");
		lblNewLabel_1_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_10.setBounds(360, 185, 145, 13);
		frameFD.getContentPane().add(lblNewLabel_1_10);
		
		TF1 = new JTextField();
		TF1.setBounds(170, 114, 95, 28);
		frameFD.getContentPane().add(TF1);
		TF1.setColumns(10);
		
		TF2 = new JTextField();
		TF2.setColumns(10);
		TF2.setBounds(169, 149, 96, 26);
		frameFD.getContentPane().add(TF2);
		
		TF3 = new JTextField();
		TF3.setColumns(10);
		TF3.setBounds(169, 182, 96, 25);
		frameFD.getContentPane().add(TF3);
		
		TF4 = new JTextField();
		TF4.setColumns(10);
		TF4.setBounds(169, 214, 96, 23);
		frameFD.getContentPane().add(TF4);
		
		TF5 = new JTextField();
		TF5.setColumns(10);
		TF5.setBounds(169, 244, 96, 25);
		frameFD.getContentPane().add(TF5);
		
		TF6 = new JTextField();
		TF6.setColumns(10);
		TF6.setBounds(515, 112, 96, 28);
		frameFD.getContentPane().add(TF6);
		
		TF7 = new JTextField();
		TF7.setColumns(10);
		TF7.setBounds(515, 148, 96, 26);
		frameFD.getContentPane().add(TF7);
		
		TF8 = new JTextField();
		TF8.setColumns(10);
		TF8.setBounds(517, 182, 94, 25);
		frameFD.getContentPane().add(TF8);
		
		TF9 = new JTextField();
		TF9.setColumns(10);
		TF9.setBounds(515, 214, 96, 23);
		frameFD.getContentPane().add(TF9);
		
		TF10 = new JTextField();
		TF10.setColumns(10);
		TF10.setBounds(515, 244, 96, 25);
		frameFD.getContentPane().add(TF10);
		
		JLabel lblNewLabel_2 = new JLabel("SKILLS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(44, 319, 154, 35);
		frameFD.getContentPane().add(lblNewLabel_2);
		
		TF11 = new JTextField();
		TF11.setBounds(38, 364, 194, 49);
		frameFD.getContentPane().add(TF11);
		TF11.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("PROJECTS");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2_1.setBounds(38, 435, 145, 29);
		frameFD.getContentPane().add(lblNewLabel_2_1);
		
		TF12 = new JTextField();
		TF12.setColumns(10);
		TF12.setBounds(38, 474, 194, 83);
		frameFD.getContentPane().add(TF12);
		
		JLabel lblNewLabel_2_2 = new JLabel("<html><u>EDUCATION DETAILS</u></html>");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(752, 98, 186, 20);
		frameFD.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_7 = new JLabel("COLLEGE NAME");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_7.setBounds(623, 131, 149, 13);
		frameFD.getContentPane().add(lblNewLabel_1_7);
		
		TF13 = new JTextField();
		TF13.setColumns(10);
		TF13.setBounds(790, 128, 96, 19);
		frameFD.getContentPane().add(TF13);
		
		JLabel lblNewLabel_1_11 = new JLabel("SGPA");
		lblNewLabel_1_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_11.setBounds(890, 131, 56, 13);
		frameFD.getContentPane().add(lblNewLabel_1_11);
		
		TF14 = new JTextField();
		TF14.setColumns(10);
		TF14.setBounds(956, 131, 54, 19);
		frameFD.getContentPane().add(TF14);
		
		JLabel lblNewLabel_1_12 = new JLabel("SCHOOL NAME(10)");
		lblNewLabel_1_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_12.setBounds(623, 178, 149, 13);
		frameFD.getContentPane().add(lblNewLabel_1_12);
		
		TF15 = new JTextField();
		TF15.setColumns(10);
		TF15.setBounds(790, 175, 96, 19);
		frameFD.getContentPane().add(TF15);
		
		JLabel lblNewLabel_1_14 = new JLabel("SCHOOL NAME(12)");
		lblNewLabel_1_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_14.setBounds(623, 217, 149, 13);
		frameFD.getContentPane().add(lblNewLabel_1_14);
		
		TF17 = new JTextField();
		TF17.setColumns(10);
		TF17.setBounds(790, 214, 96, 19);
		frameFD.getContentPane().add(TF17);
		
		JLabel lblNewLabel_1_11_1 = new JLabel("CGPA(10)");
		lblNewLabel_1_11_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_11_1.setBounds(890, 178, 56, 13);
		frameFD.getContentPane().add(lblNewLabel_1_11_1);
		
		TF16 = new JTextField();
		TF16.setColumns(10);
		TF16.setBounds(956, 172, 54, 19);
		frameFD.getContentPane().add(TF16);
		
		JLabel lblNewLabel_1_11_2 = new JLabel("CGPA(12)");
		lblNewLabel_1_11_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_11_2.setBounds(890, 214, 56, 13);
		frameFD.getContentPane().add(lblNewLabel_1_11_2);
		
		TF18 = new JTextField();
		TF18.setColumns(10);
		TF18.setBounds(956, 208, 54, 19);
		frameFD.getContentPane().add(TF18);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("WORK EXPERIENCE");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2_1_1.setBounds(327, 330, 245, 35);
		frameFD.getContentPane().add(lblNewLabel_2_1_1);
		
		TF19 = new JTextField();
		TF19.setColumns(10);
		TF19.setBounds(327, 375, 299, 182);
		frameFD.getContentPane().add(TF19);
		
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGOUT");
				Front_Page fp=new Front_Page();
				fp.frameFP.setVisible(true);
				frameFD.dispose();
			}
		});
		btnNewButton.setBounds(888, 10, 110, 58);
		frameFD.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("SAVE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String query="insert into details (firstname,surname,dob,gender,address,maritalstatus,nationality,languageknown,contact,email,skills,projects,collegename,sgpa,schoolname_10,cgpa_10,schoolname_12,cgpa_12,workexperience) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1,TF1.getText());
					pst.setString(2,TF2.getText());
					pst.setString(3,TF3.getText());
					pst.setString(4,TF4.getText());
					pst.setString(5,TF5.getText());
					pst.setString(6,TF6.getText());
					pst.setString(7,TF7.getText());
					pst.setString(8,TF8.getText());
					pst.setString(9,TF9.getText());
					pst.setString(10,TF10.getText());
					pst.setString(11,TF11.getText());
					pst.setString(12,TF12.getText());
					pst.setString(13,TF13.getText());
					pst.setString(14,TF14.getText());
					pst.setString(15,TF15.getText());
					pst.setString(16,TF16.getText());
					pst.setString(17,TF17.getText());
					pst.setString(18,TF18.getText());
					pst.setString(19,TF19.getText());
					
					pst.execute();
					JOptionPane.showMessageDialog(null, "DATA SAVED");
					
					pst.close(); 

					
					
					
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
				
				
				
			}	
		});
		btnNewButton_2.setBounds(831, 426, 127, 58);
		frameFD.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("CREATE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resume r=new resume();
				r.frameR.setVisible(true);
				frameFD.dispose();
			}
		});
		btnNewButton_1.setBounds(831, 499, 127, 58);
		frameFD.getContentPane().add(btnNewButton_1);
	}
}
