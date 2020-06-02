import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args)
	{
		int[][] arr= {
				new int[5],
				new int[7],
				new int[4]
		};
		Scanner sc = new Scanner(System.in);
		for(int j=0; j<arr.length; j++)
		{
		for(int i=0; i<arr[j].length; i++)
		{
			arr[j][i]=sc.nextInt();
		}
		}
		sc.close();
		System.out.println(Arrays.deepToString(arr));
	}
}
