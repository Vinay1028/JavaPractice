
public class OverloadingDifferentNoOfParameters {
	
	static int sum(int number1, int number2)
	{
		return number1+number2;
	}
	
	static int sum(int number1, int number2, int number3)
	{
		return number1+number2+number3;
	}
	public static void main(String[] args)
	{
		System.out.println(OverloadingDifferentNoOfParameters.sum(5, 10));
		System.out.println(OverloadingDifferentNoOfParameters.sum(5, 4, 1));
		
	}
}
