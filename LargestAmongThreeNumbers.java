import java.util.Scanner;
public class LargestAmongThreeNumbers {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number : ");
		double num2 = scan.nextDouble();
		System.out.println("Enter the third number");
		double num3 = scan.nextDouble();
		scan.close();
		
		double tmp = num1 > num2 ? num1 : num2;
		double largest = num3 > tmp ? num3 :tmp;
		System.out.println(largest);
	}
}
