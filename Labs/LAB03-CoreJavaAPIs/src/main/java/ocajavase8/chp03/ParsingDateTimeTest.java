package ocajavase8.chp03;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDateTimeTest {
	public static void main(String[] args) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("01 02 2015", f);  // using custom format
		LocalTime time = LocalTime.parse("11:22");
		LocalDate date2 = LocalDate.parse("2015-01-02");
		//LocalDate date3 = LocalDate.parse("2015/01/02");   // error en formato-> No ISO
		System.out.println(date);          // 2015-01-02
		System.out.println(time);          // 11:22

	}
}
