import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListDemo2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<10; i++)
		al.add(sc.nextInt());
		sc.close();
		Integer[] arr = new Integer[al.size()];
		arr = al.toArray(arr);
		for(int i=0; i<10; i++)
		System.out.println(arr[i]);
		Object[] obj = al.toArray();
		System.out.println(obj[2]);
		for(int i=0; i<10; i++)
		{
			System.out.println(al.get(i));
		}
		al.removeAll(al1);
		al.remove(new Integer(10));
		al.clear();
		
		System.out.println(al.contains(8));
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al);
	}
}
