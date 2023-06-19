package Online_Resume_Builder;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.sql.Connection;
import javax.swing.SwingConstants;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
//**********
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class resume {

	 JFrame frameR;
	 JLabel firstname;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resume window = new resume();
					window.frameR.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	//**************
	
	//***************
	
	

	/**
	 * Create the application.
	 */
	Connection connection=null;
	public resume() {
		connection=DataBaseConnectivity.dbconnector();
		initialize();
	}	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameR = new JFrame();
		frameR.getContentPane().setBackground(new Color(202, 188, 181));
		frameR.getContentPane().addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		frameR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frameR.setBounds(100, 100, 1425, 767);
		frameR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameR.getContentPane().setLayout(null);
		
		firstname = new JLabel("fn");
		firstname.setBounds(625, 10, 201, 49);
		frameR.getContentPane().add(firstname);
		firstname.setFont(new Font("Dialog", Font.PLAIN, 40));
		firstname.setText(Fill_Details.TF1.getText());
		
		
		JLabel surname = new JLabel("sn");
		surname.setBounds(821, 11, 201, 47);
		surname.setFont(new Font("Dialog", Font.PLAIN, 40));
		frameR.getContentPane().add(surname);
		surname.setText(Fill_Details.TF2.getText());
		
		JLabel l1 = new JLabel("______________________________________________________________________________________________________________________________________________________________________________________________________");
		l1.setBounds(10, 58, 1401, 13);
		frameR.getContentPane().add(l1);
		
		JLabel lblNewLabel_1 = new JLabel("_______________________________________________________________________________");
		lblNewLabel_1.setBounds(998, 58, 606, 13);
		frameR.getContentPane().add(lblNewLabel_1);
		
		JLabel l5 = new JLabel("EDUCATION DETAILS");
		l5.setBounds(1059, 91, 303, 61);
		l5.setFont(new Font("Tahoma", Font.BOLD, 26));
		frameR.getContentPane().add(l5);
		
		JLabel l6 = new JLabel("____________________________________________________________");
		l6.setBounds(1059, 139, 545, 13);
		frameR.getContentPane().add(l6);
		
		JLabel l9 = new JLabel("<html><b><u>Schooling</u></b></html>\r\n\r\n");
		l9.setBounds(1069, 162, 163, 28);
		l9.setFont(new Font("Tahoma", Font.BOLD, 18));
		frameR.getContentPane().add(l9);
		
		JLabel l11 = new JLabel("10\r\n");
		l11.setBounds(1078, 190, 34, 28);
		l11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frameR.getContentPane().add(l11);
		
		JLabel l12 = new JLabel("CGPA = ");
		l12.setBounds(1123, 242, 86, 28);
		l12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frameR.getContentPane().add(l12);
		
		JLabel l13 = new JLabel("_______________________________________________________");
		l13.setBounds(1059, 268, 352, 13);
		l13.setFont(new Font("Tahoma", Font.BOLD, 10));
		frameR.getContentPane().add(l13);
		
		JLabel l14 = new JLabel("12");
		l14.setBounds(1078, 280, 34, 28);
		l14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frameR.getContentPane().add(l14);
		
		JLabel l15 = new JLabel("CGPA = ");
		l15.setBounds(1123, 327, 86, 28);
		l15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frameR.getContentPane().add(l15);
		
		JLabel l54 = new JLabel("<html><b><u>Colleging</u></b></html>");
		l54.setBounds(1069, 365, 163, 28);
		l54.setFont(new Font("Tahoma", Font.BOLD, 18));
		frameR.getContentPane().add(l54);
		
		JLabel l19 = new JLabel("SGPA =");
		l19.setBounds(1123, 420, 86, 28);
		l19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frameR.getContentPane().add(l19);
		
		JLabel l17 = new JLabel("_______________________________________________________");
		l17.setBounds(1059, 351, 352, 13);
		l17.setFont(new Font("Tahoma", Font.BOLD, 10));
		frameR.getContentPane().add(l17);
		
		JLabel l2 = new JLabel("PROJECTS");
		l2.setBounds(713, 91, 275, 61);
		l2.setFont(new Font("Tahoma", Font.BOLD, 26));
		frameR.getContentPane().add(l2);
		
		JLabel l34 = new JLabel("_______________________________");
		l34.setBounds(707, 139, 545, 13);
		frameR.getContentPane().add(l34);
		
		JLabel l45 = new JLabel("WORK EXPERIENCE");
		l45.setBounds(667, 374, 275, 61);
		l45.setFont(new Font("Tahoma", Font.BOLD, 26));
		frameR.getContentPane().add(l45);
		
		JLabel l67 = new JLabel("_________________________________________________________");
		l67.setBounds(657, 417, 545, 13);
		frameR.getContentPane().add(l67);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("_______________________________________________________________________");
		lblNewLabel_2_2_1.setBounds(615, 365, 422, 13);
		frameR.getContentPane().add(lblNewLabel_2_2_1);
		
		JLabel l21 = new JLabel("SKILLS");
		l21.setBounds(205, 460, 275, 61);
		l21.setFont(new Font("Tahoma", Font.BOLD, 26));
		frameR.getContentPane().add(l21);
		
		JLabel l22 = new JLabel("________________________");
		l22.setBounds(195, 501, 545, 13);
		frameR.getContentPane().add(l22);
		
		JLabel l23 = new JLabel("PROFILE");
		l23.setBounds(201, 101, 275, 61);
		l23.setFont(new Font("Tahoma", Font.BOLD, 26));
		frameR.getContentPane().add(l23);
		
		JLabel l24 = new JLabel("________________________");
		l24.setBounds(195, 139, 545, 13);
		frameR.getContentPane().add(l24);
		
		JLabel l44 = new JLabel("<html><b><u>CONTACT ME</u></b></html>");
		l44.setBounds(152, 341, 163, 28);
		l44.setFont(new Font("Tahoma", Font.BOLD, 18));
		frameR.getContentPane().add(l44);
		
		JLabel schoolname_10 = new JLabel("sn10");
		schoolname_10.setBounds(1069, 215, 208, 28);
		frameR.getContentPane().add(schoolname_10);
		schoolname_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		schoolname_10.setText(Fill_Details.TF15.getText());
		
		JLabel cgpa_10 = new JLabel("cgpa10");
		cgpa_10.setBounds(1190, 242, 129, 28);
		frameR.getContentPane().add(cgpa_10);
		cgpa_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cgpa_10.setText(Fill_Details.TF16.getText());
		
		JLabel schoolname_12 = new JLabel("sn12");
		schoolname_12.setBounds(1078, 304, 208, 28);
		frameR.getContentPane().add(schoolname_12);
		schoolname_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		schoolname_12.setText(Fill_Details.TF17.getText());
		
		JLabel cgpa_12 = new JLabel("cgpa12");
		cgpa_12.setBounds(1190, 327, 129, 28);
		frameR.getContentPane().add(cgpa_12);
		cgpa_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cgpa_12.setText(Fill_Details.TF18.getText());
		
		JLabel collegename = new JLabel("cn");
		collegename.setBounds(1069, 393, 208, 28);
		frameR.getContentPane().add(collegename);
		collegename.setFont(new Font("Tahoma", Font.PLAIN, 18));
		collegename.setText(Fill_Details.TF13.getText());
		
		JLabel sgpa = new JLabel("sgpa");
		sgpa.setBounds(1190, 420, 129, 28);
		frameR.getContentPane().add(sgpa);
		sgpa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sgpa.setText(Fill_Details.TF14.getText());
		
		JLabel workexperience = new JLabel("we");
		workexperience.setBounds(605, 443, 413, 277);
		frameR.getContentPane().add(workexperience);
		workexperience.setVerticalAlignment(SwingConstants.TOP);
		workexperience.setFont(new Font("Tahoma", Font.PLAIN, 18));
		workexperience.setText(Fill_Details.TF19.getText());
		
		JLabel projects = new JLabel("p");
		projects.setBounds(605, 165, 384, 202);
		frameR.getContentPane().add(projects);
		projects.setVerticalAlignment(SwingConstants.TOP);
		projects.setFont(new Font("Tahoma", Font.PLAIN, 18));
		projects.setText(Fill_Details.TF12.getText());
		
		JLabel skills = new JLabel("s");
		skills.setBounds(128, 524, 352, 176);
		frameR.getContentPane().add(skills);
		skills.setVerticalAlignment(SwingConstants.TOP);
		skills.setFont(new Font("Tahoma", Font.PLAIN, 18));
		skills.setText(Fill_Details.TF11.getText());
		
		JLabel email = new JLabel("e");
		email.setBounds(152, 440, 231, 28);
		frameR.getContentPane().add(email);
		email.setFont(new Font("Tahoma", Font.PLAIN, 18));
		email.setText(Fill_Details.TF10.getText());
		
		JLabel contact = new JLabel("c");
		contact.setBounds(152, 393, 231, 28);
		frameR.getContentPane().add(contact);
		contact.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contact.setText(Fill_Details.TF9.getText());
		
		JLabel firstname_2 = new JLabel("fn2");
		firstname_2.setBounds(145, 162, 100, 28);
		frameR.getContentPane().add(firstname_2);
		firstname_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		firstname_2.setText(Fill_Details.TF1.getText());
		
		JLabel surname_2 = new JLabel("sn2");
		surname_2.setBounds(238, 162, 100, 28);
		frameR.getContentPane().add(surname_2);
		surname_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		surname_2.setText(Fill_Details.TF2.getText());
		
		JLabel dob = new JLabel("dob");
		dob.setBounds(142, 190, 163, 28);
		frameR.getContentPane().add(dob);
		dob.setFont(new Font("Tahoma", Font.PLAIN, 18));
		dob.setText(Fill_Details.TF3.getText());
		
		JLabel gender = new JLabel("g");
		gender.setBounds(142, 215, 163, 28);
		frameR.getContentPane().add(gender);
		gender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		gender.setText(Fill_Details.TF4.getText());
		
		JLabel nationality = new JLabel("n");
		nationality.setBounds(142, 242, 163, 28);
		frameR.getContentPane().add(nationality);
		nationality.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nationality.setText(Fill_Details.TF7.getText());
		
		JLabel languageknown = new JLabel("lk");
		languageknown.setBounds(142, 268, 163, 28);
		frameR.getContentPane().add(languageknown);
		languageknown.setFont(new Font("Tahoma", Font.PLAIN, 18));
		languageknown.setText(Fill_Details.TF8.getText());
		
		JLabel address = new JLabel("a");
		address.setBounds(145, 292, 163, 28);
		frameR.getContentPane().add(address);
		address.setFont(new Font("Tahoma", Font.PLAIN, 18));
		address.setText(Fill_Details.TF5.getText());
		
		JButton btnNewButton = new JButton("DOWNLOAD");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            Thread.sleep(1000);
		        } catch (InterruptedException e3) {
		            e3.printStackTrace();
		        }

		        // Capture screenshot
		        try {
		            Robot robot = new Robot();
		            BufferedImage screenshot = robot.createScreenCapture(frameR.getBounds());

		            // Save the screenshot to an image file
		            File output = new File("RESUME.png");
		            ImageIO.write(screenshot, "png", output);

		            System.out.println("Screenshot saved successfully.");
		        } catch (Exception e4) {
		            e4.printStackTrace();
		        }

		        // Close the JFrame
		        frameR.dispose();
		    

			}
		});
		btnNewButton.setBounds(1214, 631, 163, 49);
		frameR.getContentPane().add(btnNewButton);
	}
}
