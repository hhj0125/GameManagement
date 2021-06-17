package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	
	UserManager userManager;

	MenuSelection menuselection;
	UserAdder useradder;
	UserViewer userviewer;

	public WindowFrame(UserManager userManager) {
		this.setSize(500, 300); // ������ ���� 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X������ ���α׷� ����
		this.setTitle("My Frame");
		
		this.userManager = userManager;
		menuselection = new MenuSelection(this);
		useradder = new UserAdder(this, this.userManager);
		userviewer = new UserViewer(this, this.userManager);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true); // ���̰�����
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	
	
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public UserAdder getUseradder() {
		return useradder;
	}

	public UserViewer getUserviewer() {
		return userviewer;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public void setUseradder(UserAdder useradder) {
		this.useradder = useradder;
	}

	public void setUserviewer(UserViewer userviewer) {
		this.userviewer = userviewer;
	}

}
