package com.ruben;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class BankOpenPanel extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton okay = null;
	private JButton cancel = null;
	private JLabel label = null;
	private JPanel buttonPanel = null;
	Account acct1 = null;
	Account acct2 = null;
	Account acct3 = null;

	public BankOpenPanel() {

		loadTransactions();

		okay = new JButton("Okay");
		cancel = new JButton("Cancel");

		ButtonListener listener = new ButtonListener();
		okay.addActionListener(listener);
		cancel.addActionListener(listener);

		label = new JLabel("Click \"Okay\" to continue");

		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(200, 40));
		buttonPanel.setBackground(Color.yellow);
		buttonPanel.add(okay);
		buttonPanel.add(cancel);

		setPreferredSize(new Dimension(200, 80));
		setBackground(Color.green);
		add(label);
		add(buttonPanel);

		okay = new JButton("Okay");
		cancel = new JButton("Canel");

		okay.addActionListener(listener);
		cancel.addActionListener(listener);

		label = new JLabel("Click \"Okay\" to continue");

		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(200, 40));
		buttonPanel.setBackground(Color.yellow);
		buttonPanel.add(okay);
		buttonPanel.add(cancel);

		setPreferredSize(new Dimension(200, 80));
		setBackground(Color.green);
		add(label);
		add(buttonPanel);

	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == okay)
				label.setText("Okay");

			else
				label.setText("Cancel");
		}
	}

	public void loadTransactions() {
		acct1 = new Account("Don Strawsburg", 10001, 102.56);
		acct2 = new Account("Petr Ruben", 10002, 40.00);
		acct3 = new Account("Jessica Strawsburg", 10003, 759.32);

		acct1.deposit(25.85);
	}
}
