package ocajavase8.chp03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimesTest {
	public static void main(String[] args) {
		System.out.println("----------------");
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		
		System.out.println("------------------- LocalDate");
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		System.out.println(date1);
		System.out.println(date2);
		
		System.out.println("------------------- LocalTime");
		LocalTime time1 =  LocalTime.of(6, 15);               // hour and minute
		LocalTime time2 =  LocalTime.of(6, 15, 30);          // + seconds
		LocalTime time3 =  LocalTime.of(6, 15, 30, 200);     // + nanoseconds
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		
		System.out.println("------------------- LocalDateTime");
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		
		System.out.println("------------------- Operations");
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date);          // 2014-01-20
		date = date.plusDays(2);
		System.out.println(date);          // 2014-01-22
		date = date.plusWeeks(1);
		System.out.println(date);          // 2014-01-29
		date = date.plusMonths(1);
		System.out.println(date);          // 2014-02-28
		date = date.plusYears(5);
		System.out.println(date);          // 2019-02-28
		
		System.out.println("--------------------- Chaining");
		date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		LocalDateTime dateTime3 = dateTime
		   .minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(dateTime);
		System.out.println(dateTime3);
	}
}
