import java.util.Scanner;
public class Question6 {
	static double area(double l, double b)
	{
		return l*b;
	}
	
	static double perimeter(double l, double b)
	{
		return 2*(l+b);
	}
	
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	double length = sc.nextDouble();
	double breadth = sc.nextDouble();
	sc.close();
	double a = area(length, breadth);
	double p = perimeter(length, breadth);
	System.out.println("Perimeter = "+p);
	System.out.println("Area = "+a);
}
}
