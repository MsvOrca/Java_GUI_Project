import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.JScrollPane;

class EditorPane extends JScrollPane
{
	static DrawingObject DO = new DrawingObject();
	
	EditorPane()
	{
		super(DO);
		setScroll();
		this.addMouseListener(new ButtonMouseListener());
	}
	
	public void setScroll()
	{
		this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	}
	
	class ButtonMouseListener implements MouseListener{
		DrawnObject DOP ;
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			DOP = ButtonPane.drawnVector.lastElement();
			//DOP = ButtonPane.drawnVector.get(ButtonPane.drawnVector.size());
			DOP.x = e.getX();
			DOP.y = e.getY();

			
		//	System.out.println("@@@@" + ButtonPane.drawnVector.get(ButtonPane.Vnum).x);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			DOP.width = - DOP.x + e.getX();
			DOP.height = - DOP.y + e.getY();
			if(ButtonPane.drawnVector.size() < 5)
			{
			//ButtonPane.drawnVector.remove(ButtonPane.drawnVector.size() - 1);		
			
			//ButtonPane.drawnVector.add(DOP);
			}
			//ButtonPane.drawnVector.add(DOP);
			//DOP = ButtonPane.drawnVector.get(0);
			
			for(int i=0;i<ButtonPane.drawnVector.size();i++)
			{
				System.out.println("size:"+ButtonPane.drawnVector.size());
				System.out.println(i+":"+ButtonPane.drawnVector.get(i));
			}	
			
			repaint();
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
