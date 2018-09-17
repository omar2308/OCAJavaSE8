package ocajavase8.chp03.preg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PregTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list);
		Integer array[] = list.toArray(new Integer[0]);
		//Number array[] = list.toArray(new Number[0]); //Tambien
		//Long array[] = list.toArray(new Long[0]); // NO
		System.out.println(array[0]);
	}
}
