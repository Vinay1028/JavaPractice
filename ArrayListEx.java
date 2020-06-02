import java.util.List;
import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(5);
		num.add(10);
		num.add(15);
		num.add(50);
		num.add(38);
		num.add(1,10);
		System.out.println(num.get(1));  //get() method to get value at specific index
		System.out.println(num.indexOf(50)); //indexOf() method is to get index of a particular value
		System.out.println(num.contains(1));  //contains method checks the particular value in the list and returns boolean
		System.out.println(num.isEmpty()); //isEmpty() is used to check list is empty or not
		System.out.println(num.remove(1)); //remove() method removes specified item at the position
		num.clear(); //clear() method removes everything
	}

}
