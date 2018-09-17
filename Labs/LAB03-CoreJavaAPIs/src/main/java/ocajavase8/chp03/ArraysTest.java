package ocajavase8.chp03;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		int[] numbersx;
		int[] numbers0 = new int[3];
		int[] numbers1 = new int[] { 42, 55, 99 };
		int[] numbers2 = { 42, 55, 99 };

		// System.out.println(numbersx);
		// System.out.println(numbersx.length); // nullPointer
		System.out.println(numbers0.length);
		System.out.println(numbers1.length);
		System.out.println(numbers2.length);

		Names vnames = new Names();
		System.out.println(vnames.names);
		// System.out.println(vnames.names[0]); //NullPointer

		System.out.println("----------------");
		String[] strings = { "stringValue" };
		Object[] objects = strings;
		// Object[] objects = new Object[1];
		String[] againStrings = (String[]) objects;
		// againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
		// objects[0] = new StringBuilder();

		System.out.println("----------------");
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");

		System.out.println("----------------");
		String[] stringsx = { "10", "9", "100" };
		Arrays.sort(stringsx);
		for (String string : stringsx)
			System.out.print(string + " ");

		System.out.println("----------------");
		int[] numbersb = new int[] { 3, 2, 1 };
		System.out.println(Arrays.binarySearch(numbersb, 2));
		System.out.println(Arrays.binarySearch(numbersb, 3));
		
		metodo(numbersb);
		metodo(2,3,4,5);
		
		String [][][] rectangle = new String[3][][];
		
		int [][] argsx = new int[4][];
		System.out.println(argsx[1]);
		
		int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
		System.out.println(differentSize[0].length);
		System.out.println(differentSize[2].length);
	}
	
	private static void metodo(int... args) {
		System.out.println(args.length);
	}
}

class Names {
	String names[];
}
