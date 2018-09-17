package ocajavase8.chp05;

public class Zebra extends Animal {
	public Zebra(int age) {
		super(age);
	}

	// static int metodo() {return 4;}
	public Zebra() {
		this(4);
	}
}

class Dog extends Zebra{}
