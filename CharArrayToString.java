public class CharArrayToString {
	public static void main(String[] args)
	{
		char[] arr = {'v','i','n','a','y'};
		String s = new String(arr);
		System.out.println(s);
		System.out.println(s.charAt(0));
		String s1 = new String("VINAYA");
		System.out.println(s.compareTo(s1));
		System.out.println(s.startsWith("vin"));
		System.out.println(s.indexOf("vin"));
		System.out.println(s.hashCode());
		System.out.println(s.replace('v', 'm'));
		System.out.println(s);
		char[] a = s.toCharArray();
		System.out.println(a.length);
		System.out.println(a);
		char[] ab = {'v','i','n'};
		System.out.println(ab);
		int[] c = {1,2,3,4,5};
		System.out.println(c);
		String i = "123";
		int p = Integer.valueOf(i);
		System.out.println(p);
		System.out.println(Integer.valueOf(i).getClass().getName());
	}
}
