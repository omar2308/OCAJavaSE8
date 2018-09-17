package pond.shore;

public class Bird {
	protected String text = "floating"; // protected access

	protected void floatInWater() { // protected access
		System.out.println(text);
	}
	
	protected void callBird() {
		Bird bird = new Bird();
		bird.floatInWater();
	}
}
