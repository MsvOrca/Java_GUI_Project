import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JList;
import javax.swing.JScrollPane;

class EditorPane extends JScrollPane
{
	static DrawingObject DO = new DrawingObject();
	static Boolean Made = false;

	DrawnObjectDialog dDialog = new DrawnObjectDialog(MainClass.frame,"Setting Object");
	
	EditorPane()
	{
		super(DO);
		setScroll();
		this.addMouseListener(new ButtonMouseListener());
		this.addMouseMotionListener(new ButtonMouseListener());
		this.addKeyListener(new ButtonMouseListener());
		if(!DrawingObject.needPaint)
		{
			repaint();
			DrawingObject.needPaint = false;
		}
	}

	public void setScroll()
	{
		this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	}

	class ButtonMouseListener implements MouseListener, MouseMotionListener, KeyListener{
		DrawnObject DOP ;
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			ClickComponent(e.getX(), e.getY());

			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			if(EditorPane.Made)
			{
				DOP = ButtonPane.drawnVector.lastElement();
				DOP.x = e.getX();
				DOP.y = e.getY();
				TablePane.selectedObject = DOP;
				TablePane.setTablePane();
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

			if(EditorPane.Made)
			{
				DOP = ButtonPane.drawnVector.lastElement();
				TablePane.selectedObject = DOP;
				TablePane.setTablePane();
				int x = e.getX();
                int y = e.getY();
                if(DOP.x > x)
                {
                    int tmp = x;
                    x = DOP.x;
                    DOP.x = tmp;
                }
                if(DOP.y > y)
                {
                    int tmp = y;
                    y = DOP.y;
                    DOP.y = tmp;
                }
                DOP.width = - DOP.x + x;
                if(DOP.width < 0)
                    DOP.width *= -1;
                DOP.height = - DOP.y + y;
                if(DOP.height < 0)
                    DOP.height *= -1;

				DOP.Clicked = false;
				TablePane.selectedObject = DOP;
				TablePane.setTablePane();
				repaint();

				EditorPane.Made = false;
			}
			
			dDialog.setVisible(DOP.visible);
			DOP.visible = false;
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		public void ClickComponent(int x, int y)
		{
			for(int a = ButtonPane.drawnVector.size() - 1; a >= 0; a--)
			{
				DOP = ButtonPane.drawnVector.get(a);
				TablePane.selectedObject = DOP;
				TablePane.setTablePane();
                DOP.Clicked = false;
            }
            for(int a = ButtonPane.drawnVector.size() - 1; a >= 0; a--)
            {
                DOP = ButtonPane.drawnVector.get(a);
                TablePane.selectedObject = DOP;
				TablePane.setTablePane();

                if((DOP.x < x) && (x < DOP.x + DOP.width))
                {		
                	if((DOP.y < y) && (y < DOP.y + DOP.height))
                	{
                		DOP.Clicked = true;
                		break;
                	}
                	else
                		DOP.Clicked = false;
                }
                else  DOP.Clicked = false;	
            }
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			if(!EditorPane.Made)
			{
				for(int a = ButtonPane.drawnVector.size() - 1; a >= 0; a--)
				{
					DOP = ButtonPane.drawnVector.get(a);
					if(DOP.Clicked)
					{
						TablePane.selectedObject = DOP;
						TablePane.setTablePane();
						break;
					}
				}
				if(DOP.Clicked)
                {
                    int x = e.getX();
                    int y = e.getY();
                    int PW = x - DOP.x;
                    int PH = y - DOP.y;
                    if(((DOP.x + 20) > x) || (x > (DOP.x + DOP.width - 20)))
                    {        
                        if((DOP.y + 20 > y) || (y > DOP.y + DOP.height - 20))
                            ChangeSize(x, y, DOP);
                        else
                            MoveObject(PW, PH, x, y, DOP);
                    }    
                    else
                        MoveObject(PW, PH, x, y, DOP);

                    repaint();
                }

			}

		}

		public void MoveObject(int PW, int PH, int x, int y, DrawnObject DOP)
		{
			DOP.x += PW - (DOP.width/2);		
			DOP.y += PH - (DOP.height/2);
		}

		public void ChangeSize(int x, int y, DrawnObject DOP)
		{

			if(DOP.x > x)
			{
				int tmp = DOP.x;
				DOP.x = x;
				DOP.width = tmp - DOP.x;
			}
			else
				DOP.width = x - DOP.x;
			if(DOP.y > y)
			{
				int tmp = DOP.y;
				DOP.y = y;
				DOP.height = tmp - DOP.y;
			}
			else
				DOP.height = y - DOP.y;

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int KeyCod = e.getKeyCode();
			System.out.println("a "+ KeyCod);
			switch(KeyCod){
			case 127 :
				for(int a = ButtonPane.drawnVector.size() - 1; a >= 0; a--)
				{	
					DOP = ButtonPane.drawnVector.get(a);
					if(DOP.Clicked)
						ButtonPane.drawnVector.remove(a);
				}
				break;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			int KeyCod = e.getKeyCode();
			System.out.println("B "+ KeyCod);
		}

	}
}
