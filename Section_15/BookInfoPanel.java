package com.Section_15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BookInfoPanel extends JPanel implements ActionListener {
	private JLabel entryLabel;
	private JTextField entryField, titleField;
	private JCheckBox authorBox, pressBox;
	private JButton okButton;
	public BookInfoPanel() {
		entryLabel = new JLabel("Entry the book code:");
		add(entryLabel);
		entryField = new JTextField("Java or C/C++", 12);
		add(entryField);
		entryField.addActionListener(this);
		titleField = new JTextField(43);
		titleField.setEditable(false);
		titleField.setVisible(false);
		add(titleField);
		authorBox = new JCheckBox("Author", true);
		authorBox.setVisible(false);
		add(authorBox);
		authorBox.addActionListener(this);
		pressBox = new JCheckBox("Press");
		pressBox.setVisible(false);
		add(pressBox);
		pressBox.addActionListener(this);
		okButton = new JButton("OK");
		add(okButton);
		okButton.addActionListener(this);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		String info = null;
		if(source == okButton) {
			if(entryField.getText().equals("Java")) {
				titleField.setText("Programming Art in Java");
				info = titleField.getText();
				setVisibles();
			} else if (entryField.getText().equals("C/C++")) {
				   titleField.setText("Complete Programming in C/C++");
				   info = titleField.getText();
				   setVisibles();
			}
		}
		if(source == okButton && authorBox.isSelected()) {
			info += getAuthorInfo();
			titleField.setText(info);
		}
		if(source == okButton && pressBox.isSelected()) {
			info += getPressInfo();
			titleField.setText(info);
		}

	}
	public void setVisibles() {
		entryLabel.setVisible(false);
		entryField.setEditable(false);
		titleField.setVisible(true);
		authorBox.setVisible(true);
		pressBox.setVisible(true);
	}
	public String getAuthorInfo() {
		return ", Gao Yong Qiang, Ph.D.";
	}
	public String getPressInfo() {
		return ", Tsinghua University Press.";
	}

}
