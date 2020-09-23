import java.math.BigInteger;
import java.util.Scanner;
public class ScannerTest {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		System.out.println(d);
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println(str);
		String s = sc.next();
		System.out.println(s);
		BigInteger b = sc.nextBigInteger();
		System.out.println(b);
		sc.close();
		}
}
