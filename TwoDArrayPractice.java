import java.util.Scanner;

public class TwoDArrayPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = {
					new int[4],
					new int[7],
					new int[5]
		};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
