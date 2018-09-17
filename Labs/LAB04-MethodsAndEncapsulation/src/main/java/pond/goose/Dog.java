package pond.goose;

public class Dog extends Gosling{
	public void swim2() {
		floatInWater(); // calling protected member
		System.out.println(text); // calling protected member
	}
}
