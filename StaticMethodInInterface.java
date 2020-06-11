interface Drawaable{
	void draw();
	public static int cube(int n) {
		return n*n*n;
	}
}
public class StaticMethodInInterface implements Drawaable {
	public void draw()
	{
		System.out.println("Drawing something");
	}

	public static void main(String[] args) {
		Drawaable d = new StaticMethodInInterface();
		d.draw();
		System.out.println(Drawaable.cube(3));

	}

}
