package gui;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {
	
	public MenuSelection() {
		this.setSize(300, 300); // 사이즈 설정 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X누르면 프로그램 종료
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add User");
		JButton button2 = new JButton("Delete User");
		JButton button3 = new JButton("Edit User");
		JButton button4 = new JButton("View User");
		JButton button5 = new JButton("Exit");
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.setVisible(true); // 보이게해줌
	}

}
