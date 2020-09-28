import java.util.Scanner;
public class Question11{
	static double areaOfHexagon(int s)
	{
		double area;
		area = (6* (s*s))/(4*Math.tan(Math.PI/6));
		return area;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		sc.close();
		double area = areaOfHexagon(side);
		System.out.println(area);
	}
}