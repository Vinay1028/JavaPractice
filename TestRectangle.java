 class Rectangle {
	int length;
	int width;
	void insert(int length, int width)
	{
		this.length = length;
		this.width = width;
	}

	public int Area()
	{
		return length * width;
	}
}

public class TestRectangle{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		r1.insert(10,20);
		r2.insert(20,30);
		r3.insert(40, 50);
		System.out.println(r1.Area());
		System.out.println(r2.Area());
		System.out.println(r3.Area());
	}
}