import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAndReverseAList {
	public static void main(String[] args)
	{
		List<Integer> li = Arrays.asList(5,9,8,5,6,3,4);
		Collections.sort(li);
		Collections.reverse(li);
		for(int i : li)
		{
			System.out.println(i);
		}
	}
}
