package OOPsPractice;
class Rectangle{
	private double length;
	private double breadth;
	
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void setBreadth(double breadth)
	{
		this.breadth = breadth;
	}
	
	public double getBreadth()
	{
		return breadth;
	}
	
	double area()
	{
		return length * breadth;
	}
	
	Rectangle()
	{
		length =1;
		breadth = 1;
	}
	
	Rectangle(double l)
	{
		length = breadth = l;
	}
	
	Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
}
public class DataHiding {
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(10.0);
		//r.setBreadth(10.0);
		//r.setLength(10.0);
		System.out.println(r.area());
	}
}
