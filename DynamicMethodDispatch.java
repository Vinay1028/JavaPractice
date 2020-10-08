package OOPsPractice;
class Car{
	public void start() {System.out.println("Car has started");}
	public void accelerate() {System.out.println("Car is accelerated");}
	public void changeGear() {System.out.println("Gear is Changed");}
	static void staticMethod() {System.out.println("Static method test");}
}

class LuxuryCar extends Car{
	public void changeGear() {System.out.println("Automatic gear");}
	public void openSunRoof() {System.out.println("Sun Roof is Opened");}
}
public class DynamicMethodDispatch {
	public static void main(String[] args)
	{
		Car c = new LuxuryCar();
		c.start();
		//c.changeGear();
		c.accelerate();
		LuxuryCar l = new LuxuryCar();
		l.staticMethod();
		l.changeGear();
	}
}
