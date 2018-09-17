package ocajavase8.chp03;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("animals");
		sb.insert(7, "-"); // sb = animals-
		//sb.insert(8, "-"); // invalido
		sb.insert(0, "-"); // sb = -animals-
		sb.insert(4, "-"); // sb = -ani-mals-
		System.out.println(sb);
		System.out.println(sb.reverse()); //sb = -slam-ina-
		
		StringBuilder sb0 = new StringBuilder();
		StringBuilder sb1 = new StringBuilder("animals");
		StringBuilder sb2 = new StringBuilder("animals");
		String str1 = "animals";
		System.out.println(str1.equals(sb1));
		System.out.println(sb1.equals(sb2));  //StringBuilder no implementa equals
	}
}
