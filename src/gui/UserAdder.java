package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listners.UserAdderCancelListener;

public class UserAdder extends JPanel {
	
	WindowFrame frame;
	UserManager userManager;
	
	public UserAdder(WindowFrame frame, UserManager userManager) {
		this.frame = frame;
		this.userManager = userManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelJob = new JLabel("Job: ", JLabel.TRAILING);
		JTextField fieldJob = new JTextField(10);
		labelJob.setLabelFor(fieldJob);
		panel.add(labelJob);
		panel.add(fieldJob);
		
		JLabel labelLv = new JLabel("Lv: ", JLabel.TRAILING);
		JTextField fieldLv = new JTextField(10);
		labelLv.setLabelFor(fieldLv);
		panel.add(labelLv);
		panel.add(fieldLv);
		
		JLabel labelPhone = new JLabel("Phone: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new UserAdderListener(fieldID, fieldName, fieldJob, fieldLv, fieldPhone, userManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new UserAdderCancelListener(frame));
		
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}

}
