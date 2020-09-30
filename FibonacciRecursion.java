import java.util.Scanner;
public class FibonacciRecursion {
	static int n1 =0, n2 = 1, n3;
	static void printFibonacci(int n)
	{
		if(n>0)
		{
			n3 = n1+n2;
		n1 = n2;
		n2 = n3;
		System.out.println(n3);
		printFibonacci(n-1);
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n1+ " "+n2+" ");
		
		printFibonacci(n-2);
	}
}
