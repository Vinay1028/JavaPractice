import java.util.Scanner;
public class StringCase {
	
	static String toUpper(String s)
	{
		String temp="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>= 65 && s.charAt(i)<=90)
			{
				temp += (char) (s.charAt(i)+32);
			}
		}
		return temp;
	}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String str = toUpper(s);
	System.out.println(str);
}
}
