import java.util.Scanner;
public class AddTwoNumbers {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = scan.nextInt();
		scan.close();
		int sum = num1+num2;
		System.out.println(sum);
	}
}
