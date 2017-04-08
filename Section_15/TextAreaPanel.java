package com.Section_15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaPanel extends JPanel implements ActionListener {
	final int vScroll = JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, hScroll = JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
	private JTextArea textArea;
	private JScrollPane scroll;
	private JButton copyButton;
	public TextAreaPanel() {
		textArea = new JTextArea("another example of text area.", 20, 20);
		textArea.setLineWrap(true);
		add(textArea);
		scroll = new JScrollPane(textArea, vScroll, hScroll);
		add(scroll);
		copyButton = new JButton("Copy >>");
		
		add(copyButton);
		copyButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == copyButton) {
			textArea.insert("Welcome to Text Area and Scroll Application This is ", 0);
			textArea.append("another Window's example");
			JOptionPane.showMessageDialog(null, textArea.getText());
		} else {
			System.exit(0);	
		}			
	}
	public static void main(String[] args) {
		TextAreaPanel t = new TextAreaPanel();	
		JFrame jFrame = new JFrame();
		jFrame.add(t);
		jFrame.pack();
		jFrame.setVisible(true);
	}
}
