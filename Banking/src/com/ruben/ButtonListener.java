package com.ruben;


private class ButtonListener implements ActionListener
{

	public void actionPerformed (ActionEvent event)
	{
		if (event.getSource() == okay)
			label.setText("Okay");
		
		else
			label.setText ("Cancel");
	}
}
