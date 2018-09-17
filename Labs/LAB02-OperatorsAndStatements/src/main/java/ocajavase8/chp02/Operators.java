package ocajavase8.chp02;

public class Operators {
	public static void main(String[] args) {
		byte a = 127;
		byte r1 = (byte)(a + 3);
		System.out.println(r1);
		int b = 6;
		byte c = 127;
		byte result = (byte)(a + c);
		System.out.println(result);
		
		double d = 5.0;
		double result2 = b + d;
		
		float e = 3.0f;
	}
}
