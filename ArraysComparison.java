package practice;
import java.util.Arrays;
public class ArraysComparison {
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,33,5,6};
		int[] arr2 = {1,2,33,5,6};
		/*if(arr1 == arr2)					//will not work because we are comparing objects not values
		{
			System.out.println("equal");
		}*/
		
		/*if(arr1.equals(arr2))				//will not work because these are separate arrays
		{
			System.out.println("equal");
		}*/
		if(Arrays.equals(arr1,arr2))
		{
			System.out.println("both are equal");
		}
	}
}
