import java.awt.*;
import javax.swing.*;

public class CreateFrame extends JFrame{
	public static final int FWIDTH = 1000;
	public static final int FHEIGHT = 730;
	
	JMenuBar MenuBar = new JMenuBar();
	JSplitPane sPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	JToolBar tBar = new JToolBar();
	
	CreateFrame(){
		setTitle("Java Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FWIDTH,FHEIGHT);
		
		//Create Menu
		MakeMenu MakingMenu = new MakeMenu();
		MakingMenu.CreateMenu(new JMenu("FILE"), MenuBar);
		setJMenuBar(MenuBar);
		//Complete Creating Menu

		//Create SplitPane{
		
		//Create MakeToolBar{
		MakeTool MakingTool = new MakeTool();
		//}Complete Creating ToolBar
<<<<<<< HEAD
		
		makeSplitPane.addSplitPane(this, sPane, tBar, MakingTool);
		//}Complete Creating SplitPane
=======
		MakeContentPane.setContentPane(this,sPane,tBar,MakingTool);
		//makeSplitPane.addSplitPane(this, sPane, tBar, MakingTool);
		//Complete Creating SplitPane}
>>>>>>> d1cc277a4a4e8113034ef8cd0d79f7262b7f4e9b

		setVisible(true);
	}
}
