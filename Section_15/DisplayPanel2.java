package com.Section_15;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class DisplayPanel2 extends JPanel {
	private JTextField productField, quantityField, totalField;
	public DisplayPanel2() {
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		//margin
		//setLayout(new BorderLayout(10, 10));
		//table
		//setLayout(new GridLayout(3, 1, 10, 10));
		productField = new JTextField(18);
		productField.setText("Input product:");
		productField.setColumns(10);
		add(productField, BorderLayout.NORTH);
		quantityField = new JTextField(18);
		add(quantityField, BorderLayout.WEST);
		totalField = new JTextField("Input", 10);
		totalField.setEnabled(false);
		add(totalField, BorderLayout.EAST);
	}
	public static void main(String[] args) {
		DisplayPanel2 displayPanel2 = new DisplayPanel2();
		JFrame jFrame = new JFrame();
		jFrame.add(displayPanel2);
		jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jFrame.pack();
		jFrame.setVisible(true);
		
	}
}
