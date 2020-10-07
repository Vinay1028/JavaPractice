import java.util.Scanner;
public class CheckNumberIsBinary{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s.matches("[0-9A-F]+"));
		//removing special characters from a string
		String str = sc.next();
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		String temp = sc.nextLine();
		temp = temp.replaceAll("\\s+", " ");
		System.out.println(temp);
		String[] wordss = temp.split("\\s");
		System.out.println(wordss.length);
		Character c = new Character('A');
		System.out.println(c.toLowerCase(c));
		System.out.println(c);
	}
}
 