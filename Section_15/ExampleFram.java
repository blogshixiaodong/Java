package com.Section_15;

import java.awt.*;
import javax.swing.*;

import java.awt.*;
public class ExampleFram extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension dimension = tk.getScreenSize();
	public ExampleFram() {
		setTitle("Example Frame");
		setSize(dimension.width / 2, dimension.height / 2);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		setResizable(false);
		
	}
	private void centerWindow(JFrame frame) {
		int centeredWidth = ((int)dimension.getWidth() - frame.getWidth()) / 2;
		int centeredHeight = ((int)dimension.getHeight() - frame.getHeight()) / 2;
		setLocation(centeredWidth, centeredHeight);
	}
}
