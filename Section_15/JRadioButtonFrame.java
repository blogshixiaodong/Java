package com.Section_15;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class JRadioButtonFrame extends JFrame {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension dimension = toolkit.getScreenSize();
	public JRadioButtonFrame() {
		setTitle("Book information");
		setSize(400, 120);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		JPanel panel = new JRadioButtonPanel();
		this.add(panel);
	}
	private void centeredWindow(JFrame frame) {
		int centeredWidth = ((int)dimension.getWidth() - frame.getWidth()) / 2;
		int centeredHeight = ((int)dimension.getHeight() - frame.getHeight()) / 2;
		setLocation(centeredWidth, centeredHeight);
	}
}
