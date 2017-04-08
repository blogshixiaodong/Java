package com.Section_15;

import javax.swing.*;
import java.awt.*;

class ExampleFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d= tk.getScreenSize();
	public ExampleFrame() {
		setTitle("Example Frame");
		setSize(d.width / 2, d.height / 2);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		setResizable(false);
	}
	private void centerWindow(JFrame frame) {
		int centeredWidth = ((int)d.getWidth() - frame.getWidth()) / 2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight()) / 2;
		setLocation(centeredWidth, centeredHeight);
	}
}
public class ExampleFrameTest {
	public static void main(String[] arg) {
		JFrame frame = new ExampleFrame();
		//auto resize:  according to the function getPreferredSize()
		//frame.pack();
		frame.setVisible(true);
	}
}
