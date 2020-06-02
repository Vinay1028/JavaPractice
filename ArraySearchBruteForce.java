package practice;

public class ArraySearchBruteForce {
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,55,8};
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==55) {
				System.out.println("Found at index : "+i);
			}
		}
	}
}
