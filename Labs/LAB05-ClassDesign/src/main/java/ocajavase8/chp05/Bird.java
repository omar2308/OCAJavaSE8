package ocajavase8.chp05;

import java.io.IOException;

public abstract class Bird {
	private void fly() {
		System.out.println("Bird is flying");
	}

	public static void main(String[] args) {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		Bird bird = new Pelican();
		bird.fly();
		
		Pelican bird2 = new Pelican();
		bird2.fly();
	}
}

class Pelican extends Bird {
	protected int fly() {
		System.out.println("Pelican is flying");
		return 6;
	}
}
