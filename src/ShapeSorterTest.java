import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);
		Shape e = new Trapezoid("test", 1.0, 2.0, 2.0, 4.0); 

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		sorter.addShape(e);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(4), e);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);
		Shape e = new Trapezoid("test", 1.0, 2.0, 2.0, 4.0); 

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		sorter.addShape(e);
		
		sorter.sortShapes();

		Assert.assertEquals(e, sorter.shapes.get(0));
		Assert.assertEquals(b, sorter.shapes.get(1));
		Assert.assertEquals(d, sorter.shapes.get(2)); 
		Assert.assertEquals(a, sorter.shapes.get(3));
		Assert.assertEquals(c, sorter.shapes.get(4));
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes(new ShapeAreaComparator());

		Assert.assertEquals(b, sorter.shapes.get(0));
		Assert.assertEquals(d, sorter.shapes.get(1));
		Assert.assertEquals(a, sorter.shapes.get(2));
		Assert.assertEquals(c, sorter.shapes.get(3));
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);
		Shape e = new Ellipse("test5", 1.5, 2.0);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		sorter.addShape(e);
		
		sorter.sortShapes(new ShapePerimeterComparator());

		Assert.assertEquals(d, sorter.shapes.get(0));
		Assert.assertEquals(e, sorter.shapes.get(1));
		Assert.assertEquals(a, sorter.shapes.get(2));
		Assert.assertEquals(b, sorter.shapes.get(3));
		Assert.assertEquals(c, sorter.shapes.get(4));
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		Shape a = new Square("A", 3.0);
		Shape b = new Rectangle("B", 3.0, 3.0);
		Shape c = new EquilateralTriangle("C", 4);
		Shape d = new Circle("D", 1.5);
		Shape e = new Ellipse("E", 1.5, 1.5);
		Shape f = new Trapezoid("test", 1.0, 2.0, 2.0, 4.0);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		sorter.addShape(e);
		sorter.addShape(f);
		
		Assert.assertEquals("[Square:	 ID = A	 area = 9.000	 perimeter = 12.000, Rectangle:	 ID = B	 area = 9.000	 perimeter = 12.000, EquilateralTriangle:	 ID = C	 area = 6.928	 perimeter = 12.000, Circle:	 ID = D	 area = 7.069	 perimeter = 9.425, Ellipse:	 ID = E	 area = 7.069	 perimeter = 9.425, Trapezoid:	 ID = test	 area = 2.905	 perimeter = 9.000]", sorter.toString());
	}
}
