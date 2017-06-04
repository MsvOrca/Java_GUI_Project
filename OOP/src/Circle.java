
public class Circle extends DrawnObject 
{
	static String type = "Circle";
	
	public Circle()
	{
		super(type);
	}
	
	public Circle(String variable, int x, int y, int width, int height, String text)
	{
		super(type,variable,x,y,width,height,text);
	}
}
