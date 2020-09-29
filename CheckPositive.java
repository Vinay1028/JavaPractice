import java.util.Scanner;
public class CheckPositive{
	static String isPositive(int num)
	{
		if(num>0)
			return "Positive";
		else if(num <0)
			return "negative";
		else
			return "zero";
	}
	public static void main(String[] ath)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		String pos = isPositive(num);
		System.out.println(pos);
	}
	
}
