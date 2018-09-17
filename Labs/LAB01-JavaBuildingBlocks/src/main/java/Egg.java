
public class Egg {
	{
		number = 2;
		//System.out.println(id);
	}
	private int id;
	public Egg() {
		number = 5;
	}

	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);
	}

	private int number;
	{
		System.out.println(number);
		number = 3;
		System.out.println(number);
		System.out.println(id);
	}
	//private int number = 3;
	//private int number;
	
}
