import java.util.Scanner;

public class UserInputScanner {
	public static void main(String[] args)
	{
		boolean b;
		byte byt;
		char ch;
		short shor;
		int inte;
		long log;
		float floa;
		double doubl;
		Scanner sc = new Scanner(System.in);
		b = sc.nextBoolean();
		byt = sc.nextByte();
		ch = sc.next().charAt(0);
		shor = sc.nextShort();
		inte = sc.nextInt();
		log = sc.nextLong();
		floa = sc.nextFloat();
		doubl = sc.nextDouble();
		sc.close();
		System.out.println(b+" "+byt+" "+ch+" "+shor+" "+inte+" "+log+" "+floa+" "+doubl);
	}
}
