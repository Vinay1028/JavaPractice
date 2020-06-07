class Math{
	public int sqaure(int n)
	{
		return n*n;
	}
}

class Circle{
	int radius;
	final double PI = 3.14;
	Math m;
	public double area()
	{
		m = new Math();
		int rSquare = m.sqaure(5);
		return PI*rSquare;
	}
}
public class HasARelationShip {

	public static void main(String[] args) {
		Circle c = new Circle();
		double area = c.area();
		System.out.println(area);
	}

}
