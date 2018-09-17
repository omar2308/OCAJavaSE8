package ocajavase8.chp02;

public class IfControl {
	public static void main(String[] args) {
		if (false)
			for (int i = 0; i < 3; i++) {
				System.out.println(i);
				System.out.println(i + 1);
			}
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			System.out.println(i + 1);
		}

		int hourOfDay = 10;
		if (hourOfDay < 11) {
			System.out.println("Good Morning");
		} else if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}

		if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else if (hourOfDay < 11) {
			System.out.println("Good Morning"); // UNREACHABLE CODE
		} else {
			System.out.println("Good Evening");
		}

	}
}
