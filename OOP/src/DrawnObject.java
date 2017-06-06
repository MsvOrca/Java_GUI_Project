
public class DrawnObject 
{
	String type;
	String variable;
	int x;
	int y;
	int width;
	int height;
	Boolean Clicked;
	String text;
	
	public DrawnObject()
	{
		this("","",0,0,0,0,"");
	}
	
	public DrawnObject(String type)
	{
		this();
		setType(type);
	}
	
	public DrawnObject(String type, String variable, int x, int y, int width, int height, String text)
	{
		setType(type);
		setVariableName(variable);
		setPos(x,y);
		setWidth(width);
		setHeight(height);
		setText(text);
	}
	
	public void setPos(int x, int y)
	{
		setX(x);
		setY(y);
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void setVariableName(String variable)
	{
		this.variable = variable;
	}
	
	
	public void setText(String text)
	{
		this.text = text;
	}

	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWidth()
	{
		return height;
	}
	
	public String setType()
	{
		return type;
	}
	
	public String getVariableName()
	{
		return variable;
	}
	
	public String getText()
	{
		return text;
	}

}
