package com.ruben;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class BankOpenPanel extends Applet 
{
	
	//what is serialVersion?
	private static final long serialVersionUID = 1L;
	private JButton okay = null;
	private JButton cancel = null;
	private JLabel label1 = null;
	private JLabel label2 = null;
	private JPanel buttonPanel = null;
	private Bank rubenBank = null;

	public BankOpenPanel() 
	{
		rubenBank = Bank.getInstance("Ruben Bank");
		rubenBank.addAccount(new Account("Don Strawsburg", 10001, 102.56));
		rubenBank.addAccount(new Account("Jessica Strawsburg", 10003, 759.32));
		rubenBank.addAccount(new Account("Petr Ruben", 10002, 40.00));
		rubenBank.getAccountByNumber(10001).deposit(25.85);

		okay = new JButton("Okay");
		cancel = new JButton("Cancel");

		ButtonListener listener = new ButtonListener();
		okay.addActionListener(listener);
		cancel.addActionListener(listener);

		label1 = new JLabel("--Click \"Okay\" to continue-- OR");
		label2 = new JLabel("--Click \"Cancel\" to cancel--");

		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(200, 40));
		buttonPanel.setBackground(Color.yellow);
		buttonPanel.add(okay);
		buttonPanel.add(cancel);

		setPreferredSize(new Dimension(400, 200));
		setBackground(Color.green);
		add(label1);
		add(label2);
		add(buttonPanel);

		okay = new JButton("Okay");
		cancel = new JButton("Canel");

		okay.addActionListener(listener);
		cancel.addActionListener(listener);

	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == okay)
				label1.setText("Okay");
			else
				label1.setText("Cancel");
			}
	}
}
