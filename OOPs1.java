package OOPsPractice;
class Circle{
	double radius;
	void area()
	{
		System.out.println(Math.PI*radius*radius);
	}
	
}
public class OOPs1 {
	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.radius = 5;
		c.area();
	}

}
