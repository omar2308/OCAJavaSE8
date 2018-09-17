package ocajavase8.chp04;

public class ModifiersTest {
	// No compila
	// String walk6(int a) { if (true) return ""; }

//	int longitud(){
//		return 9L; // DOES NOT COMPILE
//	}
	synchronized final public int metodo() {
		return 5;
	}
	
	public void metodovoid() {
		//return 5;
		return;
		//int r = 9;
	}
	
	public void metodovararg(int      ...arr) {
		//return 5;
		return;
	}
	
	public void metodovararg2(int var, int...arr) {
		//return 5;
		return;
	}
	public void invocarvararg() {
		int arr[] = {};
		metodovararg2(3);
		metodovararg2(3,2);
		metodovararg2(3,2,3,4);
		metodovararg2(3, new int[] {});
		metodovararg2(3, new int[] {1,2});
		metodovararg2(3, null);
		metodovararg2(3, arr);
		//metodovararg2(3, {1,2});
	}
}
