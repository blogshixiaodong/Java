package com.Section_15;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BookInfoFrame extends JFrame {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension dimension = toolkit.getScreenSize();
	public BookInfoFrame() {
		setTitle("Book information");
		setSize(520, 125);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		JPanel panel = new BookInfoPanel();
		this.add(panel);
	}
	//Set Windows Position
	private void centerWindow(JFrame frame) {
		int centeredWidth = ((int)dimension.getWidth() - frame.getWidth()) / 2;
		int centeredHeight = ((int)dimension.getHeight() - frame.getHeight()) / 2;
		setLocation(centeredWidth, centeredHeight);
	}
}
