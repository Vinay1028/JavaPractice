import java.util.Scanner;
public class ArmstrongNumber{
	static boolean isArmstrong(int num)
	{
		int sum =0;
		int temp = num;
		int rem;
		while(num>0)
		{
			rem = num%10;
			sum +=rem*rem*rem;
			num /=10;
		}
		if(sum == temp )
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(isArmstrong(num));
	}
}