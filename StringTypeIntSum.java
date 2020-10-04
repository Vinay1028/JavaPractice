public class StringTypeIntSum{
	static int sum(int a, int b)
	{
	return a+b;
	}
	public static void main(String[] args)
	{
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	System.out.println(sum(num1, num2));
}
}