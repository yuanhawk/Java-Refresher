package DateTimeAPI;

public class DateTimeMethod {

	/* Older Versions of Java
	 * java.util.package - Date, Calendar, GregorianCalendar classes
	 * java.text.package - DateFormat / SimpleDateFormat classes
	 * 
	 * Not thread-safe (mutable), not intuitive, only restricted to Gregorian calendar
	 * 
	 * Java 8 >
	 * java.time.package
	 * 
	 * Thread-safe (immutable), support separate calendars (Lunar calendar)
	 * 
	 * Class: LocalDate - date only, LocalTime - time only, LocalDateTime - date + time
	 * Enum: Month -- JAN - DEC, DayOfWeek -- MON - SUN
	 * 
	 * now() - returns obj for current local date, time, or date/time
	 * of(parameter) - date: year, mon, day parameter
	 * 				time: hour, min, sec, nanosec (sec, nanosec defaulted to 0)
	 * 				date/time, specify all parameter
	 * parse(string) - date: YYYY-MM-DD
	 * 				time: HH:MM:SS.NNNNNNNNN
	 * 				date/time: date + "T" + time
	 * 
	 * getYear() - returns current year as integer
	 * getMonth() - returns current Months obj
	 * getMonthValue() - returns current month as integer
	 * getDayOfMonth() - returns current day of the month as integer
	 * getDayOfYear() - returns current day of the year as integer
	 * getDayOfWeek() - returns current day of the week as DayOfWeek obj
	 * getHour() - current hour as integer (24-hr format)
	 * getMinute() - current min of the hr as integer
	 * getSecond() - current second of the min as integer
	 * getNano() - current nanosec of the sec as integer
	 * 
	 * LocalDateTime class supports all the get methods
	 * LocalDate class supports only the get methods for dates
	 * LocalTime class supports only the get methods for time
	 * LocalDate, LocalTime and LocalDateTime obj are immutable, there are no corresponding set methods
	 * 
	 * isBefore(dateTime) - returns true/false if the date/time is before the other specified date or time
	 * isAfter(dateTime) - ... is after ...
	 * compareTo(dateTime) - returns neg value if before, 0 if equal, pos if after
	 * 
	 * withDayOfMonth(day) - returns an obj with day changed
	 * withDayOfYear(day) - returns an obj with month and day changed based of 1 - 365 days of a year
	 * withMonth(month) - returns a new obj with month changed
	 * withYear(year) - returns a new obj with year changed
	 * withHour(hour) - returns a new obj with hour changed
	 * withMinute(minute) - returns a new obj with min changed
	 * 
	 * plus(long, chronoUnit) - returns a new obj after adding the time
	 * minus(long, chronoUnit) - ... subtracting ...
	 * 
	 * ChronoUnit enums
	 * YEARS, MONTHS, WEEKS, DAYS, HOURS, MINUTES, SECONDS
	 * 
	 * plusWeeks(long) - returns a new obj after adding the weeks
	 * minusWeeks(long) - ... subtracting ...
	 * 
	 * java.time.format.DateTimeFormatter
	 * java.time.format.FormatStyle
	 * 
	 * ofLocalizedDate(dateStyle) - returns date, not time
	 * ofLocalizedTime(timeStyle) - returns time, not date
	 * ofLocalizedDateTime(dateTimeStyle) - returns date & time
	 * ofLocalizedDateTime(dateStyle, timeStyle) - returns different formatting styles for date & time
	 * 
	 * format(dateTime) - returns a String obj for formatted date/time
	 * 
	 * FormatStyle enums
	 * FormatStyle.SHORT - 10/31/15, 6:30PM
	 * FormatStyle.MEDIUM - Oct 31, 2015, 6:30:00 PM
	 * FormatStyle.LONG - October 31, 2015, DateTimeException
	 * FormatStyle.FULL - Saturday, October 31, 2015, DateTimeException
	 */
}
