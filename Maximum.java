import java.util.Scanner;

public class Maximum {
	
	public int maxDigit(long number)
	{
		int  greatestDigit = 0;
		while(number>0)
		{
			long remainder = number%10;   
			if(remainder>greatestDigit)
				greatestDigit = (int)remainder;
			number = number/10;
		}
		return greatestDigit;
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number : ");
			long number = sc.nextLong();
			Maximum obj = new Maximum();
			System.out.println("The Max Digit is = "+obj.maxDigit(number));
			sc.close();
			

	}

}
