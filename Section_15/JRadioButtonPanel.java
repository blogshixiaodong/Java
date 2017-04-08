package com.Section_15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonPanel extends JPanel implements ActionListener {
	private JLabel entryLabel;
	private JRadioButton check, creditCard, debtCard;
	private JButton okButton;
	public JRadioButtonPanel() {
		entryLabel = new JLabel("Entry your payment type:");
		add(entryLabel);
		check = new JRadioButton("Check" , true);
		creditCard = new JRadioButton("Credit Card");
		debtCard = new JRadioButton("Debt Card");
		add(check);
		add(creditCard);
		add(debtCard);
		//In ButtonGroup only one button can be selected
		ButtonGroup paymentGroup = new ButtonGroup();
		paymentGroup.add(check);
		paymentGroup.add(creditCard);
		paymentGroup.add(debtCard);
		check.addActionListener(this);
		creditCard.addActionListener(this);
		debtCard.addActionListener(this);
		okButton = new JButton("OK");
		add(okButton);
		okButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {	
		Object source = e.getSource();				
		if (source == okButton) {
		    if (check.isSelected()) {
		    	JOptionPane.showMessageDialog(null, "Check is selected...");
		    } else if (creditCard.isSelected()) {
		    	JOptionPane.showMessageDialog(null, "Credit card is selected...");		    	
		    } else if (debtCard.isSelected()) {
				JOptionPane.showMessageDialog(null, "Debt card is selected...");
			}
		}
		if (source == check) {
			JOptionPane.showMessageDialog(null, "check triggered the event...");			
		}
		if (source == creditCard) {
			JOptionPane.showMessageDialog(null, "creditCard triggered the event...");			
		}
		if (source == debtCard) {
			JOptionPane.showMessageDialog(null, "debtCard triggered the event...");			
		}
	}

}
