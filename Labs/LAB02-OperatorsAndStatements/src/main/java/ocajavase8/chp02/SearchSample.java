package ocajavase8.chp02;

public class SearchSample {
	public static void main(String[] args) {
		char ca = (char)('c' - 'a');
		boolean ba = 'a' > 3.2;
		
		System.out.println("ca:[" + ca + "]");
		int[][] list = { { 1, 13, 5 }, { 1, 2, 5 }, { 2, 7, 2 } };
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					// break;
				}
			}
		}
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}
	}
}
