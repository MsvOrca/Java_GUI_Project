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
			
			/*
			try
			{
				
				FileWriter writer = new FileWriter("C:\\JavaFileIoEx\\"+elements[6].textField.getText()+".java");

				writer.write("import java.awt.*;\n");
				writer.write("import javax.swing.*;\n");
				writer.write("public class "+elements[6].textField.getText()+" extends "+elements[2].textField.getText()+"{\n");
				writer.write("int x = "+elements[0].textField.getText()+";\n");
				writer.write("int y = "+elements[1].textField.getText()+";\n");
				writer.write("String type = new String("+"\""+elements[2].textField.getText()+"\""+");\n");
				writer.write("int width = "+elements[3].textField.getText()+";\n");
				writer.write("int height =" + elements[4].textField.getText()+";\n");
				writer.write("String text = new String("+"\""+elements[5].textField.getText()+"\""+");\n");
				writer.write("String variName = new String("+"\""+elements[6].textField.getText()+"\""+");\n");
				writer.write("}");
				writer.flush();
				writer.close();
			
			}
			catch(IOException io)
			{
				System.out.println("IOException Happen!");
				System.out.println(io);
			}
			*/
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

class TextDialogEx extends JFrame
{
	JButton button = new JButton("´­·¯ºÁ");
	JDialog dialog = new DrawnObjectDialog(this, "ÇìÇì");

	
	TextDialogEx()
	{
		super("TextDialogEx");
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		button.addActionListener(new ButtonActionListener());
		add(button);
		
		setSize(40,20);
		setVisible(true);
	}

	class ButtonActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent action)
		{
			dialog.setVisible(true);
		}
	}
	
	public static void main(String[] args)
	{
		new TextDialogEx();
	}
}
