
public class Chick {
	static{
		System.out.println("static block");
	}
	{
		System.out.println("setting field...1");
	}
	private String name = "Fluffy";
	{
		System.out.println("setting field...2");
	}

	public Chick() {
		name = "Tiny";
		System.out.println("setting constructor");
	}

	public static void main(String[] args) {
		Chick chick = new Chick();
		System.out.println(chick.name);
		{
			System.out.println("setting field...en main");
		}
		Chick chick2 = new Chick();
	}
	{
		System.out.println("setting field...3");
	}
}
