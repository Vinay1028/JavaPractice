package OOPsPractice;
class Rectangle{
	int length;
	int breadth;
	int x=10;
	Rectangle()
	{
		length = breadth = 1;
	}
	
	Rectangle(int l, int b)
	{
		length = l;
		breadth = b;
	}
}


class Cuboid extends Rectangle{
	int height;
	int x=20;
	Cuboid()
	{
		height =1;
	}
	
	Cuboid(int length, int breadth, int height)
	{
		super(length, breadth);
		this.height = height;
	}
	
	public int volume()
	{
		return length * breadth *height;
	}
	
	public void display()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
	
}
public class ConstructorDemmo1 {
	public static void main(String[] args)
	{
		Cuboid c = new Cuboid(10,20,30);
		System.out.println(c.volume());
		c.display();
	}
}
