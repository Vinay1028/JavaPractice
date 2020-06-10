interface Drawable{
	void draw();
	default void  msg() {
		System.out.println("Default method of interface");
	}
	}
public class DefaultMethodInInterface implements Drawable {
	public void draw()
	{
		System.out.println("Drawing method is being defined");
	}
	public static void main(String ...a) {

}
