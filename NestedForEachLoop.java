import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedForEachLoop {

	public static void main(String[] args) {
		List<List<Integer>> li = new ArrayList<List<Integer>>();
		li.add(Arrays.asList(1,2,3,4,5));
		li.add(Arrays.asList(6,7,8,9,10));
		li.add(Arrays.asList(11,12,13,14,15));
		
		for(List<Integer> lis : li)
		{
			for(int list :lis)
			{
				System.out.print(list+" ");
			}
			System.out.println();
		}
	}

}
