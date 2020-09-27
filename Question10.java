import java.util.Scanner;
public class Question10{
	static int digitSum(int num)
	{
		int sum =0;
		int remain;
		while(num > 0 )
		{
			remain = num%10;
			sum += remain;
			num /=10;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int sum = digitSum(num);
		System.out.println(sum);
	}
}