import java.awt.*;
import javax.swing.*;

public class CreateFrame extends JFrame{
	public static final int FWIDTH = 1000;
	public static final int FHEIGHT = 730;
	
	JMenuBar MenuBar = new JMenuBar();
	JSplitPane sPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	JToolBar tBar = new JToolBar();
	Container contentPane;
	
	
	CreateFrame(){
		setTitle("Java Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FWIDTH,FHEIGHT);
		
		MakeMenu MakingMenu = new MakeMenu();
		MakingMenu.CreateMenu(new JMenu("FILE"), MenuBar);
		setJMenuBar(MenuBar);
		//Complete Creating MenuBar
	
		MakeTool MakingTool = new MakeTool();
		//}Complete Creating ToolBar
		contentPane = new ContentPane(this,tBar,MakingTool);
        //MakeContentPane.setContentPane(this,sPane,tBar,MakingTool);

		setVisible(true);
	}
}
