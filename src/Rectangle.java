
public class Rectangle extends Polygon 
{
	private double height, width;
	
	public Rectangle(String id, double height, double width) 
	{
		super(id);
		this.height = height;
		this.width = width;
		sideLengths.add(height); 
		sideLengths.add(height);
		sideLengths.add(width); 
		sideLengths.add(width);
	}

	@Override
	public double getArea() 
	{
		// TODO Auto-generated method stub
		return height*width;
	}

	@Override
	public String getShapeType() 
	{
		// TODO Auto-generated method stub
		return "Rectangle";
	}

}
