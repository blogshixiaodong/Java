package com.Section_15;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Window;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class test extends JFrame {
	public test() {
		JButton button = new JButton("What");
		button.setForeground(new Color(255, 0, 0));
		button.setBackground(new Color(255, 255, 0));
		JPanel jPanel = new TwoButtonPanel2();
		jPanel.add(button);
		jPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(jPanel);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test test = new test();
		test.setVisible(true);
		test.pack();
		
	}

}
