import java.util.Scanner;
public class Palindrome{
	static boolean isPalindrome(String s)
	{
		String reverse = "";
		int length = s.length();
		for(int i=length-1; i>=0; i-- )
			reverse +=s.charAt(i);
		if(reverse.equals(s))
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println(isPalindrome(s));
	}
}