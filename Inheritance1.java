package OOPsPractice;

public class Inheritance1 {
	public static void main(String[] args)
	{
		
		Cylinderr ci = new Cylinderr(10);
		System.out.println(ci.area());
		System.out.println(ci.volume());
		System.out.println(ci.perimeter());
	}
}

class Cylinderr extends Circlee{
	double height;
	Cylinderr(int r)
	{
		super(10);
		System.out.println("cylinder");
		height = 0.0;
		
	}
	double volume()
	{
		return area() * height;
	}
}
