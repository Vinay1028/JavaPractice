import java.util.Scanner;
public class PositiveNegative {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		scan.close();
		if(num<0)
		{
			System.out.println("Number is negative.");
		}
		else {
			System.out.println("Number is positive.");
		}
	}
}
