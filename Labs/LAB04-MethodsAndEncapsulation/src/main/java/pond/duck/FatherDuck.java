package pond.duck;

public class FatherDuck {
	private String noise = "quack";

	private void quack() {
		System.out.println(noise); // private access is ok
	}

	private void makeNoise() {
		quack(); // private access is ok
	}
	
	private void other() {
		FatherDuck duck = new FatherDuck();
		duck.quack();
	}
	
	public void otherquack() {
		quack();
	}
	
	public static void main(String[] args) {
		FatherDuck duck = new FatherDuck();
		duck.noise = "guau";
		duck.quack();
	}

}

class Other{
	private void callFatherDuck() {
		FatherDuck duck = new FatherDuck();
		//duck.quack();  // DOES NOT COMPILE
	}
}
