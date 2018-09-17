package ocajavase8.chp02;

public class SwitchSample {
	public static void main(String[] args) {
		int y = 1;
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue;
				System.out.print(" " + a + x);
			}
		}
	}
}
