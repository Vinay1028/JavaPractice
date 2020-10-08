package OOPsPractice;

public class TestingPrivate {
		private void name()
		{
			System.out.println("My name is vinay singh");
		}
		
		private static void display()
		{
			System.out.println("Stattic method");
		}
		
		public static void main(String[] args)
		{
			TestingPrivate.display();
			TestingPrivate t = new  TestingPrivate();
			t.name();
			t.display();
		}
}
