package practice;
import java.util.Scanner;
import java.util.Arrays;
public class VariableLengthArray {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements :");
		for(int i=0; i<size; i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		input.close();
	}
}
