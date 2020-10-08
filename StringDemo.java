package OOPsPractice;
import java.util.Scanner;
public class Stringdemo{
	public static  String toLowerCase(String s)
	{
		String temp = "";
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i)>=45 && s.charAt(i)<=90)
			{
			   temp += (char) (s.charAt(i)+32);
			}
		}
		return temp;
	}
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s);
		System.out.println();
		System.out.println(toLowerCase(s));
		
	}
}