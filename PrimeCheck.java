import java.util.Scanner;
public class PrimeCheck{
	static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
	for(int i=2; i*i<=n;  i++)
	{
		if(n%i == 0)
			return false;
	}
	return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		int count=0;
		for(int i = start; i<=end; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			count++;
			}
		}
		System.out.println("Total primes : "+count);
	}
}