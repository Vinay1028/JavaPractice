class Animal{
	String color = "Blue";
}

class Dog extends Animal{
	String color = "White";
	void printColor(){
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class SuperToReferenceImmediateParentClassInstanceVariable {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.printColor();

	}

}
