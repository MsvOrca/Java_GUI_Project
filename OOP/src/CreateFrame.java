import java.awt.*;
import javax.swing.*;

public class CreateFrame extends JFrame{
	JMenuBar MenuBar = new JMenuBar();
	CreateFrame(){
		setTitle("Java Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,900);
		
		//Create Menu
		MakeMenu MakingMenu = new MakeMenu();
		MakingMenu.CreateMenu(new JMenu("FILE"), MenuBar);
		setJMenuBar(MenuBar);
		//Complete Creating Menu
		
		setVisible(true);
	}
}
