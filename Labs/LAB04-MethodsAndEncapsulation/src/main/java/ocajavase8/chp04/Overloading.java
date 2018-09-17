package ocajavase8.chp04;

public class Overloading {
	public void fly(int i) {
		System.out.print("int ");
	}

	public void fly(long l) {
		System.out.print("long ");
	}
	
	public void glide(int i, int j) {
		System.out.println("1");
	}
	public void glide(long i, long j) {
		System.out.println("2");
	}
	public void glide(Integer i, Integer j) {
		System.out.println("3");
	}
	public void glide(int... i) {
		System.out.println("4");
	}
	public void glide(Integer... i) {
		System.out.println("5");
	}

	public static void main(String[] args) {
		Overloading p = new Overloading();
		p.fly(123);
		p.fly(123L);
		
		p.glide(1, 2);
	}

}
