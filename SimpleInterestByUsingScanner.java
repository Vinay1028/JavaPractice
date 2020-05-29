package basics;
import java.util.Scanner;

public class SimpleInterestByUsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		float rateOfInterest = sc.nextFloat();
		int time = sc.nextInt();
		float simpleInterest = (principal * rateOfInterest * time)/100;
		sc.close();
		System.out.println("The simple interest is "+simpleInterest);
	}

}
