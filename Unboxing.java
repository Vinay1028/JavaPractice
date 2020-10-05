import java.util.ArrayList;
public class Unboxing{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList();
		for(int i=0; i<10; i++)
		{
			al.add(i);
		}
		Integer[] arr= new Integer[al.size()];
		/*for(int i=0; i<10; i++)
		{
			arr[i] = al.get(i);
		}*/
		
		al.toArray(arr);
	
		for(int i=0; i<10; i++)
		{
			System.out.println(arr[i].getClass().getName());
		}
	}
}