import java.util.Scanner;
public class FactorialPractice{
	static int fact(int n)
	{
		int f=1;
		for(int i=2; i<=n; i++)
		{
			f *=i;
		}
		return f;
	}
	static int fac(int n)
	{
		if(n<=1)
			return n;
		return n * fac(n-1);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(fact(num));
		System.out.println(fac(num));
	}
}
