import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import com.google.gson.*;

interface AddToolOpt{
	void AddToolBar(JToolBar ToolBar);
	void CreateTool(JToolBar ToolBar, JFrame Frame);
}
public class MakeTool extends JFrame implements AddToolOpt{

	static SaveDialog saveDialog = new SaveDialog(MainClass.frame,"Save File");
	static OpenDialog openDialog = new OpenDialog(MainClass.frame,"Open File");
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
		TOpen.addActionListener(MTAction);
		TSave.addActionListener(new SaveButtonActionListener());
		TSaveAs.addActionListener(new SaveAsButtonActionListener());
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
	
	class SaveAsButtonActionListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			saveDialog.setVisible(true);
		}
		
	}
	
	class SaveButtonActionListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
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
