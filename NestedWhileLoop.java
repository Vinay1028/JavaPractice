package practice;

public class NestedWhileLoop {
	public static void main(String[] args)
	{
		int i=9, j=0;
		while(i>=0)
		{
			j=i;
			while(j>=0)
			{
				System.out.print(j+" ");
				j--;
			}
			System.out.println();
			i--;
		}
	}
}
