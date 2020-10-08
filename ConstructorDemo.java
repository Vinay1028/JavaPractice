package OOPsPractice;
 class Parent{
	 Parent()
	 {
		 System.out.println("Parent Constructor");
	 }
 }
 
 class Child{
	 Child()
	 {
		 System.out.println("child Constructor");
	 }
 }
public class ConstructorDemo {
	public static void main(String[] args)
	{
		Child c = new Child();
	}
}
