import java.util.Scanner;
public class PalindromeCheck{
	static boolean isPalindrome(int num)
	{
		int temp = num;
		int rem, sum =0;
		while(num>0) {
			rem = num%10;
			sum = sum *10+rem;
			num = num/10;
		}
		if(sum == temp)
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(isPalindrome(num));
	}
}