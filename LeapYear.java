import java.util.Scanner;
public class LeapYear{
	static boolean isLeap(int n)
	{
		if((n%4==0) && (n%100!=0) || (n%400==0))
			return true;
		else 
			return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if(isLeap(num))
			System.out.println("Leap Year");
		else 
			System.out.println("Not Leap Year");
		
	}
}