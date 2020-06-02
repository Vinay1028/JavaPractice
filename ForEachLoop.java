import java.util.Arrays;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		List<Integer> grades = Arrays.asList(1,2,3,4,5,6,7,8,9);
		for(int g : grades)
		{
			System.out.println(g);
		}
	}

}
