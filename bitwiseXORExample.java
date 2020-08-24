import java.util.Scanner;
public class bitwiseXORExample {	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		scan.close();
		System.out.println("\nValues before swapping.\n");
		System.out.println(num1+"  "+num2);
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("\nValues after swapping.\n");
		System.out.println(num1+"  "+num2);
	}
}
