package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	

	MenuSelection menuselection;
	UserAdder useradder;
	UserViewer userviewer;
	UserManager userManager;

	
	public WindowFrame() {
		this.setSize(500, 300); // 사이즈 설정 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X누르면 프로그램 종료
		this.setTitle("My Frame");
		
		menuselection = new MenuSelection(this);
		useradder = new UserAdder(this);
		userviewer = new UserViewer(this);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true); // 보이게해줌
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
