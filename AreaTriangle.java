import java.util.Scanner;
public class AreaTriangle {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the width of the triangle : ");
		double base = scan.nextDouble();
		System.out.println("Enter the height of the triangle : ");
		double height = scan.nextDouble();
		scan.close();
		double area = (base*height)/2;
		System.out.println("Area of triangle is "+area);
	}
}
