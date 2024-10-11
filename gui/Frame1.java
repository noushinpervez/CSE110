package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame1 implements ActionListener {
	JFrame frame = new JFrame("CSE110 Mini Project");
	
	JButton button = new JButton("NEXT BUTTON");
	
	JLabel Course = new JLabel("<html>CSE110 Object Oriented Programming</html>");
	JLabel G = new JLabel("Group 4");
	JLabel Group = new JLabel("<html>Abu Saleh Rafi 2020-1-60-136<br>Md. Samiul Islam 2020-1-60-168<br>Noushin Pervez 2020-1-60-189</html>");
	JLabel Responsibility = new JLabel("Responsibility Info");
	JLabel Info = new JLabel("<html>GUI - Abu Saleh Rafi<br>Database - Md. Samiul Islam<br>Program - Noushin Pervez</html>");
	
	public Frame1() {
		button.setBounds(1300, 550, 200, 50);
		button.setFocusable(false);
		button.addActionListener(this);
		
		Course.setBounds(550, 100, 500, 150);
		G.setBounds(700, 200, 100, 100);
		Group.setBounds(650, 200, 500, 200);
		Responsibility.setBounds(650, 350, 200, 100);
		Info.setBounds(650, 400, 400, 100);
		
		Course.setFont(new Font("SansSerif", Font.BOLD, 25));
		G.setFont(new Font("SansSerif", Font.BOLD, 20));
		Group.setFont(new Font("SansSerif", Font.ITALIC, 18));
		Responsibility.setFont(new Font("SansSerif", Font.BOLD, 20));
		Info.setFont(new Font("SansSerif", Font.ITALIC, 18));
		
		frame.add(Course);
		frame.add(G);
		frame.add(Group);
		frame.add(Responsibility);
		frame.add(Info);

		frame.add(button);
		
		button.setFont(new Font("SansSerif", Font.BOLD, 15));
		button.setBackground(Color.LIGHT_GRAY);
		
		frame.getContentPane().setBackground(Color.WHITE);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500, 700);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			frame.dispose();
			new MyProject();
		}
	}
	
	public static void main(String[] args) {
		new Frame1();
	}
}