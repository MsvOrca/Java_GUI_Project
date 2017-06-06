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
		DrawnObject DOP = new DrawnObject();
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			DOP.x = e.getX();
			DOP.y = e.getY();
			
		//	System.out.println("@@@@" + ButtonPane.drawnVector.get(ButtonPane.Vnum).x);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			DOP.width = - DOP.x + e.getX();
			DOP.height = - DOP.y + e.getY();
			
			System.out.println(DOP.width + "!!!!" + DOP.height);
			
			ButtonPane.drawnVector.remove(ButtonPane.drawnVector.size() - 1);
			
			ButtonPane.drawnVector.add(ButtonPane.drawnVector.size(), DOP);
			
			//DOP = ButtonPane.drawnVector.get(ButtonPane.Vnum);
			
			//System.out.println(DOP.width + "!!!!" + DOP.height);
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
