import javax.security.auth.x500.X500Principal;

public class StringTest {
	public static void main(String[] args)
	{
		String s = "     Vinaya";
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s);
		String q = "";
		q += Character.toLowerCase(s.charAt(0));
		String str = s.trim().substring(1,4);
		System.out.println(str);
		System.out.println(s.trim().startsWith("Vin"));
		System.out.println(s.trim().endsWith("nay"));
		System.out.println(s.trim().indexOf('a'));
		System.out.println(s.trim().lastIndexOf('a'));
		s = s.toString();
		System.out.println(s);
		System.out.println(s.contains("V"));
		Integer x = 123;
		System.out.println(x.equals(123));
		String c ="";
		 c = c.valueOf(65);
		System.out.println(c.getClass().getName());
		int a = 20, b = 30;
		System.out.println("sum" +a+b);
	}
}
