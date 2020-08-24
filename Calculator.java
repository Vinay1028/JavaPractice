public class Calculator{
	int number1;
	int number2;
	
	public Calculator(int number1, int number2)
	{
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public int Add()
	{
		return number1+number2;
	}
	
	public int Subtract()
	{
		return number1 - number2;	
	}
	
	public int Divide()
	{
		return number1/number2;
	}
}