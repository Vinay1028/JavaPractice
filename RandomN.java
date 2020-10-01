import java.util.Random;
public class RandomN{
	public static void main(String[] args)
	{
		int min = 1;
		int max = 6;
		double d = Math.random() * (max-min+1)+min;
		int a = (int) d;
		System.out.println(a);
		Random r = new Random();
		System.out.println(r.nextInt());
		int b = 'a';
		System.out.println(b);
	}
}