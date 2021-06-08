package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import User.UserInput;

public class UserViewer extends JPanel {
	
	WindowFrame frame;
	
	UserManager userManager;
	
	
	public UserViewer(WindowFrame frame, UserManager userManager) {
		this.frame = frame;
		this.userManager = userManager;
		
		System.out.println("***" + userManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Job");
		model.addColumn("Lv");
		model.addColumn("Phone");
		model.addColumn("Day");
		
		for(int i=0; i< userManager.size(); i++) {
			Vector row = new Vector();
			UserInput ui = (UserInput) userManager.get(i);
			row.add(ui.getId());
			row.add(ui.getName());
			row.add(ui.getJob());
			row.add(ui.getLv());
			row.add(ui.getPhone());
			row.add(ui.getDay());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
	this.add(sp);
}

}
