package com.Section_15;

import javax.swing.*;
import java.awt.*;

public class TwoButtonFrame extends JFrame {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension dimension = toolkit.getScreenSize();
	public TwoButtonFrame() {
		setTitle("Two Button Frame");
		setSize(300, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		JPanel jPanel = new TwoButtonPanel();
		this.add(jPanel);
	}
	private void centerWindow(JFrame frame) {
		int centeredWidth = ((int)dimension.getWidth() - frame.getWidth()) / 2;
		int centeredHeight = ((int)dimension.getHeight() - frame.getHeight()) / 2;
		setLocation(centeredWidth, centeredHeight);
	}
}
