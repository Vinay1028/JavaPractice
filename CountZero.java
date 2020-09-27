import java.util.Scanner;
public class CountZero {
	static int firstZero(int[] arr)
	{
		int low = 0; 
		int high = arr.length-1;
		int mid = 0;
		while(low<=high)
		{
			mid = (low+high)/2;
			if((mid == 0 || arr[mid-1] == 1) && arr[mid] == 0)
				return mid;
			else if(arr[mid] == 1)
				low = mid+1;
			else
				high = mid-1;
		}
		return -1;
	}
	 
	static int totalZeroes(int[] arr)
	{
		int count = firstZero(arr);
		if(count == - 1)
			return 0;
		return arr.length - count;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		int count = totalZeroes(arr);
		if(count >= 0)
		System.out.println("Total Zeroes = "+count);
		else 
			System.out.println("No zeroes in the array");
	}
}
