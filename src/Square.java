
public class Square extends Rectangle 
{
	public Square(String id, double length)
	{
		super(id, length, length);
	}
	
	@Override
	public String getShapeType() 
	{
		return "Square";
	}
}
