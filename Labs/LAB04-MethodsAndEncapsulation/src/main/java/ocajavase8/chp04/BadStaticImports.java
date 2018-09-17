package ocajavase8.chp04;

//import static java.util.Arrays; // DOES NOT COMPILE
import static java.util.Arrays.asList;

//import java.util.Arrays;
//static import java.util.Arrays.*;  // DOES NOT COMPILE

public class BadStaticImports {
	public static void main(String[] args) {
		//Arrays.asList("one"); // DOES NOT COMPILE
		asList("one");
	}
}
