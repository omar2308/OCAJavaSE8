package ocajavase8.chp02.preg;

public class Preguntas {
	public static void main(String[] args) {
		// 2
		int x = 1;
		// String message = x < 10 ? "Greater than" : false;
		System.out.println(x > 10 ? "Greater than" : false);
		while (x++ < 10) {
		}

		// 3
		int z = 4;
		// long y = z++ * 4 - z++;
		long y = z++ * 4 - z++;
		System.out.println("y:" + y + ",z:" + z);

		// 4
		boolean a = true, c = true;
		int b = 20;
		a = b != 10 ^ (c = false);
		System.out.println(a + ", " + b + ", " + c);

		// 6
		System.out.println("----------------");
		int count = 0;
		ROW_LOOP: for (int row = 1; row <= 3; row++)
			for (int col = 1; col <= 2; col++) {
				if (row * col % 2 == 0)
					continue ROW_LOOP;
				count++;
			}
		System.out.println(count);

		// 7
		System.out.println("----------------");
		final char ax = 'A', d = 'D';
		char grade = 'B';
		switch (grade) {
		case ax:
		case 'B':
			System.out.print("great");
		case 'C':
			System.out.print("good");
			break;
		case d:
		case 'F':
			System.out.print("not good");
		}
		
		long xx = 10;
		
	}
}
