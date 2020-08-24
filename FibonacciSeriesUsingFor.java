public class FibonacciSeriesUsingFor {
	public static void main(String[] args)
	{
		int count = 7, num1 = 0, num2 = 1;
		System.out.println(num1+"\n"+num2);
		for(int i=2; i<count; i++)
		{
			int num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			System.out.println(num3+" ");
		}
	}
}
