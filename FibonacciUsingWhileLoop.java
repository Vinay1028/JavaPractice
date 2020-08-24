public class FibonacciUsingWhileLoop {
	public static void main(String[] args)
	{
		int count = 7;
		int num1 = 0, num2 = 1;
		System.out.print(num1+" "+num2);
		while(count>2)
		{
			int num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			System.out.print(" "+num3);
			count--;
		}
		
	}
}
