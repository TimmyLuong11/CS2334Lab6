
public class Rectangle extends Polygon 
{
	private double height, width;
	
	public Rectangle(String id, double heigth, double width) 
	{
		super(id);
		// TODO Auto-generated constructor stub
		this.height = height;
		this.width = width;
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
