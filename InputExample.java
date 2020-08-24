import java.util.Scanner;
public class InputExample {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number1 = scan.nextInt();
		System.out.println(number1);
		scan.close();
	}
}
