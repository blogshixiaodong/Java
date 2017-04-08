package com.Section_15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class ProductCalculatorrPanel extends JPanel implements ActionListener {
	private final double CD_PRICE = 2.99, DVD_PRICE = 19.89;
	private JButton okButton, exitButton;
	private JTextField productField, quantityField, totalField;
	public ProductCalculatorrPanel() {
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(new JLabel("Enter product name: "));
		productField = new JTextField("CD or DVD");
		add(productField);
		add(new JLabel("Enter the quantity:"));
		quantityField = new JTextField(10);
		add(quantityField);
		add(new JLabel("The total  amount:"));
		totalField = new JTextField("$0.00", 10);
		totalField.setEnabled(false);
		add(totalField);
		okButton = new JButton("OK");
		exitButton = new JButton("Exit");
		add(okButton);
		add(exitButton);
		okButton.addActionListener(this);
		exitButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
//		Object source = e.getSource();
		String source = e.getActionCommand();
		if(source == "OK") {
			if(productField.getText().equals("CD")) {
				int quantity = Integer.parseInt(quantityField.getText());
				double total = CD_PRICE * quantity;
				totalField.setText(NumberFormat.getCurrencyInstance().format(total));
			} else if(productField.getText().equals("DVD")) {
				Integer quantity = Integer.parseInt(quantityField.getText());
				double total = DVD_PRICE * quantity;
				totalField.setText(NumberFormat.getCurrencyInstance().format(total));
			} else {
				JOptionPane.showMessageDialog(null, "Entry error!\nPlease check product name and try again...");
				System.exit(0);
			}
		} else if(source == "Exit") {
			JOptionPane.showMessageDialog(null, "Good bye!\nPress anything to close window...");
			System.exit(1);
		}
		
		
		
		
		
		
		
		
		
	}
}
