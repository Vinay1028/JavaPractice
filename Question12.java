import java.util.Scanner;
public class Question12{
	static double areaOfPolygon(int n, int s)
	{
		double area;
		area =  (n * (s*s))/(4*Math.tan(Math.PI/n));
		return area;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		int noOfSide = sc.nextInt();
		sc.close();
		double area = areaOfPolygon(side, noOfSide);
		System.out.println(area);
	}
}