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
		setTitle("JavaPanel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FWIDTH,FHEIGHT);
		
		MakeMenu MakingMenu = new MakeMenu();
		MakingMenu.CreateMenu(new JMenu("FILE"), MenuBar);
		setJMenuBar(MenuBar);

		MakeTool MakingTool = new MakeTool();
		contentPane = new ContentPane(this,tBar,MakingTool);


		setVisible(true);
	}
}
