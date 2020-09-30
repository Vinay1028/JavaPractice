import java.util.Scanner;
public class FactorialUsingLoop{
	static int fact(int num)
	{
		int f=1;
		for(int i=num; i>1; i--)
		{
			f *= i;
		}
		return f;
	}
	static int fac(int num)
	{
		if(num==0 || num==1)
			return 1;
		return num*fac(num-1);
		
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
