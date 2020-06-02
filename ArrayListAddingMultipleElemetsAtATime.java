import java.util.Arrays;
import java.util.List;

public class ArrayListAddingMultipleElemetsAtATime {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9); //getting list elements in one line
		System.out.println(li.size());
		System.out.println(Arrays.toString(li.toArray()));	//printing list in one line
	}

}
