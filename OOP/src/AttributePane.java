import java.awt.Component;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import model.Button;
import model.Circle;
import model.Rectangle;
import model.RoundRectangle;
import view.EditorPane;

public class AttributePane extends JSplitPane
{
	JPanel button = new ButtonPane();
	JTable table = new TablePane();
	
	AttributePane(JFrame frame)
	{
		super(JSplitPane.VERTICAL_SPLIT);
		
		setAttributePane(frame);
		table.getSelectionModel().addListSelectionListener(new TableListSelectionListener());
	}
	
	public void setAttributePane(JFrame frame)
	{	
		setSplitPane(frame);
		
		this.setTopComponent(button);
		this.setBottomComponent(table);	
	}
	
	public void setSplitPane(Component frame)
	{
		this.setDividerLocation((int)frame.getSize().getHeight()/3*2);
		this.setDividerSize(5);
		this.setContinuousLayout(true);
	}
	
	class TableListSelectionListener implements ListSelectionListener
	{

		@Override
		public void valueChanged(ListSelectionEvent event) {	
			int selectedRow = table.getSelectedRow();		
			}
		
	}
	
}
class TablePane extends JTable
{
	static final Object[][] rowData = {{"Attribute","Value"},{"Type","a"},{"Height",100}
						 ,{"Width",200},{"PosX",100},{"PosY",100},{"TextField","b"},{"Variable","c"}};
	static final String[] columnData = {"Attribute","Value"};
	static DrawnObject selectedObject;
	static DefaultTableModel model = new DefaultTableModel(rowData,columnData);
	
	TablePane()
	{
		this.setModel(model);
	}
	
	static public void setTablePane()
	{
		model.setValueAt(selectedObject.type,1,1);
		model.setValueAt(selectedObject.height,2,1);
		model.setValueAt(selectedObject.width,3,1);
		model.setValueAt(selectedObject.x,4,1);
		model.setValueAt(selectedObject.y,5,1);
		model.setValueAt(selectedObject.text,6,1);
		model.setValueAt(selectedObject.variable,7,1);
	}
	
	
	
	
}
