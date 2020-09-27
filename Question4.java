import java.util.Scanner;
public class Question4{
	static double area(double r)
	{
		return (3.14*r*r);
	}
	
	static double perimeter(double r)
	{
		return (2*3.14*r);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		sc.close();
		double a = area(radius);
		double p = perimeter(radius);
		System.out.println("Perimeter is = "+p);
		System.out.println("Area is = "+a);
		
	}
}