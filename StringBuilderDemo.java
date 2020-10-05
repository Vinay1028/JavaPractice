public class StringBuilderDemo {
	public static void main(String[] args)
	{
		String s = "Vinay";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb);
		System.out.println(sb.reverse());
		sb.setCharAt(0, 'm');
		System.out.println(sb);
		System.out.println(s.replace('a', 'd'));
		System.out.println(s);
		String a = new String("vinay");
		String b = "vinay";
		System.out.println(a==b);
	}
}
