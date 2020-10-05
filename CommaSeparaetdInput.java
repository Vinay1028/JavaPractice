import java.util.Scanner;
public class CommaSeparaetdInput {
	public static void main(String[] args)
	{
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		String s = "20,30,40,50,60";
		for(int i=0; i<5; i++)
		{
			arr =  s.split(",");
			System.out.println(arr[i]);
		}
	}
}
