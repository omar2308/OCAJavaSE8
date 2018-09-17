package pond.duck;

public class MotherDuck {
	String noise = "quack";    // default access

	void quack() {
		System.out.println(noise); // default access is ok
	}

	private void makeNoise() {
		quack(); // default access is ok
	}

}
