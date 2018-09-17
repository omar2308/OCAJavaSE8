package ocajavase8.chp04;

public class ArrVargsTest {
	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}
	
	public static void walk(int start) {
		System.out.println("echo " + start);
	}

	public static void main(String[] args) {
		walk(1); // 0
		walk(1, 2); // 1
		walk(1, 2, 3); // 2
		walk(1, new int[] { 4, 5 }); // 2
		walk(1, null);
		int[] arr = {2,3};
	}

}
