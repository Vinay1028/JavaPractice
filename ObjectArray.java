package OOPsPractice;

public class ObjectArray {
	public static void main(String[] args)
	{
	Subject[] sub = new Subject[2];
	sub[0] = new Subject("abc", "maths",500,450);
	sub[1] = new Subject("abe", "science", 600,700);
	
	for(Subject s : sub)
	{
		System.out.println(s);
	}
	}
}
