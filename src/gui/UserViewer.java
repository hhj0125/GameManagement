package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserViewer extends JPanel {
	
	WindowFrame frame;
	
	
	public UserViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Job");
		model.addColumn("Lv");
		model.addColumn("Phone");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
	this.add(sp);
}

}
