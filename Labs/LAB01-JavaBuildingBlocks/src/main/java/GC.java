
public class GC {
	public static void main(String[] args) {
		new GC();
		GC gc = new GC();
		GC gc2 = gc;
		GC gc3 = new GC();
		// ----
		System.out.println("gc=" + gc);
		System.out.println("gc.hashcode=" + gc.hashCode());
		
		System.out.println("gc2=" + gc2);
		System.out.println("gc2.hashcode=" + gc2.hashCode());
	}
}
