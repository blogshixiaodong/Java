package com.Section_15;

import java.awt.*;

import javax.swing.*;


public class DisplayPanel extends JPanel {
	private JLabel productLabel, quantityLabel, totalLabel;
	public DisplayPanel() {
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		productLabel = new JLabel("Enter product name:");
		quantityLabel = new JLabel("Enter the quantity:");
		totalLabel = new JLabel("Total amount:");
		this.add(productLabel);
		this.add(quantityLabel);
		this.add(totalLabel);
	}
	public static void main(String[] args) {
		DisplayPanel displayPanel = new DisplayPanel();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.add(displayPanel);
		frame.pack();
		frame.setVisible(true);
	}
}
