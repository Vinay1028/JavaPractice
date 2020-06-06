
public class MaxOfTwoNumbers {
	public static int max(int a, int b)
	{
		int max=0;
		if(a>b)
			max=a;
		else
			max=b;
		return max;
	}

	public static void main(String[] args) {
		int a = 55;
		int b = 8;
		System.out.println("The max number is : "+max(a,b));

	}

}
