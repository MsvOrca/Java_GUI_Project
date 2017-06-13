
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import Controller.ButtonPane;

public class DrawingObject extends JPanel{
	public DrawingObject()
	{

	}
	public DrawingObject(DrawnObject DO)
	{

	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		DrawnObject DOP;
		for(int a = 0; a < ButtonPane.drawnVector.size(); a++)
		{
			DOP = ButtonPane.drawnVector.get(a);
			
			if(DOP.Clicked)
			{
				g.setColor(Color.RED);
				TablePane.selectedObject = DOP;
			}
			else
				g.setColor(Color.blue);

            switch(DOP.type)
            {
            case "Rectangle" :
                g.fillRect(DOP.x, DOP.y, DOP.width, DOP.height);
                break;
            case "Circle" :
                g.fillOval(DOP.x, DOP.y, DOP.width, DOP.height);
                break;
            case "RoundRectangle" :
                g.fillRoundRect(DOP.x, DOP.y, DOP.width, DOP.height, 30, 30);
                break;

            }

		}
	}
}