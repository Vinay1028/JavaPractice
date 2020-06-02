import java.util.Arrays;
import java.util.List;

public class PritingArrayListWithLoop {
	public static void main(String[] args)
	{
		List<Integer> li= Arrays.asList(1,2,3,4,5);
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
	}
}
