import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuToolAction extends JPanel implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton Tmp = (JButton)e.getSource();
		DrawnObject DOP;

		if(Tmp.getText().equals("DELETE"))
			for(int a = ButtonPane.drawnVector.size() - 1; a >= 0; a--)
			{	
				DOP = ButtonPane.drawnVector.get(a);
				if(DOP.Clicked)
					ButtonPane.drawnVector.remove(a);
			}
	}
}
