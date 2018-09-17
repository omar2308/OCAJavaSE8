package ocajavase8.chp02;

public class Labels {
	public static void main(String[] args) {
		int[][] myComplexArray = { 
				{ 5, 2, 1, 3 }, 
				{ 3, 9, 8, 9 }, 
				{ 5, 7, 12, 7 } };
		OUTER_LOOP:
		for (int i = 0; i < myComplexArray.length; i++) {
			int[] mySimpleArray = myComplexArray[i];
			
			INNER_LOOP:
			for (int j = 0; j < mySimpleArray.length; j++) {
				System.out.print(mySimpleArray[j] + "\t");
				if(j == 2) {
					break OUTER_LOOP;
				}
			}
			System.out.println();
		}

	}
}
