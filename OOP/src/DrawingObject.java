import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

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
			
			System.out.println(a + ". " + DOP.x + "," + DOP.y + "," + DOP.width + "," + DOP.height);

			
			if(DOP.Clicked)
				g.setColor(Color.RED);
			else
				g.setColor(Color.blue);

			g.fillRect(DOP.x, DOP.y, DOP.width, DOP.height);
		}
	}
}