import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
public static void main(String[] args)
{
	ArrayList<String> alist = new ArrayList<String>();
	alist.add("tanu");
	alist.add("Manu");
	alist.add("sanju");
	alist.add("raaz");
	alist.add("anita");
	for(String names : alist)
	{
		System.out.println(names);
	}
	Collections.sort(alist);
	System.out.println(alist);
	alist.add(2,"sanjay");
	System.out.println(alist);
	alist.set(0, "Rahul");
	System.out.println(alist);
	System.out.println(alist.get(1));
	alist.remove("raaz");
	System.out.println(alist);
	alist.remove(0);
	System.out.println(alist);
	System.out.println("arraylist size "+alist.size());
	alist.clear();
	System.out.println(alist);
}
}
