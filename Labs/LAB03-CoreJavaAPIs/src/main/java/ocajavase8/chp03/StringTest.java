package ocajavase8.chp03;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "nuevo";
		String str2 = new String("nuevo");
		String str3 = "nuevo";
		String str4 = new String("nuevo");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str4);
		System.out.println(str1.equals(str2));  //String implementa equals
		
		System.out.println("---------------------");
		Integer int1 = 2;
		Integer int2 = 2;
		Integer int3 = new Integer(2);
		System.out.println(int1 == int2);
		System.out.println(int2 == int3);
		
		System.out.println("---------------------");
		String string = "animals";
		System.out.println(string.substring(3, 7));
		//System.out.println(string.substring(3, 8));
		
		System.out.println("abc".endsWith("c"));
		System.out.println("abc".endsWith("bc"));
		
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("ab", "AB")); // ABcABc
		System.out.println("abcabc".replace("ab", "A")); // AcAc
		
		System.out.println("\t\r\fx   a b c\n".trim());  // a b c
		
		String result = "AniMaL   "
				.trim()
				.toLowerCase()
				.replace('a', 'A');
		System.out.println(result);

	}
}
