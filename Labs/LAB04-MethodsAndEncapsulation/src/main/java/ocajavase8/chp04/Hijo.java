package ocajavase8.chp04;

public class Hijo extends Padre{
	private static final int VALUE = 8;
	static {
		System.out.println("static hijo");
	}
	{
		System.out.println("bloque instancia hijo");
	}
	public Hijo() {
		System.out.println("Instancia hijo");
	}
	
	public static void main(String[] args) {
		System.out.println("Echo");
		Hijo hijo = new Hijo();
		System.out.println("Fin");
		Hijo hijo2 = new Hijo();
		System.out.println("Fin2");
	}
}
