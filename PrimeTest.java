import java.util.Scanner;
public class PrimeTest{
	static boolean isprime(int num)
	{
		if(num == 0 || num == 1)
			return false;
		for(int i=2; i*i<=num; i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int count =0;
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		for(int i=start; i<=end; i++)
		{
			if(isprime(i))
			{
				++count;
			}
		}
		System.out.println(count);
	}
}