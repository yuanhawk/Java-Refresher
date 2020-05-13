package DateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CurrentDate {
	
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now(); // Current Date in YYYY-MM-DD
		LocalTime currentTime = LocalTime.now(); // Current Time in HH:MM:SS.NNNNNNNNN
		LocalDateTime currentDateTime = LocalDateTime.now(); // Current Date-Time in date + "T" + time
		
		LocalDate halloween1 = LocalDate.of(2015, Month.OCTOBER, 31); // 2015-10-31
		LocalDate halloween2 = LocalDate.of(2015, 10, 31); // 2015-10-31
		
		LocalTime startTime1 = LocalTime.of(14, 32); // 14:32
		LocalTime startTime2 = LocalTime.of(14, 32, 45); // 14:32:45
		LocalTime startTime3 = LocalTime.of(14, 32, 45, 123456789); // 14:32:45.123456789

		
		LocalDateTime startDateTime = LocalDateTime.of(2015, 10, 31, 14, 32); // 2015-10-31T14:32
		
		LocalDate halloween3 = LocalDate.parse("2015-10-31"); // 2015-10-31
		LocalTime startTime4 = LocalTime.parse("02:32:45"); // 02:32:45
		LocalDateTime startDateTime2 = LocalDateTime.parse("2015-10-31T02:32:45.123456789"); // 2015-10-31T02:32:45.123456789

		// If values are out of range, methods will throw a DateTimeException
		
		//Assume current date/time of Oct 31, 2015 14:32:45.898000000
		int year = currentDateTime.getYear(); // 2015
		Month month = currentDateTime.getMonth(); // OCTOBER
		int monthValue = currentDateTime.getMonthValue(); // 10
		int day = currentDateTime.getDayOfMonth(); // 31
		
		int dayOfYear = currentDateTime.getDayOfYear(); // 304
		DayOfWeek dayOfWeek = currentDateTime.getDayOfWeek(); //SATURDAY
		
		int hour = currentDateTime.getHour(); // 14
		int minute = currentDateTime.getMinute(); // 32
		int second = currentDateTime.getSecond(); //45
		int nano = currentDateTime.getNano(); // 898000000
		
		LocalDate date = LocalDate.of(2015, 10, 20);
		LocalDate newDate = date.withDayOfMonth(5);
		System.out.println(newDate);
	}

}
