class A{
	A(){
		System.out.println("parent class constructor is invoked.");
	}
}
class B extends A{
	B(){
		super();			//after the parent class constructor immediately instance block will be invoked
		System.out.println("Child class constructor is invoked.");
	}
	
	{System.out.println("instance block is invoked");}
}
public class InstanceBlockOrderOfExecution {

	public static void main(String[] args) {
		B b = new B();
		A a = new B();
	}

}
