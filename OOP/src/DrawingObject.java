
public class DrawingObject {z
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DrawingObject {
	int x1,x2,y1,y2;
}

class DrawOnPanel extends JPanel
{
	public void PaintComponent(Graphics g)
	{
		super.paintComponent(Graphics g);
		g.setColor(Color.blue);
		
		g.fillRect(50, 50, 1000, 1000);
	}
}