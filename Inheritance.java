class Animal{
	public void eat()
	{
		System.out.println("Eating.......");
	}
}

class Dog extends Animal{
	public void bark()
	{
		System.out.println("Barking......");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();

	}

}
