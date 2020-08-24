import java.util.Scanner;
public class CompoundInterest {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principal Amount : ");
		double P = scan.nextDouble();
		System.out.println("Enter the interest rate : ");
		double IR = scan.nextInt();
		double R = IR/100;
		System.out.println("Enter no of times interest is compounded per unit : ");
		double n = scan.nextInt();
		System.out.println("Enter the no of years");
		double t = scan.nextDouble();
		scan.close();
		double amount = P * Math.pow(1+(R/n), n*t);
		System.out.println("amount : "+amount);
		double compoundInterest = amount - P;
		System.out.println("Compound interest is : "+compoundInterest);
		
		
	}
}
