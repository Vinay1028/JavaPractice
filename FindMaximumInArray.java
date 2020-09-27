import java.util.Scanner;
public class FindMaximumInArray {
	static int findElement(int[] arr)
	{
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max) 
				max = arr[i];
		}
		return max;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		int maximum = findElement(arr);
		System.out.println(maximum);
	}
}
