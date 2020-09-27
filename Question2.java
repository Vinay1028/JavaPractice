import java.util.Scanner;
public class Question2{
	static int sumOfTwoNum(int f, int s)
	{
		return f+s;
	}
	 static int divide(int  f, int s)
	 {
		 if(s==0)
			 return -1;
		 return f/s;
	 }
	 static int multiplication(int f, int s)
	 {
		 return f*s;
	 }
	 static int remainder(int f, int s)
	 {
		 return f%s;
	 }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
		int sum = sumOfTwoNum(num1, num2);
		System.out.println(sum);
		double division = divide(num1,num2);
		System.out.println(division);
		System.out.println( 20 + -3*5 / 8);
		int mult = multiplication(num1,num2);
		System.out.println(mult);
		int remaind = remainder(num1,num2);
		System.out.println(remaind);
	}
}
