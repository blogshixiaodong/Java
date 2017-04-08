package com.Section_15;
import javax.swing.*;
public class TwoButtonPanel extends JPanel {
	private JButton okButton, exitButton;
	public TwoButtonPanel() {
		okButton = new JButton("OK");
		exitButton = new JButton("exit");
		this.add(okButton);
		this.add(exitButton);
	}	
}
