package pond.goose;

import pond.shore.Bird;
import pond.swan.Swan;

public class Gosling extends Bird { // extends means create subclass
	public void swim() {
		floatInWater(); // calling protected member
		System.out.println(text); // calling protected member
	}
	
	protected void callBird2() {
		Bird bird = new Bird();
		//bird.floatInWater(); // No compila
		
		Swan other = new Swan();
		//other.floatInWater(); // No compila
		//System.out.println(other.text);// No compila
		
		Gosling other2 = new Gosling();
		other2.floatInWater(); // package access to superclass
		System.out.println(other2.text);// package access to superclass
	}
}
