import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListDemo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> all = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		ArrayList<Integer> al = new ArrayList<Integer>(all);
		
		
		/*for(int i=0; i<10; i++)
		{
			al.add(sc.nextInt());
		}*/
		al.add(0, 500);
		al.add(10,555);
		al.add(1,999);
		
		
		sc.close();
		System.out.println(al);
		System.out.println(al.indexOf(555));
		System.out.println(al.size());
		Collections.sort(al);
		System.out.println(al);
	}
}
