import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
public class ArrayListTest {
	public static void main(String[] args)
	{
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Rahul");
		alist.add("Sooraj");
		alist.add("Pakhi");
		alist.add("Ria");
		alist.add(2,"Raju");
		
		//printing using for loop
		for(int counter=0; counter<alist.size(); counter++)
		{
			System.out.println(alist.get(counter));
		}
		System.out.println("\n");
		
		
		//printing using for each loop
		for(String str : alist)
		{
			System.out.println(str);
		}
		System.out.println("\n");
		
		//printing using while loop
		int count=0;
		while(alist.size() > count)
		{
			System.out.println(alist.get(count));
			count++;
		}
		System.out.println("\n");
		
		//printing using iterator
		Iterator<String> i = alist.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("\n");
		
		
		//printing using Enumeration
		Enumeration<String> e = Collections.enumeration(alist);
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
	}
}
