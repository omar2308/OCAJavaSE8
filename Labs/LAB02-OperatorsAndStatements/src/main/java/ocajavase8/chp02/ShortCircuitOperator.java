package ocajavase8.chp02;

public class ShortCircuitOperator {
	public static void main(String[] args) {
		int x = 6;
		boolean y = (x >= 6) || (++x <= 7);
		System.out.println(x);
		y = ((x=7) >= 6) || (++x <= 7);
		System.out.println(x);
		y = (x >= 6) | (++x <= 7);
		System.out.println(x);
	}
}
