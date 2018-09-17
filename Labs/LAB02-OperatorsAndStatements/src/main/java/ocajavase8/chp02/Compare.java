package ocajavase8.chp02;

public class Compare {
	public static void main(String[] args) {
		String b = null;
		Compare c = null;
		boolean x = b == (Object)c;
		System.out.println(x);
	}
}
