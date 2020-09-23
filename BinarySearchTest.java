import java.util.Scanner;
public class BinarySearchTest {
	public static  int binarySearch(int arr[], int key)
	{
		int low =0;
		int high = arr.length - 1;
		while(low<high)
		{
			int mid = (low+high)/2;
			if(arr[mid] == key)
				return mid;
			else if(arr[mid]<key)
				low = mid+1;
			else
				high = mid-1;
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to insert in the array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the key element :");
		int key = sc.nextInt();
		sc.close();
		int elementIndex = binarySearch(arr, key);
		if( elementIndex >= 0)
			System.out.println("Item is present at index "+elementIndex);
		else
			System.out.println("item is not present");
	}
}