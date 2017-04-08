package com.Section_15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TwoButtonPanel2 extends JPanel implements ActionListener {
	private JButton okButton, exitButton;
	public TwoButtonPanel2() {
		// TODO Auto-generated constructor stub
		okButton = new JButton("OK");
		exitButton = new JButton("Exit");
		this.add(okButton);
		this.add(exitButton);
		okButton.addActionListener(this);
		exitButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if(source == okButton) {
			JOptionPane.showMessageDialog(null, "Ok button is clicked.");
		} else if(source == exitButton) {
			JOptionPane.showMessageDialog(null, "Exit button is clicked.");
			System.exit(0);
		}
		
	}

}
