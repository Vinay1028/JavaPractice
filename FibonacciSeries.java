import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 1;
		int num3;
		int n = sc.nextInt();
		System.out.print(num1+" "+num2+" ");
		sc.close();
		for(int i=3; i<n; i++)
		{
			num3 = num1+num2;
			System.out.print(num3+" ");
			num1 = num2;
			num2 = num3;
		}
	}
}
