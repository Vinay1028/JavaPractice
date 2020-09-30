import java.util.Scanner;
public class FibonacciLoop{
	static int num1 = 0, num2 = 1, num3 = 0;
	static void fibRecursion(int num)
	{
		if(num>0)
		{
			num3 = num1+num2;
			System.out.print(num3+" ");
			num1 = num2;
			num2 = num3;
			fibRecursion(num-1);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 1, num3 = 0;
		int length = sc.nextInt();
		sc.close();
		System.out.print(num1+" "+num2+" ");
		for(int i=2; i<length; i++)
		{
			num3 = num1 + num2;
			System.out.print(num3+" ");
			num1 = num2;
			num2 = num3;
		}
		System.out.println();
		System.out.print(FibonacciLoop.num1+" "+FibonacciLoop.num2+" ");
		fibRecursion(length);
	}
}