import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

import com.google.gson.Gson;

interface addMenuOpt{//Interface forms entire menu
	void addMenuBar(JMenu Menu, JMenuBar MenuBar);
	void addMenu(JMenu Menu);
	void CreateMenu(JMenu Menu, JMenuBar MenuBar);
}
public class MakeMenu extends JFrame implements addMenuOpt{

	static SaveDialog save = new SaveDialog(MainClass.frame,"Save File");
	
	@Override
	public void addMenuBar(JMenu Menu, JMenuBar MenuBar) {//function inserting menu in menubar
		MenuBar.add(Menu);
	}
	
	@Override
	public void addMenu(JMenu Menu) {
		JMenuItem MNew = new JMenuItem("NEW");
		JMenuItem MOpen = new JMenuItem("OPEN");
		JMenuItem MSave = new JMenuItem("SAVE");
		JMenuItem MSaveAs = new JMenuItem("SAVE AS");
		JMenuItem MJava = new JMenuItem("NEW JAVA");
		JMenuItem MExit = new JMenuItem("EXIT");
		
		MNew.addActionListener(new MenuToolAction());
		MOpen.addActionListener(new MenuToolAction());
		MSave.addActionListener(new SaveButtonActionListener());
		MSaveAs.addActionListener(new SaveAsButtonActionListener());
		MJava.addActionListener(new MenuToolAction());
		MExit.addActionListener(new MenuToolAction());
		
		Menu.add(MNew);
		Menu.add(MOpen);
		Menu.add(MSave);
		Menu.add(MSaveAs);
		Menu.add(MJava);
		Menu.add(MExit);
	}

	@Override
	public void CreateMenu(JMenu Menu, JMenuBar MenuBar) {
		addMenu(Menu);
		addMenuBar(Menu, MenuBar);
	}
	
	class SaveAsButtonActionListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			save.setVisible(true);
		}
		
	}
	
	class SaveButtonActionListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) {			
			try
			{
				FileWriter writer = new FileWriter("C:\\JavaFileIoEx\\abc.json");
				DrawnObject traversal;
				Gson gson = new Gson();
				
				for(int i=0;i<ButtonPane.drawnVector.size();i++)
				{
					traversal = ButtonPane.drawnVector.elementAt(i);
					String inp = gson.toJson(traversal);
					writer.write(inp);
					writer.flush();
				}
				writer.close();
			}
			catch(IOException io)
			{
				System.out.println("Tool.SaveButton.ActionListener.Exception Happened!!");
			}
		}
		
	}

}