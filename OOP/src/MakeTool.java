import java.awt.*;
import javax.swing.*;

interface AddToolOpt{
	void AddToolBar(JToolBar ToolBar);
	void CreateTool(JToolBar ToolBar);
}
public class MakeTool extends JFrame implements AddToolOpt{

	@Override
	public void AddToolBar(JToolBar ToolBar) {
		JButton TNew = new JButton("NEW");
		JButton TOpen = new JButton("OPEN");
		JButton TSave = new JButton("SAVE");
		JButton TSaveAs = new JButton("SAVE AS");
		JButton TJava = new JButton("NEW JAVA");
		JButton TExit = new JButton("EXIT");
		
		ToolBar.add(TNew);
		ToolBar.add(TOpen);
		ToolBar.add(TSave);
		ToolBar.add(TSaveAs);
		ToolBar.add(TJava);
		ToolBar.add(TExit);
	}

	@Override
	public void CreateTool(JToolBar ToolBar) {
		// TODO Auto-generated method stub
		
	}
	
}
