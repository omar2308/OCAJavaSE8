package ocajavase8.chp02;

public class SwitchControl {
	public static void main(String[] args) {
		byte dayOfWeek = 1;
		final int cinco = 5;
		switch (dayOfWeek) {
		case cinco:
			System.out.println("5");
			//break;
		case (byte)130:  // probar con 130 sin cast
			System.out.println("Sunday");
		default:
			System.out.println("Weekday");
			//break;
		case 6:
			System.out.println("Saturday");
			
		
		}
		
		

	}
	
	public void metodo(final String option) {
		String dayOfWeekStr = "Monday";
		switch (dayOfWeekStr) {
		case "Monday":
			System.out.println("5");
			//break;
		case "Sunday":
			System.out.println("Sunday");
//		case 's':
//			System.out.println("Sunday");
		default:
			System.out.println("Weekday");
			//break;
//		case option:
//			System.out.println("Saturday");
		
		}
	}
}
