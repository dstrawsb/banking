import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankOpenPanel extends JPanel
{
	private JButton okay, cancel;
	private JLabel label;
	private JPanel buttonPanel;
	
	
	public BankOpenPanel ()
	{
	okay = new JButton ("Okay");
	cancel = new JButton ("Cancel");
	
	ButtonListener = new ButtonListener();
	okay.addActionListener (listener);
	cancel.addActionListener (listener);
	
	label = new JLabel ("Click \"Okay\" to continue");
	
	buttonPanel = new JPanel();
	buttonPanel.setPreferredSize (new Dimension (200, 40));
	buttonPanel.setBackground (Color.yellow);
	buttonPanel.add (okay);
	buttonPanel.add (cancel);
	
	setPreferredSize (new Dimension(200,80));
	setBackground (Color.green);
	add (label);
	add (buttonPanel);
	}
}