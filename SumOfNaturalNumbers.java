import java.util.Scanner;
public class SumOfNaturalNumbers {
	public static void main(String[] args)
	{
		int count = 1, sum = 0;
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		//using while loop 
		while(count<=num)
		{
			sum += count;
			count++;
		}
		System.out.println(sum);
		
		//resetting sum value
		sum = 0;
		
		//using for loop
		for(count = 1; count<=num; count++)
		{
			sum += count;
		}
		System.out.println(sum);
	}
}
