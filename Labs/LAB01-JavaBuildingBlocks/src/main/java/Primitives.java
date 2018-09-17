import java.beans.MethodDescriptor;

public class Primitives {
	char a;
	public static void main(String[] args) {
		System.out.println(5 + 7 + "--" + 7 + 8 );
		System.out.println("--" + 5 + 7);
		int var = 017;
		int var2 = 6;
		System.out.println("var:" + var);
		int óü_$u = 9;
		
		// a = 5;
		// metodo();
		Primitives p = new Primitives();
		System.out.println("P.a:[" + p.a + "]");
	}
	
	public void metodo() {
		a = 7;
	}
}
