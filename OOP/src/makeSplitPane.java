import java.awt.*;
import javax.swing.*;

class makeSplitPane  
{
	public static final int DIVIDER_SIZE = 5;
	
	static void addSplitPane(JFrame jf, JSplitPane jsPane, JToolBar tb, MakeTool MT)
	{
		setSplitPane(jsPane);
		addScrollToRSplit(jsPane);
		
		MT.CreateTool(tb, jf);
		jf.add(jsPane,"Center");
		
	}
	
	private static void setSplitPane(JSplitPane jsPane)
	{
		jsPane.setContinuousLayout(true);
		jsPane.setDividerLocation(CreateFrame.WIDTH/3);
		jsPane.setDividerSize(DIVIDER_SIZE);
	}
	
	private static void addScrollToRSplit(JSplitPane jsPane)
	{
		String[] str = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		JList list = new JList(str);
		JList list2 = new JList(str);
		
		JScrollPane scroll = new JScrollPane(list2);
		
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		jsPane.setRightComponent(scroll);
		jsPane.setLeftComponent(list);
	}
}
