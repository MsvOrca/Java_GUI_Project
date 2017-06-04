
public class RoundRectangle extends DrawnObject
{
	static String type = "RoundRectangle";
	
	public RoundRectangle()
	{
		super(type);
	}
	
	public RoundRectangle(String variable, int x, int y, int width, int height, String text)
	{
		super(type,variable,x,y,width,height,text);
	}
}
