package ocajavase8.chp02;

public class TernaryOperator {
	public static void main(String[] args) {
		int y = 1;
		int z = 1;
		int x = y<10 ? y++ : z++;
		System.out.println("y=" + y + ",z=" + z + ",x=" + x); // Outputs 2,1
		x = y>=10 ? y++ : z++;
		System.out.println("y=" + y + ",z=" + z + ",x=" + x); 
		System.out.println(y+","+z); // Outputs 1,2

	}
}
