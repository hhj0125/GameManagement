package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import User.Adult;
import User.UserInput;
import User.UserKind;

class UserAdderListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldJob;
	JTextField fieldLv;
	JTextField fieldPhone;
	
	UserManager userManager;
	
	public UserAdderListener(
			JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldJob, 
			JTextField fieldLv,
			JTextField fieldPhone, UserManager userManager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldJob = fieldJob;
		this.fieldLv = fieldLv;
		this.fieldPhone = fieldPhone;
		this.userManager = userManager;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		UserInput user = new Adult(UserKind.Adult);
		
		user.setId(Integer.parseInt(fieldID.getText()));
		user.setName(fieldName.getName());
		user.setJob(fieldJob.getText());
		user.setLv(Integer.parseInt(fieldLv.getText()));
		user.setPhone(Integer.parseInt(fieldPhone.getText()));
		userManager.addUser(user);
		putObject(userManager, "usermanager.ser");
		user.printInfo();
		}
	
	public static void putObject(UserManager userManager, String filename) {
		   try { 
			   FileOutputStream file = new FileOutputStream(filename);
		       ObjectOutputStream out = new ObjectOutputStream(file);
		       
		       out.writeObject(userManager);
		       
		       out.close();
		       file.close();
		       
		       
	   } catch (FileNotFoundException e) {
		   e.printStackTrace();
	   
	   } catch (IOException e) {
		   e.printStackTrace();
	   }
		   
	   
	}
		
}


