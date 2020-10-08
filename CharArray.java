package OOPsPractice;

import java.util.Scanner;

public class CharArray{
	
	public static  void display(char arr[])
	{
		for(int i=0; i<10; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static  char[] toLowercase(char[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] >= 45 && arr[i]<=90)
			{
				arr[i] = (char)(arr[i]+32);
			}
		}
		return arr;
	}
	
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		char[] c  = new char[10];
		for(int i=0; i<10; i++)
		{
			c[i] = sc.next().charAt(0);
		}
		sc.close();
		display(c);
		display(toLowercase(c));
		
	}
}