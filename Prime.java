import java.util.Scanner;

public class Prime{
	public boolean isPrime(int number)
	{
		int i = 0;
		for( i=2; i*i<number; i++)
		{
			if(number%i == 0)
				return false;
		}
		return true;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		Prime obj = new Prime();
		if(obj.isPrime(number))
			System.out.println("Number is Prime.");
		else
			System.out.println("Number is not Prime");
		sc.close();
	}
}
