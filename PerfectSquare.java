import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		scan.close();
		if(isPerfectSquare(num) == true)
			System.out.println("Number is perfect square number.");
		else
			System.out.println("Number is not a perfect number");
		
	}
	
	public static boolean isPerfectSquare(double num)
	{
		double sq = Math.sqrt(num);
		if(sq - Math.floor(sq) == 0)
			return true;
		return false;
	}

}
