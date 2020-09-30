import java.util.Scanner;
public class PalindromeStringCheck{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String original, reverse="";
		original = sc.nextLine();
		int oLength = original.length();
		for(int i=oLength-1; i>=0; i--)
		{
			reverse += original.charAt(i);
		}
		if(reverse.equals(original))
		{
			System.out.println("String is Palindrome");
		}
		else
			System.out.println("String is not Palindrome");
	}
}