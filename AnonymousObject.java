
public class AnonymousObject {
	public int fact(int n)
	{
		int fact=1;
		for(int i = 2; i<=n; i++)
		{
			fact *=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println(new AnonymousObject().fact(5)); //anonymous object is used when we want to use object only once
	}

}
