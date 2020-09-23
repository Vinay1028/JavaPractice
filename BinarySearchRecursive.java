import java.util.Scanner;
public class BinarySearchRecursive {
	public static int binarySearch(int arr[],int low, int high, int key)
	{
		int mid = 0;
		if(low <= high)
		{
			 mid = (low+high)/2;
		if(arr[mid] == key)
			return mid;
		else if(arr[mid]<key)
			return binarySearch(arr, mid+1, high, key);
		else
			return binarySearch(arr, low, mid-1, key);
		}
		
	return -1;
	}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("How many elements you want in the array ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	int low = 0; 
	int high = arr.length-1;
	System.out.println("Enter the array elements");
	for(int i=0; i<arr.length; i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter the key element");
	int key = sc.nextInt(); 
	sc.close();
	int elementIndex = binarySearch(arr, low, high, key);
	if(elementIndex >= 0)
		System.out.println("Element is present at index "+elementIndex);
	else
		System.out.println("Element is not present");
}
}
