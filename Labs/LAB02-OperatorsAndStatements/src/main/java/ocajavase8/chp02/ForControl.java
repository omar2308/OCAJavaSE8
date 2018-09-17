package ocajavase8.chp02;

public class ForControl {
	public static void main(String[] args) {
		int x = 0;
		int y;
		int z = 4;
		System.out.println("x:" + x + ",z:" + z);
		for (y = 0, x = 4; x < 5 && y < 10; x++, y++, z = z +1) {
			System.out.print(x + " ");
		}
		System.out.println("x:" + x + ",y:" + y + ",z:" + z);

	}
}
