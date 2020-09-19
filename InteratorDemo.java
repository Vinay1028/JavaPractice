import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class InteratorDemo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		sc.close();
		Iterator<Integer> it = al.iterator();
		while(it.hasNext())
		{
			int val = it.next();
			System.out.println(val);
		
		
		if(val%2 != 0)
			it.remove();
		}	
		System.out.println(al);
	}
}
