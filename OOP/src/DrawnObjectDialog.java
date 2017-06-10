import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class DrawnObjectDialog extends JDialog
{
	//DialogInputElement element = new DialogInputElement("Input X Value");
	String[] str = {"Text","Variable"};
	DialogInputElement[] elements = new DialogInputElement[2];
	JButton button = new JButton("OK");
	DrawnObject drawn;
	boolean visible = true;
	
	DrawnObjectDialog(JFrame frame, String title)
	{
		super(frame,title);
		setLayout(new GridLayout(3,1));
		setSize(200,150);
		
		setDialogElements();
		add(button);
		
		button.addActionListener(new ButtonActionListener());
	}
	
	void setDialogElements()
	{
		for(int i=0;i<elements.length;i++)
		{
			elements[i] = new DialogInputElement(str[i]);
			elements[i].addTo(this);
		}
	}
	
	private class ButtonActionListener implements ActionListener
	{
		
		String[] assign = new String[7];
		
		
		public void actionPerformed(ActionEvent action) 
		{	
			drawn = ButtonPane.drawnVector.lastElement();
			drawn.text = elements[0].textField.getText();
			drawn.variable = elements[1].textField.getText();
						for(int i=0;i<elements.length;i++)
			{
				elements[i].textField.setText("");
			}
			TablePane.setTablePane();
			dispose();
			visible = false;
		}
	}

	class DialogInputElement
	{
		JLabel label = new JLabel();
		JTextField textField = new JTextField(10);

		DialogInputElement(String labelStr)
		{
			label.setText(labelStr);
		}
		
		public void addTo(Container container)
		{
			container.add(this.label);
			container.add(this.textField);
		}
	}
}

