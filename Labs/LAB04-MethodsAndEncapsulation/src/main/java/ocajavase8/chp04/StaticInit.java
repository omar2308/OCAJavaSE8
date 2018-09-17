package ocajavase8.chp04;

public class StaticInit {
	private static int one;
	private static final int two;
	static final int three = 3;
	private static final int four; // DOES NOT COMPILE
	static {
		one = 1;
		two = 2;
		//three = 3; // DOES NOT COMPILE
		//two = 4; // DOES NOT COMPILE
	}
	
	static {
		four = 8;
		one = 2;
		//two = 6;
	}
	
	public static void main(String[] args) {
		System.out.println("---- one = " + one);
	}

}
