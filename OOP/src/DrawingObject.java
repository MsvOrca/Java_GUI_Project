import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class DrawingObject extends JPanel{
	static Boolean needPaint = false;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		DrawnObject DOP;
		if(needPaint)
		{
			repaint();
			needPaint = false;
		}	
		for(int a = 0; a < ButtonPane.drawnVector.size(); a++)
		{
			DOP = ButtonPane.drawnVector.get(a);

			DrawShape(DOP, g);
		}
	}
	
	void DrawShape(DrawnObject DOP, Graphics g)
	{
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