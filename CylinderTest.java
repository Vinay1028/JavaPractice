package OOPsPractice;
import java.util.Scanner;
class Cylinder{
	private double radius;
	private double height;
	
	Cylinder()
	{
		setRadius(1);
		setHeight(1);
	}
	
	Cylinder(double h)
	{
		setRadius(h);
		setHeight(h);
	}
	
	Cylinder(double radius, double height)
	{
		setRadius(radius);
		setHeight(height);
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double baseArea()
	{
		return Math.PI*radius*radius;
	}
	
	public double volume()
	{
		return baseArea() * height;
	}
	
	public double lateralSurface()
	{
		return 2 * Math.PI * radius * height;
	}
}
public class CylinderTest {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Cylinder r = new Cylinder(10,5);
		System.out.println(r.baseArea());
		System.out.println(r.lateralSurface());
		System.out.println(r.volume());
		r.setRadius(10);
		r.setHeight(10);
		System.out.println(r.baseArea());
		System.out.println(r.lateralSurface());
		System.out.println(r.volume());
		
	}
}
