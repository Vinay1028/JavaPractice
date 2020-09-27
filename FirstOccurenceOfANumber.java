
import java.util.Scanner;
public class FirstOccurenceOfANumber {
	static int firstOccur(int arr[], int low, int high, int key)
	{
		while(low<=high)
		{
			int mid = (low+high)/2;
			if((mid == 0 || key>arr[mid-1]) && arr[mid] == key)
				return mid;
			else if(key>arr[mid])
				low = mid+1;
			else 
				high = mid - 1;
		}
		return -1;
	}
	static int  lastOccur(int arr[], int low, int high, int key)
	{
		while(low<=high)
		{
			int mid = (low+high)/2;
			if((mid == arr.length - 1 || key < arr[mid+1]) && arr[mid] == key )
				return mid;
			else if(key < arr[mid])
				high = mid - 1;
			else 
				low = mid + 1;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int low =0;
		int high = arr.length - 1;
		System.out.println("Enter array elements");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int key = sc.nextInt();
		sc.close();
		int index = firstOccur(arr, low, high, key);
		if(index >=0)
			System.out.println("index = "+index);
		else
			System.out.println("Item is not present");
		System.out.println("Last Index = "+lastOccur(arr, low, high, key));
	}
}
