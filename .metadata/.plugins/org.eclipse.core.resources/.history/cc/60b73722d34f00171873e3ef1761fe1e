package Controller;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.Button;
import model.Circle;
import model.Rectangle;
import model.RoundRectangle;

public class ButtonPane extends JPanel 
{
	static final String[] strb = {"button","roundrectangle","rectangle","circle"};
	public static Vector<DrawnObject> drawnVector = new Vector<DrawnObject>();
	JButton[] buttons = new JButton[4];
	
	ButtonPane()
	{
		this.setLayout(new GridLayout(2,2));
		setButtons();
	}
	
	public void setButtons()
	{
		for(int i=0;i<strb.length;i++)
		{
			buttons[i] = new JButton(strb[i]);
			buttons[i].addActionListener(new ButtonActionListener());
			this.add(buttons[i]);
		}
	}
	
	class ButtonActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent action)
		{
			JButton button = (JButton)action.getSource();
			String text = button.getText();
			
			if(strb[0].equals(text))
			{
				drawnVector.addElement(new Button());//益掘益軍しけしいしけ
				EditorPane.Made = true;
				TablePane.selectedObject = drawnVector.lastElement();
				TablePane.setTablePane();
			}
			else if(strb[1].equals(text))
			{
				drawnVector.addElement(new RoundRectangle());
                EditorPane.Made = true;
                TablePane.selectedObject = drawnVector.lastElement();
                TablePane.setTablePane();

			}
			else if(strb[2].equals(text))
			{
				drawnVector.addElement(new Rectangle());
                EditorPane.Made = true;
                TablePane.selectedObject = drawnVector.lastElement();
                TablePane.setTablePane();

			}
			else if(strb[3].equals(text))
			{
				drawnVector.addElement(new Circle());
                EditorPane.Made = true;
                TablePane.selectedObject = drawnVector.lastElement();
                TablePane.setTablePane();

			}
		}
	}
	
}