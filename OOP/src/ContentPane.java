import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;




public class ContentPane extends JSplitPane 
{
	ContentPane(JFrame frame, JToolBar tb, MakeTool MT)
	{
		super(JSplitPane.HORIZONTAL_SPLIT);
	
		JScrollPane editor = new EditorPane();
		JSplitPane attribute = new AttributePane(frame);
		
		setContentPane(frame,editor,attribute);
	
		MT.CreateTool(tb, frame);		
	}
	
	public void setContentPane(JFrame frame,JScrollPane editor, JSplitPane attribute)
	{
		setSplitPane(frame);
		
		this.setRightComponent(editor);
		this.setLeftComponent(attribute);
	}
	
	public void setSplitPane(JFrame frame)
	{
		this.setDividerLocation((int)frame.getSize().getWidth()/3);
		this.setDividerSize(5);
		this.setContinuousLayout(true);
	}
	
}
