package ocajavase8.chp02;

public class UnariOperators {
	public static void main(String[] args) {
		int x = 3;
		int y = x-- + (--x * 10);
		System.out.println(y);
		System.out.println(x);
		x = 3;
		y = x-- + --x * 10;
		System.out.println(y);
		System.out.println(x);
		
		long a = 10;
		int b = 5;
		b *= a;
		//b = b*a;
		
		long l1 = Long.MAX_VALUE -1;
		long l2 = Long.MAX_VALUE -1;
		long l3 = l1 + l2;
		System.out.println(l3);
		long l4 = 6;
		l4 += 5;
		System.out.println("l4=" +l4);
		l4 = + 5;
		System.out.println("l4=" +l4);
		
		if(x==(x=3)) {
			System.out.println("x=1");
		}
		System.out.println(x);
	}
}
