import javax.swing.JList;
import javax.swing.JScrollPane;

class EditorPane extends JScrollPane
{
	static final String[] str = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	static final JList list = new JList(str);
	
	EditorPane()
	{
		super(list);
		setScroll();
	}
	
	public void setScroll()
	{
		this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	}
}
