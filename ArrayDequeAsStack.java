
import java.util.ArrayDeque;
public class ArrayDequeAsStack {
public static void main(String[] args)
{
	ArrayDeque<Integer> ad =  new ArrayDeque<>();
	ad.push(10);
	ad.push(45);
	ad.push(35);
	ad.push(20);
	System.out.println(ad);
	System.out.println(ad.peek());
	ad.pop();
	System.out.println(ad.pop());
	System.out.println(ad.peek());
}
}
