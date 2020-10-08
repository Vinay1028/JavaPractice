package OOPsPractice;
import java.util.Scanner;
public class FibonacciSeries {
	static int x = 0, y = 1, z=0;
	public static void fib(int n)
	{
		if(n>0)
		{
			z = x+y;
			System.out.print(" "+z+" ");
			x=y;
			y=z;
			fib(n-1);
		}
	}
	
	public static int fibSpecific(int n)
	{
		if(n<=1)
			return n;
		return fibSpecific(n-1)+fibSpecific(n-2);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n; i++)
		{
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
		System.out.println();
		System.out.print(x+" "+y+" ");
		fib(n-2);
		System.out.println();
		System.out.println(fibSpecific(n));
	}
}
