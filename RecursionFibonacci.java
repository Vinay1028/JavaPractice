public class RecursionFibonacci {
	static int n1 = 0, n2=1, n3 = 0;
	public static void fib(int item)
	{
		if(item>0)
		{
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3+" ");
			fib(item-1);
		}
		
	}

	public static void main(String[] args) {
		int number =  15;
		System.out.println(n1+"\n"+n2);
		fib(number);

	}

}
