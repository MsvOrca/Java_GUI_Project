
public class Button extends DrawnObject
{
	static String type = "Button";
	
	public Button()
	{
		super(type);
	}
	
	public Button(String variable, int x, int y, int width, int height, String text)
	{
		super(type,variable,x,y,width,height,text);
	}
}
