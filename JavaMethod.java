
public class JavaMethod {
	
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int subtract(int a, int b)
	{
		return a-b;
	}
	public static int multiply(int a, int b)
	{
		return a*b;	
	}
	public static double division(double a, double b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		System.out.println("The addition is : "+add(5,3));
		System.out.println("The subtraction is : "+subtract(7,6));
		System.out.println("the product is : "+multiply(8,5));
		System.out.println("the division is : "+division(10,3));
	}

}
