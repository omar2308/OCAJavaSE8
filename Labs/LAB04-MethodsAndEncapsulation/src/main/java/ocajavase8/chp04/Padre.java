package ocajavase8.chp04;

public class Padre {
	static {
		System.out.println("static Padre");
	}
	{
		System.out.println("bloque instancia padre");
	}
	public Padre() {
		System.out.println("Instancia padre");
	}
}
