import java.util.Scanner;
public class CheckingCharIsVowelOrNot {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		scan.close();
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("The character is vowel.");
			break;
		default:
			System.out.println("char is not vowel");
		}
	}
}
