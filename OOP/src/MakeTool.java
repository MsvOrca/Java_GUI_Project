import java.awt.*;
import javax.swing.*;

interface AddToolOpt{
	void AddToolBar(JToolBar ToolBar);
	void CreateTool(JToolBar ToolBar, JFrame Frame);
}
public class MakeTool implements AddToolOpt{
	@Override
	public void AddToolBar(JToolBar ToolBar) {
		MenuToolAction MTAction = new MenuToolAction();
		JButton TNew = new JButton("NEW");
		JButton TOpen = new JButton("OPEN");
		JButton TSave = new JButton("SAVE");
		JButton TSaveAs = new JButton("SAVE AS");
		JButton TJava = new JButton("NEW JAVA");
		JButton TExit = new JButton("EXIT");
		
		TNew.addActionListener(MTAction);
		TExit.addActionListener(MTAction);
		
		ToolBar.add(TNew);
		ToolBar.add(TOpen);
		ToolBar.addSeparator();
		ToolBar.add(TSave);
		ToolBar.add(TSaveAs);
		ToolBar.addSeparator();
		ToolBar.add(TJava);
		ToolBar.add(TExit);
		
	}

	@Override
	public void CreateTool(JToolBar ToolBar, JFrame Frame) {
		// TODO Auto-generated method stub
		AddToolBar(ToolBar);
		ToolBar.setFloatable(false);
		Frame.add(ToolBar, BorderLayout.NORTH);
	}
	
}
